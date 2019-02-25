/**
 * 
 */
package com.ayue.factoryMethodPattern;

/**
 * 2019年2月21日
 *
 * @author ayue
 */
public class SenderFactory {

        public Sender produceMail() {
                return new MailSender();
        }

        public Sender produceSms() {
                return new SmsSender();
        }
}
