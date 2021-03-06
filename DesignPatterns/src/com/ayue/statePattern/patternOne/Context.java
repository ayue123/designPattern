/**
 * 
 */
package com.ayue.statePattern.patternOne;

/**
 * 2019年3月8日
 *
 * @author ayue
 *         环境角色类
 */
public class Context {

        //持有一个State类型的对象实例
        private State state;

        public void setState(State state) {
                this.state = state;
        }

        //用户感兴趣的接口方法
        public void request(String sampleParameter) {
                //转调state来处理
                state.handle(sampleParameter);
        }
}
