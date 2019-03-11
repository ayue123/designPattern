/**
 * 
 */
package com.ayue.mementoPattern.patternThree;

import java.util.ArrayList;
import java.util.List;

/**
 * 2019年3月6日
 *
 * @author ayue
 *         发起人角色
 */
public class Originator {
        private List<String> states;
        private int index;

        public Originator() {
                states = new ArrayList<String>();
                index = 0;
        }

        //工厂方法，返还一个新的备忘录对象
        public Memento createMemento() {
                //如果单纯使用states则先后生成的memento中的states会是同一个对象
                return new Memento(new ArrayList<String>(states), index);
        }

        //将发起人恢复到备忘录对象记录的状态上
        public void restoreMemento(Memento memento) {
                states = memento.getStates();
                index = memento.getIndex();
        }

        public void setState(String state) {
                states.add(state);
                index++;
        }

        public void printStates() {
                for (String string : states) {
                        System.out.println(string);
                }
        }
}
