/**
 * 
 */
package com.ayue.decoratorPattern;

/**
 * 2019年2月27日
 *
 * @author ayue 具体修饰角色
 */
public class Bird extends Change {
        public Bird(TheGreatestSage sage) {
                super(sage);
        }

        @Override
        public void move() {
                super.move();
                System.out.println("bird move");
        }
}
