package D4_23;

import java.util.Arrays;

public class Test2 {
    /**
     * 将m插入到n的第j到第i位

     */
    public static int binInsert(int n, int m, int j, int i) {
        // write code here
       m<<=j;
       return m|n;
    }
    public static void main(String[] args) {
        System.out.println(binInsert(1024,19,2,6));
    }
}
