/**
 * 
 */
package com.ayue.interpreterPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 2019年3月4日
 *
 * @author ayue
 *         环境类定义从变量到布尔值的一个映射
 *         一般用来存放文法中各个终结符所对应的具体值
 */
public class Context {
        private Map<Variable, Boolean> map = new HashMap<Variable, Boolean>();

        public void assign(Variable var, boolean value) {
                map.put(var, new Boolean(value));
        }

        public boolean lookup(Variable var) throws IllegalAccessException {
                Boolean value = map.get(var);
                if (value == null) {
                        throw new IllegalAccessException();
                }
                return value.booleanValue();
        }
}
