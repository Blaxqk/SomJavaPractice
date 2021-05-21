package D5_07;

import java.util.Scanner;

public class Test3 {
    /**
     * 1 1 2 3 5 8...
     * 斐波那契数列
     * @param monthCount
     * @return
     */
    public static int getTotalCount(int monthCount){
        if(monthCount>0&&monthCount<3){
            return 1;
        }
        return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int m = scanner.nextInt();
            System.out.println(getTotalCount(m));
        }
    }
}
