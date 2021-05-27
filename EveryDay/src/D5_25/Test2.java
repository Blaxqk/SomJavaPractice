package D5_25;

import java.util.Scanner;

/**
 *一块花布条，里面有些图案，另有一块直接可用的小饰条，里面也有一些图案。对于给定的花布条和小饰条，
 * 计算一下能从花布条中尽可能剪出几块小饰条来呢?
 *
 * 输入
 *    abcde a3
 *    aaaaaa aa
 * 输出
 *    0
 *    3
 */
import java.util.*;
public class Test2 {
    /**
     * 【自带函数】
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str1 = scanner.next();//nextLine()不行
            String str2 = scanner.next();
            int count = 0;
            while (str1.contains(str2)){
                count++;
                str1 = str1.replaceFirst(str2,"");
            }
            System.out.println(count);
        }
    }
}
