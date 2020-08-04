/**
 * 
 */
package com.ayue.bridgePattern;

/**
 * 2019年2月27日
 *
 * @author ayue
 */
public class CommonMessage extends AbstractMessage {
        public CommonMessage(MessageImplementor impl) {
                super(impl);
        }

        // 对于普通消息，直接调用父类的方法，发送消息即可
        @Override
        public void sendMessage(String message, String toUser) {
                super.sendMessage(message, toUser);
        }
}
