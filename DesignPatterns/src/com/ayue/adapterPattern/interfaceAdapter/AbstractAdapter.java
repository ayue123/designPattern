/**
 * 
 */
package com.ayue.adapterPattern.interfaceAdapter;

/**
 * 2019年2月26日
 *
 * @author ayue
 */
public abstract class AbstractAdapter implements AbstractInterface {
        // 抽象适配器类AbstractAdapter则为这三种方法都提供了平庸的实现。
        // 因此，任何继承自抽象类AbstractInterface的具体类都可以选择它所需要的方法实现，而不必理会其他的不需要的方法。
        @Override
        public void operationOne() {
        }

        @Override
        public void operationTwo() {
        }

        @Override
        public void operationThree() {
        }
}
