/**
 * 
 */
package com.ayue.visitorPattern.patternThree;

/**
 * 2019年3月11日
 *
 * @author ayue
 *         抽象访问者角色，为每一个具体节点准备一个访问操作
 */
public interface Visitor {
        //对应于节点A的访问操作
        public void visit(NodeA node);

        //对应于节点B的访问操作
        public void visit(NodeB node);
}
