/**
 * 
 */
package com.ayue.builderPattern.easyObject;

/**
 * 2019年2月22日
 *
 * @author ayue
 */
public class WelcomeBuilder extends Builder {

        public WelcomeBuilder() {
                msg = new WelcomeMessage();
        }

        @Override
        public void buildSubject() {
                msg.setSubject("欢迎标题");
        }

        @Override
        public void buildBody() {
                msg.setBody("欢迎内容");
        }

}
