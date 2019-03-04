/**
 * 
 */
package com.ayue.commandPattern.exampleOne;

/**
 * 2019年3月2日
 *
 * @author ayue
 *         请求者角色类
 */
public class Invoker {
        //持有命令对象
        private Command commond = null;

        public Invoker(Command commond) {
                this.commond = commond;
        }

        //行动方法
        public void action() {
                commond.execute();
        }

}
