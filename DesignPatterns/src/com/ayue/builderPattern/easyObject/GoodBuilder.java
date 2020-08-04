/**
 * 
 */
package com.ayue.builderPattern.easyObject;

/**
 * 2019年2月22日
 *
 * @author ayue
 */
public class GoodBuilder extends Builder {

        public GoodBuilder() {
                msg = new GoodbyeMessage();
        }

        @Override
        public void buildSubject() {
                msg.setSubject("再见标题");
        }

        @Override
        public void buildBody() {
                msg.setBody("再见内容");
        }

}
