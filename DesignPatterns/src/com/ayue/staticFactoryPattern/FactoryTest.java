package com.ayue.staticFactoryPattern;

/**
 * 2020年7月28日
 *
 * @author ayue
 */
public class FactoryTest {
        public static void main(String[] args) {
                Sender sender = SendFactory.produceMail();
                sender.Send();
        }
}
