/**
 * 
 */
package com.ayue.builderPattern.easyObject;

/**
 * 2019年2月22日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                //产品抽象类AutoMessage   公用属性
                //具体产品类WelcomeMessage和GoodbyeMessage   专有属性
                //抽象建造者类Builder   公用建造方法 
                //具体建造者类WelcomeBuilder和GoodbyeBuilder   专有建造方法
                //导演者Director    调用建造者的建造方法从而一步步建造出产品对象
                Builder builder = new WelcomeBuilder();
                Director director = new Director(builder);
                director.construct("aa", "bb");
        }
}
