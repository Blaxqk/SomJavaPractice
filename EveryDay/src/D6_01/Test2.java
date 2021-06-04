package D6_01;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            int len1 = scanner.nextInt();
            int len2 = scanner.nextInt();
            StringBuffer str = new StringBuffer("a");
            if(str.length()<len1 || str.toString().compareTo(s1)<0){
                return;
            }
            int count = 1;

            while (str.length()<=len2 && str.toString().compareTo("s2")<=0){

            }
        }
    }
}
