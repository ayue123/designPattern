/**
 * 
 */
package com.ayue.commandPattern.exampleTwo;

/**
 * 2019年3月2日
 *
 * @author ayue
 *         具体命令角色
 */
public class PlayerCommand implements Command {
        //持有接收者对象
        private AudioPlayer audioPlayer;

        public PlayerCommand(AudioPlayer audioPlayer) {
                this.audioPlayer = audioPlayer;
        }

        @Override
        public void execute() {
                audioPlayer.player();
        }

}
