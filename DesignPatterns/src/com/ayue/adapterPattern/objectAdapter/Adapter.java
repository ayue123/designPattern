/**
 * 
 */
package com.ayue.adapterPattern.objectAdapter;

/**
 * 2019年2月26日
 *
 * @author ayue
 */
public class Adapter implements Target {
        private Adaptee adaptee;

        public Adapter(Adaptee adaptee) {
                this.adaptee = adaptee;
        }

        // 源类Adaptee中有sampleOperationOne方法，适配器类中直接委派就行
        @Override
        public void sampleOperationOne() {
                this.adaptee.sampleOperationOne();
        }

        // 源类Adaptee中没有sampleOperationOne方法，适配器类中补上
        @Override
        public void sampleOperationTwo() {
                System.out.println("sampleOperationTwo");
        }
}
