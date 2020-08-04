/**
 * 
 */
package com.ayue.commandPattern.exampleOne;

/**
 * 2019年3月2日
 *
 * @author ayue
 *         具体命令角色类
 */
public class ConcreteCommand implements Command {
        //持有相应接收者对象
        private Receiver receiver = null;

        public ConcreteCommand(Receiver receiver) {
                this.receiver = receiver;
        }

        @Override
        public void execute() {
                //通常会让接收者真正的执行功能
                receiver.action();
        }
}
