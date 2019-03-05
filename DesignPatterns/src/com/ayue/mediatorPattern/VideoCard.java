/**
 * 
 */
package com.ayue.mediatorPattern;

/**
 * 2019年3月4日
 *
 * @author ayue
 */
public class VideoCard extends Colleague {

        public VideoCard(Mediator mediator) {
                super(mediator);
        }

        public void showData(String data) {
                System.out.println("正在看：" + data);
        }
}
