/**
 * 
 */
package com.ayue.strategyPattern;

/**
 * 2019年3月8日
 *
 * @author ayue
 */
public class AdvancedMemeberStrategy implements MemberStrategy {
        @Override
        public double calPrice(double bookPrice) {
                System.out.println("高级会员享受20%折扣");
                return bookPrice * 0.8;
        }
}
