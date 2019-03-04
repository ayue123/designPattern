/**
 * 
 */
package com.ayue.flyweightPattern.complexPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 2019年3月1日
 *
 * @author ayue
 *         复合享元角色类，本身是无法享元的
 *         一个复合享元对象的所有单纯享元对象元素的外蕴状态都是与复合享元对象的外蕴状态相等的；
 *         而一个复合享元对象所含有的单纯享元对象的内蕴状态一般是不相等的，不然就没有使用价值了。
 */
public class ConcreteCompositeFlyweight implements Flyweight {
        private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

        public void add(Character key, Flyweight fly) {
                files.put(key, fly);
        }

        //外蕴状态作为参数传入方法中
        @Override
        public void operation(String state) {
                Flyweight fly = null;
                for (Character c : files.keySet()) {
                        fly = files.get(c);
                        fly.operation(state);
                }
        }
}
