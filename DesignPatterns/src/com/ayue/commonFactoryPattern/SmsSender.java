package com.ayue.commonFactoryPattern;

/**
 * 2020年7月28日
 *
 * @author ayue
 */
public class SmsSender implements Sender {
        @Override
        public void Send() {
                System.out.println("this is sms sender!");
        }
}
