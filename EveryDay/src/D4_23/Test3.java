package D4_23;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    /**
     * 判断是否为素数
     */
    public static boolean isSu(int n){
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            if(n%2!=0){//不是偶数
                break;
            }
            //由中间向两边查找
           for(int i = n/2;i<n;i++){
               if(isSu(i) && isSu(n-i)){
                   System.out.println(i);
                   System.out.println(n-i);//【注意输出顺序，，，无语】
                   break;
               }
           }


        }
    }
}
