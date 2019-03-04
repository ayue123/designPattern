/**
 * 
 */
package com.ayue.chainOfResponsibilityPattern.complexPattern;

/**
 * 2019年3月2日
 *
 * @author ayue
 */
public abstract class Handler {
        //持有下一个处理对象请求
        protected Handler successor = null;

        public Handler getSuccessor() {
                return successor;
        }

        public void setSuccessor(Handler sucessor) {
                this.successor = sucessor;
        }

        //处理请求
        public abstract String handleFeeRequest(String user, double fee);

}
