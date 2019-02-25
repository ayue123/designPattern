/**
 * 
 */
package com.ayue.abstractFactoryPattern;

/**
 * 2019年2月21日
 *
 * @author ayue
 */
public class AmdFactory implements AbstractFactory {

        @Override
        public Cpu creatCpu() {
                return new AmdCpu();
        }

        @Override
        public Mainboard creatMainboard() {
                return new AmdMainBoard();
        }

}
