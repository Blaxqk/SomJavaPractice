package D6_03;

import java.util.Scanner;

/**
 * 五子棋：
 *
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[20];//每一行是一个元素
        while (scanner.hasNext()){
            for (int i = 0; i < 20; i++) {
                arr[i] = scanner.next();
            }
            func(arr);
        }
    }
    public static void func(String[] arr){
        char[][] chars = new char[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j <20 ; j++) {
                chars[i][j] = arr[i].charAt(j);
            }
        }
        int count=0;
        while (count<5){
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j <20 ; j++) {
                    if(chars[i][j]=='.'){//非棋子跳过
                        continue;
                    }


                }
            }
        }
        if(count>=5){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


        /*for (int i = 0; i < 20; i++) {
            for (int j = 0; j <20 ; j++) {
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }*/

    }
}
