/**
 * 
 */
package com.ayue.statePattern.patternTwo;

/**
 * 2019年3月8日
 *
 * @author ayue
 */
public class Client {
        public static void main(String[] args) {
                VoteManager vm = new VoteManager();
                //内部状态的改变引起行为的改变
                for (int i = 0; i < 9; i++) {
                        vm.vote("u1", "A");
                }
        }
}
