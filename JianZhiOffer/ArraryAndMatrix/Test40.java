package ArraryAndMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test40 {
    /**
     * 方法一：
     * @param array int整型一维数组
     * @return int整型一维数组
     */
    public static int[] FindNumsAppearOnce (int[] array) {
        // write code here
        List<Integer> list = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;

            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    flag = true;
                    i++;
                    break;
                }
            }
            if(!flag){
                list.add(array[i]);
            }
        }
        int[] res = new int[2];
        res[0] = list.get(0);
        res[1] = list.get(1);
        return res;


    }

    /**
     *生成list，依次去放，当a中有重复时，就删除remove,
     * @param array
     * @return
     */
    public static int[] FindNumsAppearOnce2 (int[] array) {
        List<Integer> list1 = new ArrayList<>();
        //List<Integer> list2 = new ArrayList<>();
        Arrays.sort(array);
        for(int i = 0;i<array.length;i++){
            //这个条件不能少，因为在list中删除条件的是数据下标，
            // 如果想要删除元素，就要强制类型转换成对象，不然会出错。
            Integer temp=array[i];
            if(!list1.contains(temp)){
                list1.add(temp);
            }else {
                list1.remove(temp);

            }
        }
        int[] res = new int[2];
        res[0] = list1.get(0);
        res[1] = list1.get(1);
        return res;
    }

    /**
     * 方法三：使用异或方法
     * @param array
     * @return
     */
    public static int[] FindNumsAppearOnce3 (int[] array) {
        if(array.length==2) return array;

        int res = 0;//对整个数组求异或的结果
        for (int i = 0; i < array.length; i++) {
            res ^= array[i];
        }
        int a = 0,b=0;

        //从右边找到第一个1（也就是a和b不同的位置）
        int x = res;
        int j = 0;//j记录是第几位
        while ((x&1)==0){
            x>>=1;
            j++;
        }
        //【以第N(j)位是不是1 为标准把原数组中的数字分成两个子数组】
        for(int num:array){
            if((num>>j&1)==0){
                a = a^num;
            }else {
                b = b^num;
            }
        }

        //返回这两个数的数组（按大小顺序~）
        if(a>b){
            int temp=b;
            a=b;
            b=a;
        }
        return new int[]{a,b};
    }

    public static void main(String[] args) {
        int[] arr = {1,4,1,6};
        int[] res=FindNumsAppearOnce2(arr);
        System.out.println(res.toString());
    }
}
