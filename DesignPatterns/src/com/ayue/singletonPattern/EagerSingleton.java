/**
 * 
 */
package com.ayue.singletonPattern;

/**
 * 2019年2月25日
 *
 * @author ayue
 */
public class EagerSingleton {
        //饿汉式单例
        //在创建对象实例的时候就比较着急，饿了嘛，于是在装载类的时候就创建对象实例。
        //典型的空间换时间，当类装载的时候就会创建类的实例，不管你用不用，先创建出来，然后每次调用的时候，就不需要再判断，节省了运行时间。
        private static EagerSingleton instance = new EagerSingleton();

        //私有构造,防止被实例化
        private EagerSingleton() {

        }

        public static EagerSingleton getInstance() {
                return instance;
        }
}
