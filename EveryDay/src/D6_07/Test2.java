package D6_07;

import java.util.*;

/**
 * 【九宫格字母数字对应】
 */
public class Test2 {
    public static void main(String[] args) {
        String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number = "222333444555666777788899991234567890";

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            ArrayList<String> list = new ArrayList<>();
            int n= scanner.nextInt();
            for (int i = 0; i < n; i++) {//处理输入的每一个字符串
                String str=scanner.next();
                str = str.replace("-","");
                String result = "";
                for (int j = 0; j < 7; j++) {
                    result += number.charAt(str1.indexOf(str.charAt(j)+""));
                }
                result = result.substring(0,3)+"-"+result.substring(3,7);

                if(!list.contains(result)){
                    list.add(result);
                }

            }
            Collections.sort(list);

            for (int j = 0; j < list.size(); j++) {
                System.out.println(list.get(j));
            }
            System.out.println();
        }
    }
}
