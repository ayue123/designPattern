/**
 * 
 */
package com.ayue.flyweightPattern.complexPattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2019年3月1日
 *
 * @author ayue
 *         享元工厂
 *         两个方法分别提供单纯享元对象和复合享元对象
 */
public class FlyweightFactory {
        private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

        public Flyweight factory(List<Character> compositeState) {
                ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();
                for (Character c : compositeState) {
                        compositeFly.add(c, this.factory(c));
                }
                return compositeFly;
        }

        public Flyweight factory(Character state) {
                Flyweight fly = files.get(state);
                if (fly == null) {
                        fly = new ConcreteFlyweight(state);
                        files.put(state, fly);
                }
                return fly;

        }

}
