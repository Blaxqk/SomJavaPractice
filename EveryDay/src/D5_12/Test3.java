package D5_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();

            if(str == null || str.length()==0 ){
                System.out.println(-1);
                return;
            }

            List<Character> list1 = new ArrayList<>();
            List<Character> list2 = new ArrayList<>();

            for (int i = 0;i<str.length();i++) {
                char c = str.charAt(i);
                Character t = Character.valueOf(c);
                if(!list1.contains(c) && !list2.contains(c)){
                    list1.add(t);
                }else {
                    list1.remove(t);
                    list2.add(t);
                }
            }
            if(list1.size()<=0){
                System.out.println(-1);

            }else {
                System.out.println(list1.get(0));
            }
        }
    }
}
