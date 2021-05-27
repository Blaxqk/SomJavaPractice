package D5_24;

import java.util.Scanner;

/**
 * TODO：我的哪里错了？？？？？？？？？？？？？？！！！！！！！！！！！！
 */
public class Test3 {


    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            int f1 = 1,f2 = 1,f3=0;
            for (int i = 0; i <= n ; i++) {
                f3 = (f1 + f2) %  1000000;
                f1 = f2;
                f2 = f3;
            }
            System.out.printf((n<25?"%d\n":"%06d\n"),f3);
        }
    }

    public static int fib(int n){
        if(n <= 2){
            return  n;
        }
        int[] arr = new int[100001];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i-1]+arr[i-2])%1000000;
        }
        return arr[n];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.printf((n<25?"%d\n":"%06d\n"), fib(n));
        }
    }
}

/**
 * 别人的
 */
class Main{
    static int[] fib = new int[100001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        fib[0] = 1;
        fib[1] = 1;
        while (in.hasNext()) {
            int n = in.nextInt();
            System.out.printf((n<25?"%d\n":"%06d\n"), getFibonacci(n));
        }
        in.close();
    }
    static int getFibonacci(int n) {
        if (fib[2] == 0) {
            for (int i = 2; i <100001; i++) {
                fib[i] = (fib[i-1] + fib[i-2]) % 1000000;
            }
        }
        return fib[n];
    }}
