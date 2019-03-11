/**
 * 
 */
package com.ayue.observerPattern.patternTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * 2019年3月7日
 *
 * @author ayue
 *         抽象主题类
 */
public abstract class Subject {

        //保存观察者对象
        private List<Observer> list = new ArrayList<Observer>();

        //注册观察者对象
        public void attach(Observer observer) {
                list.add(observer);
                System.out.println("Attached an observer");
        }

        //删除观察者对象
        public void detach(Observer observer) {
                list.remove(observer);
        }

        //通知所有的注册的观察者对象
        public void nodifyObservers() {
                for (Observer observer : list) {
                        observer.update(this);
                }
        }
}
