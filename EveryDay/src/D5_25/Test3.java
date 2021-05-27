package D5_25;

import java.util.Scanner;

/**
 * NowCoder开了一家早餐店，这家店的客人都有个奇怪的癖好:
 * 他们只要来这家店吃过一次早餐，就会每天都过来;并且，所有人在这家店吃了两天早餐后，
 * 接下来每天都会带一位新朋友一起来品尝。
 *
 * 1 1 2 3 5...
 */
public class Test3 {
    public static long help(int s,int e){
        if(e == 1 ){
            return 1;
        }
        long[] arr = new long[e+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i <= e ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        if(s == e){
            return arr[s];//如果 s == e，那么返回的就是对应的斐波那契数
        }
        long res = 0;
        for (int i =s; i <= e ; i++) {
            res += arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            System.out.println(help(start,end));
        }
    }
}
