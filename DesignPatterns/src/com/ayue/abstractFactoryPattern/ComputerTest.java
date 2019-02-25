/**
 * 
 */
package com.ayue.abstractFactoryPattern;

/**
 * 2019年2月21日
 *
 * @author ayue
 */
public class ComputerTest {
        public static void main(String[] args) {
                ComputerEngineer ce = new ComputerEngineer();
                //抽象工厂的功能是为一系列相关对象或相互依赖的对象创建一个接口
                //一个工作族一个工厂类
                AbstractFactory af = new IntelFactory();
                //通过创建不同的工厂类来创建不同工作组的对象
                ce.assembly(af);
        }
}
