package D4_19;

import java.util.Scanner;

/**
 * 【编程1】
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            if(n>=1000){
                n=999;
            }
            int[] arr = new int[n];
            for(int i = 0;i<arr.length;i++){
                arr[i] = i;
            }
            for(int i = 0;i<arr.length;i+=2){

            }

        }
    }
}
