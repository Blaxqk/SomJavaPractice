package javaweb测试;

import java.util.Scanner;

/**
 * 【编程题1】
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new  int[n];
            for (int i = 0;i<n;i++){
                arr[i] = scanner.nextInt();
            }
            for (int i = 0;i<n;i++){
                /*if(i==0){
                    System.out.print(-1+" ");

                }*/
                if(i==n-1){
                    System.out.print(-1);
                    System.out.println();
                    break;
                }
                for(int j = 0;j<n;j++){
                    if(j<=i){//左边
                        if(arr[j]<arr[i]){
                            System.out.print(j+" ");
                            j = i;
                            continue;
                        }else if(i==j){
                            System.out.print(-1+" ");
                            continue;
                        }

                    }else if(i<j){//右边
                        if(arr[j]<arr[i]){
                            System.out.print(j);
                            System.out.println();
                            break;
                        }
                    }
                }
            }


        }
    }
}
