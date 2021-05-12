package dp;

/**
 * 198.打家劫舍 https://leetcode-cn.com/problems/house-robber/description/
 */
public class Test2 {
    public int rob(int[] nums) {
        //初始判断
        if(nums == null || nums.length==0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        //【1.状态定义】dp[i]表示"第 i 个房间的最优解为dp[i]"
        int[] dp = new int[nums.length];

        //【2.状态 的初始化---边界值】
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        //【3.状态转移方程】
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        //【4.返回结果】
        return dp[nums.length-1];
    }
}
