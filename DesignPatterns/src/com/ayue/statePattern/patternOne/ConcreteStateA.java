/**
 * 
 */
package com.ayue.statePattern.patternOne;

/**
 * 2019年3月8日
 *
 * @author ayue
 *         具体状态类
 */
public class ConcreteStateA implements State {
        @Override
        public void handle(String sampleParameter) {
                System.out.println("ConcreteStateA handler:" + sampleParameter);
        }
}
