/**
 * 
 */
package com.ayue.decoratorPattern;

/**
 * 2019年2月27日
 *
 * @author ayue 具体构件角色
 */
public class Monkey implements TheGreatestSage {
        @Override
        public void move() {
                System.out.println("monkey move");
        }
}
