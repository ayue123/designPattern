/**
 * 
 */
package com.ayue.statePattern.patternOne;

/**
 * 2019年3月8日
 *
 * @author ayue
 */
public class ConcreteStateB implements State {
        @Override
        public void handle(String sampleParameter) {
                System.out.println("ConcreteStateB handle:" + sampleParameter);
        }
}
