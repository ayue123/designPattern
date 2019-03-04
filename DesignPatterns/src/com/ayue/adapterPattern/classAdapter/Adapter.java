/**
 * 
 */
package com.ayue.adapterPattern.classAdapter;

/**
 * 2019年2月26日
 *
 * @author ayue
 *         适配器角色
 */
public class Adapter extends Adaptee implements Target {

        //源角色Adaptee中没有sampleOperationTwo方法，，故在适配器角色中补上
        @Override
        public void sampleOperationTwo() {
                System.out.println("sampleOperationTwo");
        }

}
