package map_set;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 旧键盘问题
 * https://www.nowcoder.com/questionTerminal/f88dafac00c8431fa363cd85a37c2d5e
 */
public class NowCoderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            HashSet<Character> set = new HashSet<>();
            HashSet<Character> set2 = new HashSet<>();
            for (char c:str2.toUpperCase().toCharArray() ) {
                set.add(c);
            }
            for (char c:str1.toUpperCase().toCharArray()) {
                if(!set.contains(c) && !set2.contains(c)){
                    //不能直接放在集合中打印，因为集合没有顺序，而输出要求有顺序
                    //所以我们打印完再把它放进集合里边(*^_^*)
                    //这样既能用集合不重复打印 还能保证顺序
                    System.out.print(c);
                    set2.add(c);

                }
            }

        }
    }
}
