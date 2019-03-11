/**
 * 
 */
package com.ayue.visitorPattern.patternTwo;

/**
 * 2019年3月11日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                //变量h的静态类型是Horse，而真实类型是BlackHorse。
                //Java编译器在编译时期并不总是知道哪些代码会被执行，
                //因为编译器仅仅知道对象的静态类型，而不知道对象的真实类型；而方法的调用则是根据对象的真实类型，而不是静态类型。
                Horse h = new BlackHorse();
                h.eat();
        }
}
