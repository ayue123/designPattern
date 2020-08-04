/**
 * 
 */
package com.ayue.mementoPattern.patternThree;

import java.util.ArrayList;
import java.util.List;

/**
 * 2019年3月6日
 *
 * @author ayue
 *         负责人角色
 */
public class Caretaker {
        //持有发起者对象
        private Originator o;
        private List<Memento> mementos = new ArrayList<Memento>();

        public Caretaker(Originator o) {
                this.o = o;
        }

        //创建一个新的检查点
        public void createMemento() {
                Memento memento = o.createMemento();
                mementos.add(memento);
        }

        //将发起人恢复到某个检查点
        public void restoreMemento(int index) {
                Memento memento = mementos.get(index);
                o.restoreMemento(memento);
        }

        //删除某个节点
        public void removeMemento(int index) {
                mementos.remove(index);
        }

}
