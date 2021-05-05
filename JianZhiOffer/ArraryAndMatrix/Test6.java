package ArraryAndMatrix;

import java.util.Arrays;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Test6 {
    /**
     * 先库函数排序，再输出第一个
     * @param array
     * @return
     */
    public int minNumberInRotateArray1(int [] array) {
        if(array.length==0) return 0;
        Arrays.sort(array);
        return array[0];

    }

    /**
     * 暴力破解
     * @param array
     * @return
     */
    public int minNumberInRotateArray2(int [] array) {
        if(array.length==0) return 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(min > array[i]){
                //todo:注意！！！！！！！
                return array[i];
            }
        }
        return min;
    }

    /**
     * 二分查找
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int [] array) {
        int left = 0;
        int right = array.length-1;
        int mid = 0;
        while(left < right){
            mid = (right + left)/2;
            //如果大于的话，说明最小值在右面，更新左边界值
            if(array[mid]>array[right])
            {
                left=mid+1;
                //判断是否等于，等于的话很难判断，只能让right减一，继续遍历
            }else if(array[mid]==array[right])
            {
                right=right-1;
            }else//下面是小于的情况，更新右边界值
            {
                right=mid;//中间这个元素，可能就是最小值，因此是 right=mid,而不是right = mid-1
            }

        }
        return array[mid];

    }
    public static void main(String[] args) {
        System.out.println(5/3);
    }
}
