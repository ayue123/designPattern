/**
 * 
 */
package com.ayue.mediatorPattern;

/**
 * 2019年3月4日
 *
 * @author ayue
 */
public class SoundCard extends Colleague {

        public SoundCard(Mediator mediator) {
                super(mediator);
        }

        public void soundData(String data) {
                System.out.println("画外音:" + data);
        }

}
