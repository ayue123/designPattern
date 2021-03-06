/**
 * 
 */
package com.ayue.iteratorPattern.blackIterator;

/**
 * 2019年3月4日
 *
 * @author ayue
 */
public class Client {
        public void operation() {
                Object[] objArray = { "One", "Two", "Three", "Four", "Five", "Six" };
                //创建聚合对象
                Aggregate agg = new ConcreteAggregrate(objArray);
                //创建迭代子类
                Iterator it = agg.createIterator();
                while (!it.isDone()) {
                        System.out.println(it.currentItem());
                        it.next();
                }
        }

        public static void main(String[] args) {
                Client client = new Client();
                client.operation();
        }
}
