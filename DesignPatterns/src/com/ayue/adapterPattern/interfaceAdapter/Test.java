package com.ayue.adapterPattern.interfaceAdapter;

/**
 * 2020年7月28日
 *
 * @author ayue
 */
public class Test {
        public static void main(String[] args) {
                AbstractInterface ai = new AdapterClient();
                ai.operationOne();
                ai.operationTwo();
                ai.operationThree();
        }
}
