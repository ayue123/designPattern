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
public abstract class AutoMessage {
        private String to;
        private String from;
        private String subject;
        private String body;
        private Date sendDate;

        public String getTo() {
                return to;
        }

        public void setTo(String to) {
                this.to = to;
        }

        public String getFrom() {
                return from;
        }

        public void setFrom(String from) {
                this.from = from;
        }

        public String getSubject() {
                return subject;
        }

        public void setSubject(String subject) {
                this.subject = subject;
        }

        public String getBody() {
                return body;
        }

        public void setBody(String body) {
                this.body = body;
        }

        public Date getSendDate() {
                return sendDate;
        }

        public void setSendDate(Date sendDate) {
                this.sendDate = sendDate;
        }

        public void send() {
                System.out.println(to);
                System.out.println(from);
                System.out.println(subject);
                System.out.println(body);
                System.out.println(sendDate);
        }
}
