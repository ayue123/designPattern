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
public class CDAccount extends Account {
        @Override
        protected String doCalculateAccountType() {
                return "Certificate of Deposite";
        }

        @Override
        protected double doCalculateInterestRate() {
                return 0.06;
        }
}
