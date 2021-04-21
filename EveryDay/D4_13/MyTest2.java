package D4_13;

import java.util.Scanner;

/**
 * 【编程题1】
 * 读入字符串，输出字符串中的连续最长的数字串
 *
 * 输入：abcd12345ed125ss123456789
 * 输出：123456789
 */
public class MyTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int max = 0;
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            for(int i = 0;i<str.length();i++){
                char c = str.charAt(i);
                if(c>=48||c<=57){
                    max++;
                }else{

                }
            }
        }
    }
}
