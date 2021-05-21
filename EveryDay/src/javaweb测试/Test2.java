package javaweb测试;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test2 {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            while (scan.hasNext()){
                //用set实现，找出出现次数为奇数次的那俩个数字
                Set<Integer> set = new HashSet<>();
                int n = scan.nextInt();
                int[] arr = new int[n];
                for (int i = 0;i < n;i++){
                    arr[i] = scan.nextInt();
                    if (!set.contains(arr[i])){
                        set.add(arr[i]);
                    }else{//如果存在把之前加进来的踢出去，因为它出现了奇数次，就和最后的结果没有什么关系了
                        set.remove(arr[i]);
                    }
                }
                //到达这里，set里面就只剩下俩个出现奇数次的数字了
                //得到这俩个数字
                //第一种获取值的方法
                int[] res = new int[2];
                int k = 0;
                for (int i = 0;i < n;i++){
                    if (set.contains(arr[i])){
                        set.remove(arr[i]);
                        res[k++] = arr[i];
                        if (k == 2)break;
                    }
                }
                //第二种获取值的方法，采用迭代器
            /*int[] res = new int[2];
            int k = 0;
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()){
                res[k++] = it.next();
            }*/
                if(res[0] < res[1]){
                    System.out.println(res[0]+" "+res[1]);
                }else{
                    System.out.println(res[1]+" "+res[0]);
                }
            }
        }


    /**
     * 时间复杂度不符合题意
     * @param args
     */
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int[] arrCount = new int[n];

            for (int i = 0; i < n; i++) {
                int count = 0;
                for(int j = 0;j<n;j++){
                    if(arr[i] == arr[j]){count++;}
                }
                if(count%2!=0){
                    arrCount[i]=1;
                }
            }
            for (int i = 0; i < n; i++) {
                if(arrCount[i]==1){
                    System.out.print(arr[i]+" ");
                }

            }






        }
    }
}
