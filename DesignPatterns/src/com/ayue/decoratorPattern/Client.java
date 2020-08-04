/**
 * 
 */
package com.ayue.decoratorPattern;

/**
 * 2019年2月27日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                // 先初始化出来一个具体构件
                // 然后从monkey装饰成bird，在把bird装饰成fish
                // 然后便拥有了monkey，bird，fish的功能
                TheGreatestSage sage = new Monkey();
                TheGreatestSage bird = new Bird(sage);
                TheGreatestSage fish = new Fish(bird);
                fish.move();
        }
}
