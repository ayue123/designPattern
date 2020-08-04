/**
 * 
 */
package com.ayue.mementoPattern.patternFour;

/**
 * 2019年3月6日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                Originator o = new Originator();
                //修改状态
                o.changeState("state 0");
                //创建备忘录
                o.createMemento();
                //修改状态
                o.changeState("state 1");
                //按照备份恢复
                o.restoreMemento(o.memento);
                System.out.println(o.state);
        }
}
