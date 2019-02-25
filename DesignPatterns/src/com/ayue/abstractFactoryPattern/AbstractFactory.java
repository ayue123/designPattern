/**
 * 
 */
package com.ayue.abstractFactoryPattern;

/**
 * 2019年2月21日
 *
 * @author ayue
 */
public interface AbstractFactory {

        public Cpu creatCpu();

        public Mainboard creatMainboard();
}
