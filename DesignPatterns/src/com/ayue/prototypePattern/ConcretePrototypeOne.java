/**
 * 
 */
package com.ayue.prototypePattern;

/**
 * 2019年2月25日
 *
 * @author ayue
 */
public class ConcretePrototypeOne implements Prototype {
        private String name;

        public Prototype clone() {
                ConcretePrototypeOne prototype = new ConcretePrototypeOne();
                prototype.setName(this.name);
                return prototype;
        }

        public String toString() {
                return "Now in prototyeOne,name = " + this.name;
        }

        @Override
        public String getName() {
                return name;
        }

        @Override
        public void setName(String name) {
                this.name = name;
        }
}
