/**
 * 
 */
package com.ayue.interpreterPattern;

/**
 * 2019年3月4日
 *
 * @author ayue
 *         一个Variable对象代表一个有名变量
 */
public class Variable extends Expression {

        private String name;

        public Variable(String name) {
                this.name = name;
        }

        @Override
        public boolean interpret(Context ctx) {
                try {
                        return ctx.lookup(this);
                } catch (IllegalAccessException e) {
                        e.printStackTrace();
                }
                return false;
        }

        @Override
        public boolean equals(Object obj) {
                if (obj != null && obj instanceof Variable) {
                        return this.name.equals(((Variable) obj).name);
                }
                return false;
        }

        @Override
        public int hashCode() {
                return this.toString().hashCode();
        }

        @Override
        public String toString() {
                return name;
        }

}