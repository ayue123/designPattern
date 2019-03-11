/**
 * 
 */
package com.ayue.visitorPattern.patternThree;

import java.util.ArrayList;
import java.util.List;

/**
 * 2019年3月11日
 *
 * @author ayue
 *         结构对象角色类，持有一个聚集，并向外界提供add方法，可以动态的添加一个新的节点
 */
public class ObjectStructure {
        private List<Node> nodeList = new ArrayList<Node>();

        //执行方法操作
        public void action(Visitor visitor) {
                for (Node node : nodeList) {
                        node.accept(visitor);
                }
        }

        //添加一个新的节点
        public void add(Node node) {
                nodeList.add(node);
        }
}
