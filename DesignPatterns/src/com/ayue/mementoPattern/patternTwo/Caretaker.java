/**
 * 
 */
package com.ayue.mementoPattern.patternTwo;

/**
 * 2019年3月6日
 *
 * @author ayue
 *         负责人对象角色，能给得到的备忘录对象是以MementoIF为接口的，此接口只为一个标识接口，故不可能修改备忘录对象的内容
 */
public class Caretaker {
        private MementoIF mementoIF;

        //备忘录取值方法
        public MementoIF retrieveMementoIF() {
                return mementoIF;
        }

        //备忘录赋值方法
        public void saveMementoIF(MementoIF mementoIF) {
                this.mementoIF = mementoIF;
        }
}
