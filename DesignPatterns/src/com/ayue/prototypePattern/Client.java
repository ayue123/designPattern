/**
 * 
 */
package com.ayue.prototypePattern;

/**
 * 2019年2月25日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                try {
                        Prototype p1 = new ConcretePrototypeOne();
                        PrototypeManager.setPrototype("p1", p1);
                        //获取原型，调用克隆方法来创建对象，无需再通过new来创建
                        Prototype p3 = PrototypeManager.getPrototype("p1").clone();
                        p3.setName("p3");
                        System.out.println("第一个实例：" + p3);
                        //动态切换实现
                        Prototype p2 = new ConcretePrototypeTwo();
                        PrototypeManager.setPrototype("p1", p2);
                        Prototype p4 = PrototypeManager.getPrototype("p1").clone();
                        p4.setName("p4");
                        System.out.println("第二个实例：" + p4);
                        //注销该原型
                        PrototypeManager.removePrototype("p1");
                        Prototype p5 = PrototypeManager.getPrototype("p1").clone();
                        p5.setName("p5");
                        System.out.println("第三个实例：" + p5);
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}
