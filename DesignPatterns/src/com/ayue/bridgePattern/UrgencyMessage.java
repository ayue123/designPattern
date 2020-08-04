/**
 * 
 */
package com.ayue.bridgePattern;

/**
 * 2019年2月27日
 *
 * @author ayue
 */
public class UrgencyMessage extends AbstractMessage {
        public UrgencyMessage(MessageImplementor impl) {
                super(impl);
        }

        // 加急消息添加其他处理
        @Override
        public void sendMessage(String message, String toUser) {
                message = "加急" + message;
                super.sendMessage(message, toUser);
        }

        // 扩展自己的新功能
        public Object watch(String messageId) {
                return null;
        }
}
