/**
 * 
 */
package com.ayue.builderPattern.easyObject;

import java.util.Date;

/**
 * 2019年2月22日
 *
 * @author ayue
 */
public abstract class Builder {
        protected AutoMessage msg;

        public abstract void buildSubject();

        public abstract void buildBody();

        public void buildTo(String to) {
                msg.setTo(to);
        }

        public void buildFrom(String from) {
                msg.setFrom(from);
        }

        public void buildSendDate() {
                msg.setSendDate(new Date());
        }

        public void sendMessage() {
                msg.send();
        }
}
