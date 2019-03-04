/**
 * 
 */
package com.ayue.chainOfResponsibilityPattern.complexPattern;

/**
 * 2019年3月2日
 *
 * @author ayue
 */
public class GeneralManager extends Handler {
        @Override
        public String handleFeeRequest(String user, double fee) {
                String str = "";
                if (fee >= 1000) {
                        if ("张三".equals(user)) {
                                str = "成功，总经理同意";
                        } else {
                                str = "失败，总经理不同意";
                        }
                } else {
                        if (getSuccessor() != null) {
                                return getSuccessor().handleFeeRequest(user, fee);
                        }
                }
                return str;
        }
}
