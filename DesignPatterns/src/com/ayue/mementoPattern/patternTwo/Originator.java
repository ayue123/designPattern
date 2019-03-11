/**
 * 
 */
package com.ayue.mementoPattern.patternTwo;

/**
 * 2019年3月6日
 *
 * @author ayue
 *         发起人角色类
 */
public class Originator {
        private String state;

        public String getState() {
                return state;
        }

        public void setState(String state) {
                this.state = state;
                System.out.println("赋值状态：" + state);
        }

        //工厂方法，返回一个新的备忘录对象
        public Memento createMemento() {
                return new Memento(state);
        }

        //发起人恢复到备忘录对象记录的状态
        public void restoreMemento(MementoIF mementoIF) {
                this.state = ((Memento) mementoIF).getState();
        }

        //内部类，备忘录对象
        private class Memento implements MementoIF {
                private String state;

                public Memento(String state) {
                        this.state = state;
                }

                public String getState() {
                        return state;
                }

                public void setState(String state) {
                        this.state = state;
                }

        }
}
