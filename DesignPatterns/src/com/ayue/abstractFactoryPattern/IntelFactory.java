/**
 * 
 */
package com.ayue.abstractFactoryPattern;

/**
 * 2019年2月21日
 *
 * @author ayue
 */
public class IntelFactory implements AbstractFactory {
        @Override
        public Cpu creatCpu() {
                return new IntelCpu();
        }

        @Override
        public Mainboard creatMainboard() {
                return new IntelMainboard();
        }
}
