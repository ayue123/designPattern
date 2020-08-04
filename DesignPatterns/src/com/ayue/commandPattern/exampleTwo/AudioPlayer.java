/**
 * 
 */
package com.ayue.commandPattern.exampleTwo;

/**
 * 2019年3月2日
 *
 * @author ayue
 *         接收者角色
 */
public class AudioPlayer {
        public void player() {
                System.out.println("播放");
        }

        public void rewind() {
                System.out.println("倒带");
        }

        public void stop() {
                System.out.println("停止");
        }

}
