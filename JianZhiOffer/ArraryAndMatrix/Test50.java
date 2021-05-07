package ArraryAndMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test50 {
    public int duplicate (int[] numbers) {
        // write code here
        //1.非空检验
        if(numbers==null|| numbers.length==0){
            return -1;
        }
        //2.非法输入检验

        Arrays.sort(numbers);
        if(numbers[numbers.length-1]>numbers.length-1 || numbers[0]<0){
            return -1;
        }
        //3.
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            Integer t = numbers[i];//这一步要记得！！
            if(!list1.contains(numbers[i]) && !list2.contains(numbers[i])){
                list1.add(t);
            }else {
                list1.remove(t);
                if(!list2.contains(numbers[i])){
                    list2.add(t);
                }

            }
        }
        return list2.get(0);

    }

    /**
     * 替换法
     */
    public int duplicate2 (int[] numbers) {
        for (int i = 0;i<numbers.length;i++){
            if(numbers[i]!=i){
                if(numbers[i] == numbers[numbers[i]]){return numbers[i];}
                //替换

                int temp = numbers[numbers[i]];
                numbers[numbers[i]] = numbers[i];
                numbers[i] = temp;
                i--;//!!!!!!!!!!!!!!!!!!遍历完0位元素以及交换完数字后，
                // 如果0位元素仍不符合数组存放原则：numbers[i] = i，那么还要重新遍历0位元素
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
