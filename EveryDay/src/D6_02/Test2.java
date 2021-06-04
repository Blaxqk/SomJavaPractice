package D6_02;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long [] arr = new long[21];//arr[i]代表i个人i个信封错装的的总数
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;
        for (int i = 3; i < 21; i++) {
            arr[i] = (i-1)*(arr[i-1]+arr[i-2]);
        }
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            System.out.println(arr[n]);
        }
    }
}
