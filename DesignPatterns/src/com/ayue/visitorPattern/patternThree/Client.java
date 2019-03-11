/**
 * 
 */
package com.ayue.visitorPattern.patternThree;

/**
 * 2019年3月11日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                //创建一个结构对象
                ObjectStructure os = new ObjectStructure();
                os.add(new NodeA());
                os.add(new NodeB());

                //创建一个访问者
                Visitor visitor = new VisitorA();
                /**
                 * （1）NodeA对象的接受方法accept()被调用，并将VisitorA对象本身传入；
                 * （2）NodeA对象反过来调用VisitorA对象的访问方法，并将NodeA对象本身传入；
                 * （3）VisitorA对象调用NodeA对象的特有方法operationA()。
                 * 从而就完成了双重分派过程
                 */
                os.action(visitor);
        }
}
