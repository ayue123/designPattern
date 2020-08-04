/**
 * 
 */
package com.ayue.visitorPattern.patternThree;

/**
 * 2019年3月11日
 *
 * @author ayue
 *         具体节点A
 */
public class NodeA extends Node {

        @Override
        public void accept(Visitor visitor) {
                visitor.visit(this);
        }

        //NodeA特有的方法
        public String operationA() {
                return "NodeA";
        }
}
