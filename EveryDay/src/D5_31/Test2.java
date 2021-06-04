package D5_31;

import java.util.Scanner;

/**
 * 现在有两个好友A和B，住在一片长有蘑菇的由n * m个方格组成的草地，A在(1,1),B在(n,m)。
 * 现在A想要拜访B，由于她只想去B的家，所以每次她只会走(i.j+1)或(i+1,j)这样的路线，
 * 在草地上有k个蘑菇种在格子里(多个蘑菇可能在同一方格),
 * 问:A如果每一步随机选择的话(若她在边界上，则只有一种选择)，
 * 那么她不碰到蘑菇走到B的家的概率是多少?
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int[][] dp = new int[m][n];
            for (int i = 0; i <n ; i++) {
                dp[0][i] = 1;
            }
            for (int i = 0; i < m; i++) {
                dp[i][0] = 1;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    
                }
            }

        }
    }
}
