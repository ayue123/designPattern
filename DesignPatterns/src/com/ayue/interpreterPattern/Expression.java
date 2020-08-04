/**
 * 
 */
package com.ayue.interpreterPattern;

/**
 * 2019年3月4日
 *
 * @author ayue
 *         抽象表达式角色
 */
public abstract class Expression {

        //解释操作，以环境为准，本方法解释给定的任何一个表达式
        public abstract boolean interpret(Context ctx);

        public abstract boolean equals(Object obj);

        public abstract int hashCode();

        public abstract String toString();
}
