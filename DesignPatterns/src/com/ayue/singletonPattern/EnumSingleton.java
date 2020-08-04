package com.ayue.singletonPattern;

/**
 * 2020年7月28日
 *
 * @author ayue
 */
public enum EnumSingleton {
        // 最完美的单例实现,防止并发和防止反序列化(枚举类没有构造方法故无法反序列化)
        // 枚举式单例，effective java推荐的单例实现模式
        INSTANCE;
        public void m() {
                System.out.println("Singleton2");
        }

        public static void main(String[] args) {
                EnumSingleton s1 = EnumSingleton.INSTANCE;
                EnumSingleton s2 = EnumSingleton.INSTANCE;
                s1.m();
                System.out.println(s1 == s2);
        }
}
