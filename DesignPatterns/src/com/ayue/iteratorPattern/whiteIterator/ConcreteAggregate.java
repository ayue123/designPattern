/**
 * 
 */
package com.ayue.iteratorPattern.whiteIterator;

/**
 * 2019年3月4日
 *
 * @author ayue
 *         具体聚集角色类
 */
public class ConcreteAggregate extends Aggregate {
        //聚合对象数组
        private Object[] objArray = null;

        public ConcreteAggregate(Object[] objArray) {
                this.objArray = objArray;
        }

        //创建相应迭代子对象
        @Override
        public Iterator createIterator() {
                return new ConcreteIterator(this);
        }

        public Object getElement(int index) {
                if (index < objArray.length) {
                        return objArray[index];
                }
                return null;
        }

        public int size() {
                return objArray.length;
        }

}
