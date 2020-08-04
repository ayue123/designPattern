/**
 * 
 */
package com.ayue.flyweightPattern.complexPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * 2019年3月1日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                // 一个复合享元对象的所有单纯享元对象元素的外蕴状态都是与复合享元对象的外蕴状态相等的,内蕴状态一般是不相等的
                List<Character> compositeStateList = new LinkedList<Character>();
                compositeStateList.add('a');
                compositeStateList.add('b');
                compositeStateList.add('c');
                compositeStateList.add('d');
                compositeStateList.add('a');
                compositeStateList.add('a');
                FlyweightFactory factory = new FlyweightFactory();
                // 共享享元对象
                Flyweight compositeFly1 = factory.factory(compositeStateList);
                Flyweight compositeFly2 = factory.factory(compositeStateList);
                compositeFly1.operation("Composite Call");
                System.out.println("-----------------------------------");
                System.out.println("复合享元对象是否可以共享对象：" + (compositeFly1 == compositeFly2));
                Character state = 'a';
                // 单纯享元对象
                Flyweight fly1 = factory.factory(state);
                Flyweight fly2 = factory.factory(state);
                fly1.operation("Simple Call");
                System.out.println("单纯享元对象是否可以共享对象：" + (fly1 == fly2));
        }
}
