package D5_10;

import java.util.Scanner;

/**
 * 输入一个字符串，输出这个字符串的反转
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            char[] ch = str.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (int i = ch.length-1; i >= 0; i--) {
                sb.append(ch[i]);
            }
            System.out.println(sb);
        }
    }
}
