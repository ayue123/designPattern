/**
 * 
 */
package com.ayue.chainOfResponsibilityPattern.easyPattern;

/**
 * 2019年3月1日
 *
 * @author ayue
 *         抽象处理者对象
 */
public abstract class Handler {
        //持有后继者的责任链
        protected Handler successor;

        //示意处理请求的方法，（可传参数）
        public abstract void handlerRequest();

        public Handler getSuccessor() {
                return successor;
        }

        //设置后继的责任链对象
        public void setSuccessor(Handler successor) {
                this.successor = successor;
        }
}
