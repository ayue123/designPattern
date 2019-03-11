/**
 * 
 */
package com.ayue.mediatorPattern;

/**
 * 2019年3月4日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                //首先是光驱要读取光盘上的数据，然后告诉主板，它的状态改变了。
                //主板去得到光驱的数据，把这些数据交给CPU进行分析处理。　
                //CPU处理完后，把数据分成了视频数据和音频数据，通知主板，它处理完了。
                //主板去得到CPU处理过后的数据，分别把数据交给显卡和声卡，去显示出视频和发出声音。

                //创建调停者--主板
                //创建同事类
                MainBoard mediator = new MainBoard();
                CDDriver cd = new CDDriver(mediator);
                CPU cpu = new CPU(mediator);
                VideoCard vc = new VideoCard(mediator);
                SoundCard sc = new SoundCard(mediator);
                //让调停者知道所有同事
                mediator.setCdDriver(cd);
                mediator.setCpu(cpu);
                mediator.setVideoCard(vc);
                mediator.setSoundCard(sc);
                //开始看电影，把光盘放入光驱，光驱开始读盘
                cd.readCD();
        }
}
