/**
 * 
 */
package com.ayue.visitorPattern.patternOne;

/**
 * 2019年3月11日
 *
 * @author ayue
 */
public class Mozi {
        public void ride(Horse h) {
                System.out.println("骑马");
        }

        public void ride(WhiteHorse wh) {
                System.out.println("骑白马");
        }

        public void ride(BlackHorse bh) {
                System.out.println("骑黑马");
        }

        public static void main(String[] args) {
                //wh和bh。它们虽然具有不同的真实类型，但是它们的静态类型都是一样的，均是Horse类型。
                //重载方法的分派是根据静态类型进行的，这个分派过程在编译时期就完成了。
                Horse wh = new WhiteHorse();
                Horse bh = new BlackHorse();
                Mozi mozi = new Mozi();
                mozi.ride(wh);
                mozi.ride(bh);
        }
}
