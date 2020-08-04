/**
 * 
 */
package com.ayue.statePattern.patternTwo;

/**
 * 2019年3月8日
 *
 * @author ayue
 *         具体状态类---- 重复投票
 */
public class RepeatVoteState implements VoteState {

        @Override
        public void vote(String user, String voteItem, VoteManager voteManager) {
                System.out.println("重复投票");
        }

}
