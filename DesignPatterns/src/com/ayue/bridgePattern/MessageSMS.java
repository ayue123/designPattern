
/**
 * 
 */
package com.ayue.bridgePattern;

/**
 * 2019年2月27日
 *
 * @author ayue 系统内短消息实现类
 */
public class MessageSMS implements MessageImplementor {
        @Override
        public void send(String message, String toUser) {
                System.out.println("系统内短消息实现类" + message + "给" + toUser);
        }
}
