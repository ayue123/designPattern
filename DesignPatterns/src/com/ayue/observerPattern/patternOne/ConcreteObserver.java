/**
 * 
 */
package com.ayue.observerPattern.patternOne;

/**
 * 2019年3月6日
 *
 * @author ayue
 *         具体观察者角色类
 */
public class ConcreteObserver implements Observe {
        //观察者的状态
        private String observerState;

        @Override
        public void update(String state) {
                //更新观察者状态，使其与目标保持一致
                observerState = state;
                System.out.println("观察者状态为：" + observerState);
        }
}
