/**
 * 
 */
package com.ayue.statePattern.patternTwo;

import java.util.HashMap;
import java.util.Map;

/**
 * 2019年3月8日
 *
 * @author ayue
 *         环境类
 */
public class VoteManager {
        //持有状态处理对象
        private VoteState state = null;
        //记录用户投票结果，Map<String ，String> 对应用户名称和投票选项
        private Map<String, String> mapVote = new HashMap<String, String>();
        //记录用户投票次数，map对应用户名称和投票次数
        private Map<String, Integer> mapVoteCount = new HashMap<String, Integer>();

        //获取用户投票结果
        public Map<String, String> getMapVote() {
                return mapVote;
        }

        public void addMapVode(String user, String voteItem) {
                mapVote.put(user, voteItem);
        }

        /*
         * 投票
         * user 投票人
         * voteItem 投票选项
         */
        public void vote(String user, String voteItem) {
                //使用Integer的原因是防止自动拆箱时报错
                Integer oldVoteCount = mapVoteCount.get(user);
                if (oldVoteCount == null) {
                        oldVoteCount = 0;
                }

                oldVoteCount++;
                mapVoteCount.put(user, oldVoteCount);

                if (oldVoteCount == 1) {
                        state = new NormalVoteState();
                } else if (oldVoteCount > 1 && oldVoteCount < 5) {
                        state = new RepeatVoteState();
                } else if (oldVoteCount >= 5 && oldVoteCount < 8) {
                        state = new SpiteVoteState();
                } else if (oldVoteCount >= 8) {
                        state = new BlackVoteState();
                }
                //转调具体的对象来进行相应的操作
                state.vote(user, voteItem, this);
        }
}
