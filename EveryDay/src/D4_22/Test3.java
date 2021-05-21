package D4_22;

/**
 * 【没过】
 */

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            byte n = scanner.nextByte();
            int n2 = (int)n;
            String str = Integer.toBinaryString(n2);
            if(!str.equals("")&&str!=null ){
                //System.out.println(str);
                int[] countArr = new int[str.length()];
                int count = 0;

                for(int i = 0;i<countArr.length;i++){
                    if(str.charAt(i)=='1'){
                        count++;
                        countArr[i] = count;
                    }else {
                        count=0;
                        continue;
                    }
                }
                Arrays.sort(countArr);
                System.out.println(countArr[countArr.length-1]);
            }else {
                System.out.println(0);
            }

        }

    }
}
