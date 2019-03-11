/**
 * 
 */
package com.ayue.commandPattern.exampleTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * 2019年3月4日
 *
 * @author ayue
 *         具体宏命令类
 */
public class MacroAudioCommand implements MacroCommand {
        private List<Command> commandList = new ArrayList<Command>();

        @Override
        public void execute() {
                for (Command command : commandList) {
                        command.execute();
                }

        }

        @Override
        public void add(Command command) {
                commandList.add(command);
        }

        @Override
        public void remove(Command command) {
                commandList.remove(command);
        }

}
