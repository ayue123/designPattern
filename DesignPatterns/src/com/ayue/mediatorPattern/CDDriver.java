/**
 * 
 */
package com.ayue.mediatorPattern;

/**
 * 2019年3月4日
 *
 * @author ayue
 */
public class CDDriver extends Colleague {
        //光驱读取出来的数据
        private String data = "";

        public CDDriver(Mediator mediator) {
                super(mediator);
        }

        //读取数据
        public String getData() {
                return data;
        }

        //读取光盘
        public void readCD() {
                this.data = "One piece,海贼王";
                getMediator().changed(this);
                //通知主板，自己状态改变了
        }
}
