/**
 * 
 */
package com.ayue.mementoPattern.patternOne;

/**
 * 2019年3月6日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {

                Originator originator = new Originator();
                Caretaker caretaker = new Caretaker();
                //改变发起人的状态
                originator.setState("On");
                //创建备忘录对象，将发起人对象的状态储存起来
                caretaker.saveMemento(originator.createMemento());
                //修改发起人状态
                originator.setState("off");
                //恢复发起人状态
                originator.restoreMemento(caretaker.retrieveMemento());
                System.out.println(originator.getState());
        }
}
