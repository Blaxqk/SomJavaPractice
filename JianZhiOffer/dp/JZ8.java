package dp;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 */
public class JZ8 {
    /**
     *  空间复杂度O(1)
     */
    public int jumpFloor3(int target) {
        if(target==0||target==1||target==2){
            return target;
        }
        int s1 = 1;
        int s2 = 2;
        int s = 0;
        for (int i = 3; i <= target; i++) {
            s = s1 + s2;
            s1 = s2;
            s2 = s;
        }
        return s;


    }

    /**
     * 【动态规划】
     * 空间复杂度O(n)
     * @param target
     * @return
     */
    public int jumpFloor(int target) {
        if(target==0||target==1||target==2){
            return target;
        }
        int[] dp = new int[target +1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= target ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[target];
    }


        /**
         * 【递归方法】
         * @param target
         * @return
         */
    public int jumpFloor1(int target) {
        if(target <= 0){
            return 0;
        }
        if(target == 1 || target == 2){
            return target;

        }
        return jumpFloor1(target-1) + jumpFloor1(target-2);
    }
    public static void main(String[] args) {

    }
}
