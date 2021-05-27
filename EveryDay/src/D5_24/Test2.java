package D5_24;

import java.util.Scanner;

public class Test2 {

    //判断素数
    public static boolean isSu(int m){
        return m==2||m==3||m==5||m==7||m==11;
    }
    //判断闰年
    public static boolean isRun(int year){
        return (year%400==0 || (year %4==0 && year%100!=0));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();


        }
    }
}
