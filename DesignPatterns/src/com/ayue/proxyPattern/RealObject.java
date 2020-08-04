/**
 * 
 */
package com.ayue.proxyPattern;

/**
 * 2019年3月1日
 *
 * @author ayue
 */
public class RealObject extends AbstractObject {
        @Override
        public void operation() {
                System.out.println("操作");
        }
}
