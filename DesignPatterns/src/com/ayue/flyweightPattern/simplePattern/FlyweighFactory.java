/**
 * 
 */
package com.ayue.flyweightPattern.simplePattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 2019年3月1日
 *
 * @author ayue
 *         享元工厂类
 *         一般而言，享元工厂对象整个系统只有一个，故可以使用单例模式
 *         当客户端需要单纯享元对象的时候，需要调用享元工厂的factory()方法，并传入所需的单纯享元对象的内蕴状态，
 *         由工厂方法产生所需要的享元对象。
 */
public class FlyweighFactory {
        //key为内蕴状态
        private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

        public Flyweight factory(Character state) {
                Flyweight fly = files.get(state);
                if (fly == null) {
                        fly = new ConcreteFlyweight(state);
                        files.put(state, fly);
                }
                return fly;
        }
}
