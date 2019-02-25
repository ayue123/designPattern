/**
 * 
 */
package com.ayue.abstractFactoryPattern;

/**
 * 2019年2月21日
 *
 * @author ayue
 */
public class ComputerEngineer {

        public void assembly(AbstractFactory af) {
                Cpu cpu = af.creatCpu();
                Mainboard mainboard = af.creatMainboard();

                cpu.calculator();
                mainboard.calculator();
        }
}
