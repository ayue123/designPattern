package com.ayue.staticFactoryPattern;

/**
 * 2020年7月28日
 *
 * @author ayue
 */
public class MailSender implements Sender {
        @Override
        public void Send() {
                System.out.println("this is mailsender!");
        }
}
