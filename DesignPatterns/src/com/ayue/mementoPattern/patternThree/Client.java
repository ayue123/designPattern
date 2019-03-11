/**
 * 
 */
package com.ayue.mementoPattern.patternThree;

/**
 * 2019年3月6日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                //创建发起者和负责者
                Originator o = new Originator();
                Caretaker c = new Caretaker(o);
                o.setState("state 0");
                c.createMemento();
                o.setState("state 1");
                c.createMemento();
                o.setState("state 2");
                c.createMemento();
                o.setState("state 3");
                c.createMemento();
                o.printStates();
                System.out.println("---------------恢复检查点");
                //恢复到第二个检查点
                c.restoreMemento(2);
                o.printStates();
        }
}
