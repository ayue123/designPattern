/**
 * 
 */
package com.ayue.iteratorPattern.whiteIterator;

/**
 * 2019年3月4日
 *
 * @author ayue
 *         抽象聚集角色类
 */
public abstract class Aggregate {
        //工厂方法，创建相应迭代子对象的接口
        public abstract Iterator createIterator();
}
