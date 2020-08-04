/**
 * 
 */
package com.ayue.bridgePattern;

/**
 * 2019年2月27日
 *
 * @author ayue
 *         发送消息的统一接口
 */
public interface MessageImplementor {
        public void send(String message, String toUser);
}
