/**
 * 
 */
package com.ayue.templateMethodPattern;

/**
 * 2019年3月11日
 *
 * @author ayue
 *         具体模板角色类
 */
public class MoneyMarketAccount extends Account {
        @Override
        protected String doCalculateAccountType() {
                return "Money Market";
        }

        @Override
        protected double doCalculateInterestRate() {
                return 0.045;
        }
}
