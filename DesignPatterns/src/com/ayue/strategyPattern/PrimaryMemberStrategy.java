/**
 * 
 */
package com.ayue.strategyPattern;

/**
 * 2019年3月8日
 *
 * @author ayue
 *         初级会员折扣类
 */
public class PrimaryMemberStrategy implements MemberStrategy {

        @Override
        public double calPrice(double bookPrice) {
                System.out.println("初级会员没有折扣");
                return bookPrice;
        }

}
