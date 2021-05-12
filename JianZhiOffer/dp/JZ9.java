package dp;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JZ9 {

    /**
     * 【动态规划】
     *      * 空间复杂度O(n)
     * @param target
     * @return
     */
    public int jumpFloorII2(int target) {
        int ret = 1;
        for (int i = 2; i <= target; i++) {
            ret *= 2;
        }
        return ret;

    }
    public int jumpFloorII(int target) {
        if(target <= 0){
            return 0;
        }
        if(target == 1 || target == 2){
            return target;
        }
        int[] dp = new int[target + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= target ; i++) {
            dp[i] = dp[i-1] * 2;
        }
        return dp[target];
    }


    /**
     * 【移位】
     * 空间复杂度O(1)
     * 时间复杂度O(n)
     * @param target
     * @return
     */
    public int jumpFloorII1(int target) {
        return 1<<(target-1);

    }



}
