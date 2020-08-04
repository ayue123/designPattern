/**
 * 
 */
package com.ayue.commandPattern.exampleTwo;

/**
 * 2019年3月2日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                //创建接收者对象
                AudioPlayer audioPlayer = new AudioPlayer();
                //创建命令者对象
                Command playerCommand = new PlayerCommand(audioPlayer);
                Command rewindCommand = new RewindCommand(audioPlayer);
                Command stopCommand = new StopCommand(audioPlayer);
                //创建请求者对象
                Keypad keypad = new Keypad();
                keypad.setPlayerCommand(playerCommand);
                keypad.setRewindCommand(rewindCommand);
                keypad.setStopCommand(stopCommand);
                //执行
                keypad.player();
                keypad.rewind();
                keypad.stop();

                //将命令添加到宏命令中，并执行
                MacroCommand macro = new MacroAudioCommand();
                macro.add(playerCommand);
                macro.add(rewindCommand);
                macro.add(stopCommand);
                macro.execute();

        }
}
