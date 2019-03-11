/**
 * 
 */
package com.ayue.mementoPattern.patternOne;

/**
 * 2019年3月6日
 *
 * @author ayue
 *         负责人对象，负责保存备忘录对象，但从不修改备忘录对象的内容
 */
public class Caretaker {

        private Memento memento;

        //备忘录取值方法
        public Memento retrieveMemento() {
                return this.memento;
        }

        //备忘录的赋值
        public void saveMemento(Memento memento) {
                this.memento = memento;
        }

}
