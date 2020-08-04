/**
 * 
 */
package com.ayue.bridgePattern;

/**
 * 2019年2月27日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                //采用桥梁模式来实现，抽象部分和实现部分分离开了，可以相互独立的变化，而不会相互影响。
                //因此在抽象部分添加新的消息处理（特急消息），对发送消息的实现部分是没有影响的；
                //反过来增加发送消息的方式（手机短消息），对消息处理部分也是没有影响的。
                //抽象消息类就像一个桥，持有具体实现部分的接口，达到对具体实现类的调用

                //创建具体实现类
                MessageImplementor impl = new MessageSMS();
                //创建普通消息对象
                AbstractMessage message = new CommonMessage(impl);
                message.sendMessage("加班申请", "李总");

                //实现方式改为邮件，再次发送
                impl = new MessageEmil();
                //创建加急消息对象
                message = new UrgencyMessage(impl);
                message.sendMessage("加班申请", "李总");
        }
}
