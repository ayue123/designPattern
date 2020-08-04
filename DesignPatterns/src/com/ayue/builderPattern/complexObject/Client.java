/**
 * 
 */
package com.ayue.builderPattern.complexObject;

/**
 * 2019年2月25日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                // 创建出建造者
                InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("123", 123L, 456L);
                // 为其他属性赋值
                InsuranceContract contract = builder.setPersonName("aaa").setOtherData("bb").setComoanyName("cc").build();
                // 最后调用真正的构建方法来构建真正的目标对象
                contract.someOperation();
        }
}
