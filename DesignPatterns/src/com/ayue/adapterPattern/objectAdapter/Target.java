/**
 * 
 */
package com.ayue.adapterPattern.objectAdapter;

/**
 * 2019年2月26日
 *
 * @author ayue
 *         目标角色：所期待得到的接口
 */
public interface Target {

        //源类Adaptee也有的方法
        public void sampleOperationOne();

        //源类Adaptee没有的方法
        public void sampleOperationTwo();
}
