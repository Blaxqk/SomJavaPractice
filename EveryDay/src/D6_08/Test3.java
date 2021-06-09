package D6_08;

import java.util.Scanner;

/**
 * 单词倒排
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();


            if("".equals(str.trim())){
                System.out.println("");
            }else{
                String[] strArr =str.split("[^a-zA-Z]+");
                StringBuffer sb = new StringBuffer();
                for (int i = strArr.length-1; i >=0 ; i--) {
                    sb.append(strArr[i]+" ");
                }
                System.out.print(sb.toString().trim());
            }

        }

    }
}
