/**
 * 
 */
package com.ayue.builderPattern.easyObject;

/**
 * 2019年2月22日
 *
 * @author ayue
 *         导演者
 */
public class Director {
        Builder builder;

        public Director(Builder builder) {
                this.builder = builder;
        }

        public void construct(String to, String from) {
                this.builder.buildTo(to);
                this.builder.buildFrom(from);
                this.builder.buildSubject();
                this.builder.buildBody();
                this.builder.buildSendDate();
                this.builder.sendMessage();
        }
}
