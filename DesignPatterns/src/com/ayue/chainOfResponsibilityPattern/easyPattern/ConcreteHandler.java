/**
 * 
 */
package com.ayue.chainOfResponsibilityPattern.easyPattern;

/**
 * 2019年3月2日
 *
 * @author ayue
 *         具体处理者对象
 */
public class ConcreteHandler extends Handler {

        @Override
        public void handlerRequest() {
                if (getSuccessor() != null) {
                        System.out.println("放过请求到下一级处理对象");
                        getSuccessor().handlerRequest();
                } else {
                        System.out.println("处理请求");
                }
        }
}
