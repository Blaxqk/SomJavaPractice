package ArraryAndMatrix;

import java.util.Arrays;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Test13 {
    public static void main(String[] args) {

    }

    /**
     * 暴力破解
     * @param array
     * @return
     */
    public int[] reOrderArray1 (int[] array) {
        // write code here
        int[] arr = new int[array.length];

        int t = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i]%2!=0){
                arr[t] = array[i];
                t++;
            }
        }

        for(int i = 0;i<array.length;i++){
            if(array[i]%2==0){
                arr[t] = array[i];
                t++;
            }
        }

        return arr;
    }

    /**
     * 使用冒泡排序【超时了。。。。。。。。。。。。。。。】
     * @param array
     * @return
     */
    public int[] reOrderArray (int[] array) {
        // write code here
        for(int i = 0;i<array.length-1;i++){//比较的趟数
            for (int j = 0; j < array.length-i-1; j++) {//一趟比较的次数
                if(array[j]%2==0&&array[j+1]%2!=0){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }

        }

        return array;
    }




}
