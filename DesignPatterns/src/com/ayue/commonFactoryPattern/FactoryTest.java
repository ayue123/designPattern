package com.ayue.commonFactoryPattern;

/**
 * 2020年7月28日
 *
 * @author ayue
 */
public class FactoryTest {
        public static void main(String[] args) {
                SendFactory factory = new SendFactory();
                Sender sender = factory.produce("sms");
                sender.Send();
        }
}
