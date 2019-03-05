/**
 * 
 */
package com.ayue.mediatorPattern;

/**
 * 2019年3月4日
 *
 * @author ayue
 *         具体调停者类
 */
public class MainBoard implements Mediator {

        //交互的同事类--光驱
        private CDDriver cdDriver = null;
        //交互的同事类--cpu
        private CPU cpu = null;
        //交互的同事类--显卡
        private VideoCard videoCard = null;
        //交互的同事类--声卡
        private SoundCard soundCard = null;

        public void setCdDriver(CDDriver cdDriver) {
                this.cdDriver = cdDriver;
        }

        public void setCpu(CPU cpu) {
                this.cpu = cpu;
        }

        public void setVideoCard(VideoCard videoCard) {
                this.videoCard = videoCard;
        }

        public void setSoundCard(SoundCard soundCard) {
                this.soundCard = soundCard;
        }

        //处理光驱读取数据后与其他对象的交互
        private void opeCDDriverReadData(CDDriver cd) {
                String data = cd.getData();
                cpu.executeData(data);
        }

        //处理CPU处理完数据后与其他对象交互
        private void opeCPU(CPU cpu) {
                //取出CPU处理后的数据
                String videoData = cpu.getVideoData();
                String soundData = cpu.getSoundData();
                //将这些数据传到显卡合声卡展示出来
                videoCard.showData(videoData);
                soundCard.soundData(soundData);
        }

        @Override
        public void changed(Colleague c) {
                if (c instanceof CDDriver) {
                        //表示光驱读取了数据
                        this.opeCDDriverReadData((CDDriver) c);
                } else if (c instanceof CPU) {
                        this.opeCPU((CPU) c);
                }
        }
}
