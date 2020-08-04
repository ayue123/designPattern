/**
 * 
 */
package com.ayue.prototypePattern;

/**
 * 2019年2月25日
 *
 * @author ayue
 */
public class ConcretePrototypeTwo implements Prototype {
        private String name;

        public Prototype clone() {
                ConcretePrototypeTwo prototype = new ConcretePrototypeTwo();
                prototype.setName(this.name);
                return prototype;
        }

        public String toString() {
                return "Now in prototyeTwo,name = " + this.name;
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
