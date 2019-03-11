/**
 * 
 */
package com.ayue.mementoPattern.patternOne;

/**
 * 2019年3月6日
 *
 * @author ayue
 *         备忘录角色类，备忘录对象将发起人对象传入的状态存储起来
 */
public class Memento {
        private String state;

        public Memento(String state) {
                super();
                this.state = state;
        }

        public String getState() {
                return state;
        }

        public void setState(String state) {
                this.state = state;
        }

}
