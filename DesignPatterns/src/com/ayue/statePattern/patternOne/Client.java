/**
 * 
 */
package com.ayue.statePattern.patternOne;

/**
 * 2019年3月8日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                //环境类Context的行为request()是委派给某一个具体状态类的。通过使用多态性原则，可以动态改变环境类Context的属性State的内容，
                //使其从指向一个具体状态类变换到指向另一个具体状态类，从而使环境类的行为request()由不同的具体状态类来执行。
                //改变内部状态改变其行为
                //创建状态
                State state = new ConcreteStateA();
                //创建环境
                Context context = new Context();
                context.setState(state);
                context.request("test");
        }
}
