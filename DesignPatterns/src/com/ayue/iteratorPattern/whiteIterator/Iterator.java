/**
 * 
 */
package com.ayue.iteratorPattern.whiteIterator;

/**
 * 2019年3月4日
 *
 * @author ayue
 *         抽象迭代子角色类
 */
public interface Iterator {
        public void first();

        public void next();

        //是否为最后一个
        public boolean isDone();

        //返回当前元素
        public Object currentItem();
}
