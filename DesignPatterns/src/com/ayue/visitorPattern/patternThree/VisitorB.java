/**
 * 
 */
package com.ayue.visitorPattern.patternThree;

/**
 * 2019年3月11日
 *
 * @author ayue
 *         具体访问者visitorB
 */
public class VisitorB implements Visitor {
        //对于nodeA的访问
        @Override
        public void visit(NodeA node) {
                System.out.println(node.operationA());

        }

        //对于nodeB的访问
        @Override
        public void visit(NodeB node) {
                System.out.println(node.operationB());
        }
}
