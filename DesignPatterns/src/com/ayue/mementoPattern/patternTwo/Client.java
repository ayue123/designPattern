/**
 * 
 */
package com.ayue.mementoPattern.patternTwo;

/**
 * 2019年3月6日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                Originator originator = new Originator();
                Caretaker caretaker = new Caretaker();
                //修改发起人对象状态
                originator.setState("ON");
                //创建备忘录对象，并将发起人对象储存起来，并将备忘录对象的接口储存到负责人对象中
                caretaker.saveMementoIF(originator.createMemento());

                originator.setState("off");
                //恢复发起人对象状态，负责人取到的只是备忘录对象的接口，无法读出此对象的内部状态
                originator.restoreMemento(caretaker.retrieveMementoIF());
                System.out.println(originator.getState());
        }
}
