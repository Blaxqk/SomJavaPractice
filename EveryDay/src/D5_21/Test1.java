package D5_21;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if(ch[i]>='A' && ch[i]<'F'){
                    int t = ((int)ch[i]+21);
                    char c = (char)t;
                    System.out.print(c);
                }else if(ch[i]>='E' && ch[i]<='z'){
                    System.out.print((char) ((int)ch[i]-5));
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
