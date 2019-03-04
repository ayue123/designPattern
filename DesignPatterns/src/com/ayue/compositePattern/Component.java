/**
 * 
 */
package com.ayue.compositePattern;

import java.util.List;

/**
 * 2019年2月27日
 *
 * @author ayue
 *         抽象构建角色类
 */
public abstract class Component {
        //输出组件自身的名字
        public abstract void printStruct(String preStr);

        public void addChild(Component child) {
                //缺省实现，抛出异常，因为叶子对象没有此功能或者子组件没有实现这个功能
                throw new UnsupportedOperationException("对象不支持此功能");
        }

        //index为子构件对象的下标
        public void renmoveChild(int index) {
                throw new UnsupportedOperationException("对象不支持此功能");
        }

        public List<Component> getChild() {
                throw new UnsupportedOperationException("对象不支持此功能");
        }
}
