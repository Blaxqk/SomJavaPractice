package D6_02;

import java.util.Scanner;

/**
 * 【最长上升子序列】--【动态规划】
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            int result = 1;
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            //状态定义
            int[] dp = new int[n];

            for (int i = 0; i < n; i++) {
                dp[i] = 1;//状态初始化
                for (int j = 0; j < i; j++) {
                    if(nums[i]>nums[j]){
                        dp[i] = Math.max(dp[i],dp[j]+1);//状态转移方程
                    }
                }
                result = Math.max(dp[i],result);
            }
            System.out.println(result);

        }
    }
}
