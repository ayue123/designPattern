/**
 * 
 */
package com.ayue.strategyPattern;

/**
 * 2019年3月8日
 *
 * @author ayue
 *         抽象策略类，抽象折扣类
 */
public interface MemberStrategy {

        public double calPrice(double bookPrice);
}
