/**
 * 
 */
package com.ayue.strategyPattern;

/**
 * 2019年3月8日
 *
 * @author ayue
 *         中级会员折扣类
 */
public class IntermediateMemberStrategy implements MemberStrategy {

        @Override
        public double calPrice(double bookPrice) {
                System.out.println("中级会员折扣为10%");
                return bookPrice * 0.9;
        }

}
