package D5_13;

import java.util.Scanner;

/**
 * 求两个字符串的编辑距离
 */
public class Test3 {
    /**
     * 【动态规划方法】
     * @param s1
     * @param s2
     * @return
     */
    public static int calStringDistance(String s1,String s2){

        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            String s1 = scan.nextLine();
            String s2 = scan.nextLine();
            System.out.println(calStringDistance(s1,s2));
        }
    }




}
