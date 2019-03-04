/**
 * 
 */
package com.ayue.adapterPattern.interfaceAdapter;

/**
 * 2019年2月26日
 *
 * @author ayue
 */
public abstract class ServiceAdapter implements AbstractService {
        //抽象适配器类ServiceAdapter则为这三种方法都提供了平庸的实现。
        //因此，任何继承自抽象类ServiceAdapter的具体类都可以选择它所需要的方法实现，而不必理会其他的不需要的方法。
        @Override
        public void serviceOperationOne() {

        }

        @Override
        public int serviceOperationTwo() {
                return 0;
        }

        @Override
        public String serviceOperationThree() {
                return null;
        }

}
