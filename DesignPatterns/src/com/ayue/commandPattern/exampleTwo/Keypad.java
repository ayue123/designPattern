/**
 * 
 */
package com.ayue.commandPattern.exampleTwo;

/**
 * 2019年3月2日
 *
 * @author ayue
 *         请求者角色
 */
public class Keypad {
        //持有命令者对象
        private Command playerCommand;
        private Command rewindCommand;
        private Command stopCommand;

        public void setPlayerCommand(Command playerCommand) {
                this.playerCommand = playerCommand;
        }

        public void setRewindCommand(Command rewindCommand) {
                this.rewindCommand = rewindCommand;
        }

        public void setStopCommand(Command stopCommand) {
                this.stopCommand = stopCommand;
        }

        //执行方法
        public void player() {
                playerCommand.execute();
        }

        public void rewind() {
                rewindCommand.execute();
        }

        public void stop() {
                stopCommand.execute();
        }

}
