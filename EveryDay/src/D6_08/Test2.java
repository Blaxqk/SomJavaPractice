package D6_08;

import java.util.Scanner;

/**
 * 骆驼命名法
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next();
            str = str.toLowerCase();
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if(ch[i]=='_' && (i+1)<ch.length){
                    ch[i+1] = Character.toUpperCase(ch[i+1]);
                }
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < ch.length; i++) {
                if(ch[i]!='_'){
                    sb.append(ch[i]);
                }
            }
            System.out.println(sb);
        }
    }
}
