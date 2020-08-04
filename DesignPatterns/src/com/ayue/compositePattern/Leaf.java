/**
 * 
 */
package com.ayue.compositePattern;

/**
 * 2019年2月27日
 *
 * @author ayue
 *         树叶构件角色类
 */
public class Leaf extends Component {
        private String name;

        public Leaf(String name) {
                this.name = name;
        }

        @Override
        public void printStruct(String preStr) {
                System.out.println(preStr + "-" + name);
        }
}
