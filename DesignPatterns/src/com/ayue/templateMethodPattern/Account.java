/**
 * 
 */
package com.ayue.templateMethodPattern;

/**
 * 2019年3月11日
 *
 * @author ayue
 *         抽象模板角色类
 */
public abstract class Account {
        //模板方法，计算利息数额
        public final double calculateInterest() {
                double interestRate = doCalculateInterestRate();
                String accountType = doCalculateAccountType();
                double amount = calculateAmount(accountType);
                return amount * interestRate;
        }

        //基本方法留给子类实现
        protected abstract String doCalculateAccountType();

        //基本方法留给子类实现
        protected abstract double doCalculateInterestRate();

        //基本方法已经实现
        private double calculateAmount(String accountType) {
                //缺省相关业务逻辑
                return 7234.00;
        }
}
