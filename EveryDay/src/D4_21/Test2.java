package D4_21;
/**
 * 【success】
 */

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int f3;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int left = 0;
        int right = 0;
        while (true){
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
            if(f3<n){
                left = n-f3;
            }else {
                right = f3-n;
                break;
            }
        }
        System.out.println(Math.min(left,right));
    }
}
