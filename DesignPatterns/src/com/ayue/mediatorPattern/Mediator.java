/**
 * 
 */
package com.ayue.mediatorPattern;

/**
 * 2019年3月4日
 *
 * @author ayue
 *         抽象调停者类
 */
public interface Mediator {
        //同事对象在自身改变的时候来通知调停者方法
        //让调停者去负责相应的与其他同事对象的交互
        public void changed(Colleague c);
}
