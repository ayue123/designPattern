/**
 * 
 */
package com.ayue.factoryMethodPattern;

/**
 * 2019年2月21日
 *
 * @author ayue
 */
public class SenderTest {
        public static void main(String[] args) {
                SenderFactory factory = new SenderFactory();
                // 通过调用不同的方法来实现不同对象的创建
                Sender sender1 = factory.produceMail();
                sender1.send();
                Sender sender2 = factory.produceSms();
                sender2.send();
        }
}
