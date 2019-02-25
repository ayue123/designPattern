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

        /**
         * @return the to
         */
        public String getTo() {
                return to;
        }

        /**
         * @param to
         *                the to to set
         */
        public void setTo(String to) {
                this.to = to;
        }

        /**
         * @return the from
         */
        public String getFrom() {
                return from;
        }

        /**
         * @param from
         *                the from to set
         */
        public void setFrom(String from) {
                this.from = from;
        }

        /**
         * @return the subject
         */
        public String getSubject() {
                return subject;
        }

        /**
         * @param subject
         *                the subject to set
         */
        public void setSubject(String subject) {
                this.subject = subject;
        }

        /**
         * @return the body
         */
        public String getBody() {
                return body;
        }

        /**
         * @param body
         *                the body to set
         */
        public void setBody(String body) {
                this.body = body;
        }

        /**
         * @return the sendDate
         */
        public Date getSendDate() {
                return sendDate;
        }

        /**
         * @param sendDate
         *                the sendDate to set
         */
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
