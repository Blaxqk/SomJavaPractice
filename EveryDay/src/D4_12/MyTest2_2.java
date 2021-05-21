package D4_12;

import java.util.Arrays;
import java.util.Scanner;

public class MyTest2_2 {
    /**
     * 【编程1】
     * 提醒：非递减就是a[i]<=a[i+1]，递减就是a[i]>a[i+1]，
     *      非递增就是a[i]>=a[i+1]，递增就是a[i]<a[i+1]
     * @param args
     */
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i]=scanner.nextInt();
            }

            // 用一个标志来区分,0表示不增不减，1表示递增，-1表示递减
            int flag = 0;
            // 统计能够划分的数组的个数
            int count = 1;

            for (int i = 0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){//递减
                    if(flag==0){
                        flag=-1;
                    }
                    if(flag==1){//变化了，出现新的子序列
                        flag=0;
                        count++;
                    }

                }else if(arr[i]<arr[i+1]){//递增
                    if(flag==0){
                        flag=1;
                    }
                    if(flag==-1){//变化了，出现新的子序列
                        flag=0;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }


    /**
     * 【编程2】字符串倒置但不倒置标点符号
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String[] s = str.split(" ");
            String str2 = "";
            for (int i = s.length-1;i>=0;i--){
                str2+=s[i]+" ";
            }
            System.out.println(str2);
        }

    }
}
