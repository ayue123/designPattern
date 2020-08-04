/**
 * 
 */
package com.ayue.strategyPattern;

/**
 * 2019年3月8日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                // 选择具体的策略对象
                // 策略模式的重心不是如何实现算法，而是如何组织、调用这些算法，从而让程序结构更灵活，具有更好的维护性和扩展性。
                MemberStrategy strategy = new AdvancedMemeberStrategy();
                System.out.println(strategy.calPrice(300));
        }
}
