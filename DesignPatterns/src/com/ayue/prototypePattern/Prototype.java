/**
 * 
 */
package com.ayue.prototypePattern;

/**
 * 2019年2月25日
 *
 * @author ayue
 */
public interface Prototype {
        public Prototype clone();

        public String getName();

        public void setName(String name);
}
