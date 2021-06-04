package D6_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test3 {
    /**
     * 当有两个连续的字符相同算重复次数+2
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s1 = scanner.next();
            String s2 = scanner.next();
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            List<Character> list1 = new ArrayList<>();
            List<Character> list2 = new ArrayList<>();
            int len = c1.length<c1.length?c1.length:c2.length;
            for (Character t:c1 ) {
                list1.add(t);
            }
            for (int i = 0; i < len; i++) {
                Character c = c2[i];
                if(list1.contains(c) && !list2.contains(c)){
                    list2.add(c);
                }else if(list1.contains(c) &&i>1&& c.equals(list2.get(list2.size()-1)) && c.equals(list1.get(i-1))){
                    list2.add(c);
                }

            }

            System.out.println(list2.size());
        }
    }
}
