package dp;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n\leq 39n≤39
 */
public class JZ7 {

    /**
     *   *   空间复杂度O(1)
     * @param n
     * @return
     */
    public int Fibonacci3(int n) {
        if(n <= 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;

        }
        int f1 = 1;
        int f2 = 1;
        int f = 0;
        for (int i = 3; i <= n; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        return f;
    }

        /**
         * * 【动态规划】
         *   空间复杂度O(n)
         * @param n
         * @return
         */
    public int Fibonacci2(int n) {
        if(n <= 0){
            return 0;
        }
        int[] dp = new int[n +1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

        /**
         * 【递归方法】
         * @param n
         * @return
         */
    public int Fibonacci(int n) {
        if(n <= 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;

        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
