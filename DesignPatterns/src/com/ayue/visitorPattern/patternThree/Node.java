/**
 * 
 */
package com.ayue.visitorPattern.patternThree;

/**
 * 2019年3月11日
 *
 * @author ayue
 *         抽象节点类
 */
public abstract class Node {
        //接收操作
        public abstract void accept(Visitor visitor);
}
