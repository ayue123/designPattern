/**
 * 
 */
package com.ayue.statePattern.patternTwo;

/**
 * 2019年3月8日
 *
 * @author ayue
 *         具体状态类----黑名单
 */
public class BlackVoteState implements VoteState {

        @Override
        public void vote(String user, String voteItem, VoteManager voteManager) {
                System.out.println("进入黑名单，禁止登陆和使用本系统");
        }

}
