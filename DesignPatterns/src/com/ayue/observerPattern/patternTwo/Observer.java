/**
 * 
 */
package com.ayue.observerPattern.patternTwo;

/**
 * 2019年3月7日
 *
 * @author ayue
 *         抽象观察者对象
 */
public interface Observer {

        //更新接口，传入主题对象
        public void update(Subject subject);
}
