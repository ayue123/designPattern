/**
 * 
 */
package com.ayue.statePattern.patternTwo;

/**
 * 2019年3月8日
 *
 * @author ayue
 *         具体状态类----正常投票
 */
public class NormalVoteState implements VoteState {
        @Override
        public void vote(String user, String voteItem, VoteManager voteManager) {
                voteManager.addMapVode(user, voteItem);
                System.out.println("恭喜投票成功");
        }
}
