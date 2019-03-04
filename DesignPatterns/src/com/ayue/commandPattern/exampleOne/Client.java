/**
 * 
 */
package com.ayue.commandPattern.exampleOne;

/**
 * 2019年3月2日
 *
 * @author ayue
 */
public class Client {
        //接收者负责具体的实施和执行请求
        //请求者负责调用命令对象执行请求
        //命令者定义一个接收者和行为之间的弱耦合，负责调用接收者的相应操作
        //把一个请求或者操作封装到一个对象中
        public static void main(String[] args) {
                //创建接收者
                Receiver receiver = new Receiver();
                //创建命令对象，设定它的接收者
                Command command = new ConcreteCommand(receiver);
                //创建请求者，把命令对象设置进去
                Invoker invoker = new Invoker(command);
                //执行命令
                invoker.action();

        }
}
