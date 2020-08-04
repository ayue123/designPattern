/**
 * 
 */
package com.ayue.mementoPattern.patternThree;

import java.util.List;

/**
 * 2019年3月6日
 *
 * @author ayue
 *         备忘录角色
 */
public class Memento {

        private List<String> states;
        private int index;

        public Memento(List<String> states, int index) {
                this.states = states;
                this.index = index;
        }

        public List<String> getStates() {
                return states;
        }

        public int getIndex() {
                return index;
        }
}
