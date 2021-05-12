package dp;

import java.util.Arrays;

/**
 * 53 https://leetcode-cn.com/problems/maximum-subarray/
 */
public class Test3 {

    //将求n个数的数组最大子段和---> 转换为
    //                               1)分别求出以第1个、第2个、..、第i个、第n个数字结尾的最大子段和
    //                               2)再找出n个结果中最大的，即为结果

    //dp[i] 代表以第i个数字结尾的最大子段和
    //dp[i] = dp[i-1]>0 ? dp[i-1]+nums[i] : nums[i];
    public int maxSubArray(int[] nums) {
        //初始判断
        if(nums == null || nums.length==0){
            return 0;
        }
        //【1.状态定义】dp[i]表示"第i个数字结尾的最大子段和"
        int[] dp = new int[nums.length];

        //【2.状态 的初始化---边界值】
        dp[0] = nums[0];

        //【3.状态转移方程】
        int max_res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i-1]>0 ? (dp[i-1]+nums[i]) : nums[i];
            if(max_res < dp[i]){
                max_res = dp[i];
            }
        }
//        Arrays.sort(dp);
////        return dp[dp.length-1];
        //【4.返回结果】
        return max_res;
    }
}
