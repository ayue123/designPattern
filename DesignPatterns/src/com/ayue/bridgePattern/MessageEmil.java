/**
 * 
 */
package com.ayue.bridgePattern;

/**
 * 2019年2月27日
 *
 * @author ayue 邮件短消息实现类
 */
public class MessageEmil implements MessageImplementor {
        @Override
        public void send(String message, String toUser) {
                System.out.println("邮件短消息实现类" + message + "给" + toUser);
        }
}
