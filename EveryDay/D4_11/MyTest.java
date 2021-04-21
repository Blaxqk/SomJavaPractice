package D4_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyTest {
    /**
     * 一、选择题
     * static int i;
     * i默认为0
     */
    static int i;
    public static void main1(String[] args) {
        System.out.println(i);
    }

    /**二、编程题
     * 1.思路：如果为两队，则最大=arr[2]+arr[3]
     */
    public static void selectSort(int[] array){
        //一共多少次选择过程
        for(int i = 0;i < array.length-1;i++){
            //无序区间：[0 , array.length-i)
            //有序区间：[array.length-i , array.length)
            int maxIndex = 0;
            for(int j = 1 ; j < array.length - i; j++){
                if(array[j] < array[maxIndex]){
                    maxIndex = j;
                }
            }
            //找出无序区间最大数的下标，然后与无序区间最后一个交换
            int temp = array[maxIndex];
            array[maxIndex] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int[] arr = {};

            n = scan.nextInt();
            arr = new int[n * 3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }


//        System.out.println("原数组"+Arrays.toString(arr));
            //排序
            selectSort(arr);
//        System.out.println("排序后"+Arrays.toString(arr));

            int tmp = 0;
            for (int i = n; i < 2 * n; i++) {
                tmp += arr[i];
            }
            System.out.println(tmp);
        }

    /**
     * 2.输入两个字符串  从第一个里边删除第二个
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Character> list = new ArrayList<>();
        while(scan.hasNext()){
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();
            if (str1 == "") return;
            if (str2 == "") return ;


            char c[] = str2.toCharArray();
            for(int i = 0;i<str1.length();i++){
                //如果str2中不包含str1.charAt[i],就将这个字符添加到list中
                if (!(str2.contains(str1.charAt(i) + ""))) {
                    list.add(str1.charAt(i));
                }
            }
            //遍历list，将list中的元素输出
            for (int k = 0; k < list.size(); k++) {
                System.out.print(list.get(k) + "");
            }

        }
    }

}
