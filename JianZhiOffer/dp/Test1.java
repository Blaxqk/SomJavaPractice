package dp;

/**
 * https://leetcode-cn.com/problems/climbing-stairs/
 * 爬楼梯问题
 *
 */
public class Test1 {
    public int climbStairs(int n) {
        //判空
        if(n==0||n==1 || n==2){
            return n;
        }

        //【1.状态定义】dp[i]表示"到达第 i 阶有多少走法"

        int[] dp = new  int[n+1];//n+1大小存n个数【😓】

        //【2.状态 的初始化---边界值】
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        //【3.状态转移方程】
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        //【4.返回结果】
        return dp[n];
    }
}
