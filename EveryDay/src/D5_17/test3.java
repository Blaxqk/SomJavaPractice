package D5_17;

import java.util.List;
import java.util.Scanner;

/**
 * 【】快到碗里来
 * https://www.nowcoder.com/questionTerminal/82424d93369649b98720743c25edc6ce
 */
public class test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
           double n = scanner.nextDouble();
            double r = scanner.nextDouble();
            if(n<(2*3.14*r)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }


    }
}
