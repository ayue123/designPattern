/**
 * 
 */
package com.ayue.mementoPattern.patternFour;

/**
 * 2019年3月6日
 *
 * @author ayue
 *         发起人同时还兼任负责人角色，自己负责保持自己的备忘录对象
 */
public class Originator {
        public String state;
        public Memento memento;

        public void changeState(String state) {
                this.state = state;
                System.out.println("装态改变为：" + state);
        }

        //创建一个备忘录角色
        public Memento createMemento() {
                this.memento = new Memento(this);
                return memento;
        }

        //将发起人恢复到备忘录对象所记录的状态上
        public void restoreMemento(Memento memento) {
                this.state = memento.getState();
        }

        //内部类，备忘录角色
        private class Memento implements MementoIF {
                private String state;

                public Memento(Originator o) {
                        super();
                        this.state = o.state;
                }

                private String getState() {
                        return state;
                }
        }
}
