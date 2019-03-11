/**
 * 
 */
package com.ayue.visitorPattern.patternThree;

/**
 * 2019年3月11日
 *
 * @author ayue
 *         具体节点B
 */
public class NodeB extends Node {

        @Override
        public void accept(Visitor visitor) {
                visitor.visit(this);
        }

        //NodeB特有的方法
        public String operationB() {
                return "NodeB";
        }

}
