/**
 * 
 */
package com.ayue.proxyPattern;

/**
 * 2019年3月1日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                //代理对象将客户端的调用委派给目标对象，在调用目标对象的方法之前跟之后都可以执行特定的操作。
                AbstractObject obj = new ProxyObject();
                obj.operation();
        }
}
