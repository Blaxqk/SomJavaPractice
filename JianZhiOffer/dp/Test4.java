package dp;

/**
 * 322 https://leetcode-cn.com/problems/coin-change/description/
 */
public class Test4 {
    //dp[i]: 代表金额 i 的最优解（即最小使用张数）
    //【在计算dp[i] 时，dp[0],dp[1],dp[2],...,dp[i-1]都是已知的】




    public int coinChange(int[] coins, int amount) {
        //【1.状态定义】dp[i]表示"代表金额 i 的最优解（即最小使用张数）"
        int[] dp = new int[amount+1];
        //【2.状态 的初始化】
        for (int i = 0; i <= amount; i++) {
            dp[i] = -1; //最初所有的金额最优解均为-1
        }
        dp[0] = 0;//从金额0开始递推
        //【3.状态转移方程】
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                //可由coins[j]和dp[i-coins[j]]组成，并且dp[i-coins[j]]存在
                if(i - coins[j]>=0 && dp[i-coins[j]]!=-1){
                    //更新dp[i]
                    if(dp[i] == -1 ||dp[i] >dp[i-coins[j]]+1){
                        dp[i] = dp[i-coins[j]]+1;
                    }

                }
            }
        }
        //【4.返回结果】
        return dp[amount];
    }
}
