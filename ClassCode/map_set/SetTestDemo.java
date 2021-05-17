package map_set;

import java.util.HashSet;
import java.util.Set;

public class SetTestDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(2);
        //set.add(2);//不能存储重复的
        set.add(21);
        set.add(12);
        set.add(null);
        System.out.println(set);//[null, 2, 21, 10, 12]
        System.out.println(set.size());//5
    }
}
