/**
 * 
 */
package com.ayue.adapterPattern.classAdapter;

/**
 * 2019年2月26日
 *
 * @author ayue
 */
public class Test {
        public static void main(String[] args) {
                // 源类Adaptee只实现了sampleOperationOne
                // 适配器Adapter实现了sampleOperationTwo
                // 目标接口Target的实现类就具有了源类和适配器的功能
                Target target = new Adapter();
                target.sampleOperationOne();
                target.sampleOperationTwo();
        }
}
