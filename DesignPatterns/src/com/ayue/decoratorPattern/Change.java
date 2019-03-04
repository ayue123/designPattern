/**
 * 
 */
package com.ayue.decoratorPattern;

/**
 * 2019年2月27日
 *
 * @author ayue
 *         抽象修饰角色
 */
public abstract class Change implements TheGreatestSage {
        private TheGreatestSage sage;

        public Change(TheGreatestSage sage) {
                this.sage = sage;
        }

        @Override
        public void move() {
                sage.move();
        }

}
