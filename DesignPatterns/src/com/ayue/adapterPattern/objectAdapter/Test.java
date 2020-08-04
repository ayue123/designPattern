/**
 * 
 */
package com.ayue.adapterPattern.objectAdapter;

/**
 * 2019年2月26日
 *
 * @author ayue
 */
public class Test {
        public static void main(String[] args) {
                //适配器直接持有源类对象，源类有的方法直接委派即可，没有实现的再实现就行
                //目标接口Target的实现类就具有了源类的功能
                Adaptee adaptee = new Adaptee();
                Target target = new Adapter(adaptee);
                target.sampleOperationOne();
                target.sampleOperationTwo();
        }
}
