/**
 * 
 */
package com.ayue.commandPattern.exampleTwo;

/**
 * 2019年3月4日
 *
 * @author ayue
 *         宏命令接口
 */
public interface MacroCommand extends Command {

        public void add(Command command);

        /**
         * 
         */
        public void remove(Command command);
}
