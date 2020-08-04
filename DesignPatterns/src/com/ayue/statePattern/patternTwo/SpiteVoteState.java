/**
 * 
 */
package com.ayue.statePattern.patternTwo;

/**
 * 2019年3月8日
 *
 * @author ayue
 *         具体状态类----恶意刷票
 */
public class SpiteVoteState implements VoteState {

        @Override
        public void vote(String user, String voteItem, VoteManager voteManager) {
                //恶意刷票，取消投票资格，并取消投票记录
                String str = voteManager.getMapVote().get(user);
                if (str != null) {
                        voteManager.getMapVote().remove(str);
                }
                System.out.println("恶意刷票，取消资格");
        }

}
