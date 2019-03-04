/**
 * 
 */
package com.ayue.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 2019年2月27日
 *
 * @author ayue
 *         树枝构件角色类
 */
public class Composite extends Component {

        private List<Component> childComponents = new ArrayList<Component>();

        private String name;

        public Composite(String name) {
                this.name = name;
        }

        public void addChild(Component child) {
                childComponents.add(child);
        }

        public void removeChild(int index) {
                childComponents.remove(index);
        }

        public List<Component> getChild() {
                return childComponents;
        }

        @Override
        public void printStruct(String preStr) {
                System.out.println(preStr + "-" + this.name);
                if (this.childComponents != null) {
                        preStr += "  ";
                        for (Component component : childComponents) {
                                //递归输出每个子对象
                                component.printStruct(preStr);
                        }
                }
        }

}
