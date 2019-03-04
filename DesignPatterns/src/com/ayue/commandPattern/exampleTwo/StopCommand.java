/**
 * 
 */
package com.ayue.commandPattern.exampleTwo;

/**
 * 2019年3月2日
 *
 * @author ayue
 */
public class StopCommand implements Command {

        //持有接收者对象
        private AudioPlayer audioPlayer;

        public StopCommand(AudioPlayer audioPlayer) {
                this.audioPlayer = audioPlayer;
        }

        @Override
        public void execute() {
                audioPlayer.stop();
        }

}
