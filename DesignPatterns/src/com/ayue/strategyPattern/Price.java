/**
 * 
 */
package com.ayue.strategyPattern;

/**
 * 2019年3月8日
 *
 * @author ayue
 *         环境角色类
 */
public class Price {

        //持有一个具体的策略对象
        private MemberStrategy strategy;

        public Price(MemberStrategy strategy) {
                this.strategy = strategy;
        }

        public double quote(double bookPrice) {
                return this.strategy.calPrice(bookPrice);
        }
}
