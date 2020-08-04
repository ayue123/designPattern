/**
 * 
 */
package com.ayue.flyweightPattern.simplePattern;

/**
 * 2019年3月1日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                FlyweighFactory factory = new FlyweighFactory();
                Flyweight fly = factory.factory(new Character('a'));
                fly.operation("First Call");

                fly = factory.factory(new Character('b'));
                fly.operation("Second Call");

                fly = factory.factory(new Character('a'));
                fly.operation("Third Call");
                //虽然客户端申请了三个享元对象，但是实际创建的享元对象只有两个
        }
}
