/**
 * 
 */
package com.ayue.observerPattern.patternOne;

/**
 * 2019年3月6日
 *
 * @author ayue
 *         具体（主题对象）被观察者对象
 */
public class ConcreteSubject extends Subject {

        private String state;

        /**
         * @return the state
         */
        public String getState() {
                return state;
        }

        public void change(String newState) {
                state = newState;
                System.out.println("主题状态为：" + newState);
                this.nodifyObservers(newState);
        }
}
