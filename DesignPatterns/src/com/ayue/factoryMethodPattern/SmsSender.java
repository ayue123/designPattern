/**
 * 
 */
package com.ayue.factoryMethodPattern;

/**
 * 2019年2月21日
 *
 * @author ayue
 */
public class SmsSender implements Sender {
        @Override
        public void send() {
                System.out.println("smsSewnder");
        }
}
