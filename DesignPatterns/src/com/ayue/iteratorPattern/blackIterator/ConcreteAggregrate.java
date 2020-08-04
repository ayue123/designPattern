/**
 * 
 */
package com.ayue.iteratorPattern.blackIterator;

/**
 * 2019年3月4日
 *
 * @author ayue 具体聚集对象类
 */
public class ConcreteAggregrate extends Aggregate {
        private Object[] objArray = null;

        public ConcreteAggregrate(Object[] objArray) {
                this.objArray = objArray;
        }

        @Override
        public Iterator createIterator() {
                return new ConcreteIterator();
        }

        // 内部成员类，具体迭代子类
        private class ConcreteIterator implements Iterator {
                // 内部索引
                private int index = 0;
                // 记录当前聚集对象的大小
                private int size = 0;

                public ConcreteIterator() {
                        this.size = objArray.length;
                        index = 0;
                }

                @Override
                public void first() {
                        index = 0;

                }

                @Override
                public void next() {
                        if (index < size) {
                                index++;
                        }
                }

                @Override
                public boolean isDone() {
                        return (index >= size);
                }

                @Override
                public Object currentItem() {
                        return objArray[index];
                }

        }

}
