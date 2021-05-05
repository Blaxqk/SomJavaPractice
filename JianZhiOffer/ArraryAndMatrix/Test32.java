package ArraryAndMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 参考：https://blog.csdn.net/u012429555/article/details/89290442
 */
public class Test32 {
    public String PrintMinNumber1(int [] numbers) {
        if(numbers.length==0 || numbers==null){
            return "";
        }
        List<Integer> list = new ArrayList<>();
        for (int t:numbers) {
            list.add(t);
        }
        list.sort((a,b)->(a+""+b).compareTo(b+""+a));
        StringBuffer str = new StringBuffer();

        for (int t:list) {
            str.append(t);
        }
        return str.toString();
    }

    public String PrintMinNumber2(int [] numbers) {

        if(numbers.length==0 || numbers==null){
            return "";
        }
        String[] strArr = new String[numbers.length];
        for(int i = 0;i<strArr.length;i++){
            strArr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strArr,new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        StringBuffer str = new StringBuffer();
        for (String s:strArr ) {
            str.append(s);
        }
        return str.toString();
    }



        public static void main(String[] args) {

        //如果相等则返回0，
        //System.out.println("335".compareTo("3331"));

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(list);//[4, 2, 3, 3]
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list);//[2, 3, 3, 4]
        list.sort((a,b)->b.compareTo(a));
        System.out.println(list);//[4, 3, 3, 2]

    }
}
