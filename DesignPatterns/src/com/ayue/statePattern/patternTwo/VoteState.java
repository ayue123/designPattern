/**
 * 
 */
package com.ayue.statePattern.patternTwo;

/**
 * 2019年3月8日
 *
 * @author ayue
 *         抽象状态类
 */
public interface VoteState {
        /**
         * 处理状态对应的行为
         * user 投票人
         * voteItem 投票项
         * voteManager 投票上下文，用来在实现状态对应的功能处理的时候，可以回调上下文的数据
         */
        public void vote(String user, String voteItem, VoteManager voteManager);
}
