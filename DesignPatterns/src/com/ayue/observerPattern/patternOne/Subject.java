/**
 * 
 */
package com.ayue.observerPattern.patternOne;

import java.util.ArrayList;
import java.util.List;

/**
 * 2019年3月6日
 *
 * @author ayue
 *         抽象主题（被观察）角色
 */
public abstract class Subject {
        //用来保存注册的观察者对象
        private List<Observe> list = new ArrayList<Observe>();

        //注册观察者对象
        public void attach(Observe observe) {
                list.add(observe);
                System.out.println("attached an observe");
        }

        //删除观察者对象
        public void detach(Observe observe) {
                list.remove(observe);

        }

        //通知所有注册的观察者对象
        public void nodifyObservers(String newState) {
                for (Observe observe : list) {
                        observe.update(newState);
                }
        }
}
