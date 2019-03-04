/**
 * 
 */
package com.ayue.facadePattern;

/**
 * 2019年2月27日
 *
 * @author ayue
 */
public class Modulefaced {
        //可以有效地屏蔽内部的细节，免得客户端去调用Module类时，发现一些不需要它知道的方法。
        ModuleA a = new ModuleA();
        ModuleB b = new ModuleB();
        ModuleC c = new ModuleC();

        public void a1() {
                a.a1();
        }

        public void b1() {
                b.b1();
        }

        public void c1() {
                c.c1();
        }

}
