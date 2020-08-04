package com.ayue.staticFactoryPattern;

/**
 * 2020年7月28日
 *
 * @author ayue
 */
public class SendFactory {
        public static Sender produceMail() {
                return new MailSender();
        }

        public static Sender produceSms() {
                return new SmsSender();
        }
}
