package String;

import java.util.ArrayList;
import java.util.List;

public class Test34 {
    public int FirstNotRepeatingChar(String str) {
        //1.非空判断
        if(str == null || str.length()==0){
            return -1;
        }
        //2.又是熟悉的配方
        List<Character> list1=new ArrayList<>();
        List<Character> list2=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(!list1.contains(ch) && !list2.contains(ch)){
                list1.add(Character.valueOf(ch));
            }else {
                list1.remove(Character.valueOf(ch));
                list2.add(Character.valueOf(ch));
            }
        }
        if (list1.size()<=0) {
            return -1;
        }
        return str.indexOf(list1.get(0));

    }
    public static void main(String[] args) {

    }
}
