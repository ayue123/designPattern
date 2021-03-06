/**
 * 
 */
package com.ayue.flyweightPattern.complexPattern;

/**
 * 2019年3月1日
 *
 * @author ayue 具体享元类
 */
public class ConcreteFlyweight implements Flyweight {
        private Character intrinsicState = null;

        // 内蕴状态作为参数传入
        public ConcreteFlyweight(Character intrinsicState) {
                this.intrinsicState = intrinsicState;
        }

        // 外蕴状态作为参数传入方法，改变方法的行为，
        // 但并不会改变对象的内蕴状态
        @Override
        public void operation(String state) {
                System.out.println("Intrinsic State = " + this.intrinsicState);
                System.out.println("Extrinsic State = " + state);
        }
}
