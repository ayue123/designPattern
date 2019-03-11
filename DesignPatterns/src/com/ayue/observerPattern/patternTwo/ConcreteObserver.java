/**
 * 
 */
package com.ayue.observerPattern.patternTwo;

/**
 * 2019年3月7日
 *
 * @author ayue
 *         具体观察者对象角色
 */
public class ConcreteObserver implements Observer {
        //观察者的状态
        private String observerState;

        @Override
        public void update(Subject subject) {
                observerState = ((ConcreteSubject) subject).getState();
                System.out.println("观察者对象状态为：" + observerState);
        }
}
