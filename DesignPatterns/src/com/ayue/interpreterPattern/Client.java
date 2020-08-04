/**
 * 
 */
package com.ayue.interpreterPattern;

/**
 * 2019年3月4日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                // 环境变量
                Context ctx = new Context();
                // 有名变量
                Variable x = new Variable("x");
                Variable y = new Variable("y");
                // 布尔常量
                Constant c = new Constant(true);
                // 环境变量存储有名变量
                ctx.assign(x, false);
                ctx.assign(y, true);
                // 语句解释操作
                Expression exp = new Or(new And(c, x), new And(y, new Not(x)));
                System.out.println("x=" + x.interpret(ctx));
                System.out.println("y=" + y.interpret(ctx));
                System.out.println(exp.toString() + "=" + exp.interpret(ctx));
        }
}
