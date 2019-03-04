/**
 * 
 */
package com.ayue.bridgePattern;

/**
 * 2019年2月27日
 *
 * @author ayue
 *         抽象消息类
 */
public abstract class AbstractMessage {
        //持有一个实现部分的对象
        MessageImplementor impl;

        public AbstractMessage(MessageImplementor impl) {
                this.impl = impl;
        }

        //发送消息，委派给实现部分的方法
        public void sendMessage(String message, String toUser) {
                this.impl.send(message, toUser);
        }

}
