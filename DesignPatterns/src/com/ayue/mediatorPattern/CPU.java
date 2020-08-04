/**
 * 
 */
package com.ayue.mediatorPattern;

/**
 * 2019年3月4日
 *
 * @author ayue
 */
public class CPU extends Colleague {
        // 分解出来的视频数据
        private String videoData = "";
        // 分解出来的音频数据
        private String soundData = "";

        public CPU(Mediator mediator) {
                super(mediator);
        }

        public String getVideoData() {
                return videoData;
        }

        public String getSoundData() {
                return soundData;
        }

        // 处理数据，将数据分解为音频和视频数据
        public void executeData(String data) {
                // 把数据分解开，前面是视频数据，后面是音频数据
                String[] array = data.split(",");
                this.videoData = array[0];
                this.soundData = array[1];
                // 通知主板，CPU完成工作
                getMediator().changed(this);
        }

}
