/**
 * 
 */
package com.ayue.factoryMethodPattern;

/**
 * 2019年2月21日
 *
 * @author ayue
 */
public class MailSender implements Sender {

        @Override
        public void send() {
                System.out.println("mailSender");
        }

}
