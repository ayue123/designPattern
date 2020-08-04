/**
 * 
 */
package com.ayue.observerPattern.patternTwo;

/**
 * 2019年3月7日
 *
 * @author ayue
 *         具体主题类
 */
public class ConcreteSubject extends Subject {
        private String state;

        public String getState() {
                return state;
        }

        public void change(String newState) {
                state = newState;
                System.out.println("主题状态为：" + newState);
                this.nodifyObservers();
        }
}
