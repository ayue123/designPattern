/**
 * 
 */
package com.ayue.proxyPattern;

/**
 * 2019年3月1日
 *
 * @author ayue
 */
public class ProxyObject extends AbstractObject {
        RealObject realObject = new RealObject();

        @Override
        public void operation() {
                //调用对象之前做些相关操作
                System.out.println("before");
                realObject.operation();
                //调用对象之后做些相关操作
                System.out.println("after");
        }

}
