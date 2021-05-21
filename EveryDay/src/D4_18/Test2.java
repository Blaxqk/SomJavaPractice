package D4_18;

import java.util.Scanner;

/**
 * 【编程2】
 * 正整数A和正整数B的最小公倍数是指能被A和B整除的最小的正整数值，
 * 设计一个算法，求输入A和B的最小公倍数。
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int min = a<b?a:b;
            int gy = 1;
            for(int i = 2;i<=Math.sqrt(min);i++){
                if(a%i==0 && b%i==0){
                    gy = i;

                    break;
                }
            }
            System.out.println((a*b)/gy);
        }
    }
}
