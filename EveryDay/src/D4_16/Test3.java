package D4_16;

import java.util.Scanner;

/**【编程题2】
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0
 *
 *
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println(StrToInt(str));
        }
    }
    public static int StrToInt(String str) {
        if(str==null || str.equals("")){
            return 0;
        }
        if(str.charAt(0) == '0'){
            return 0;
        }
        //1.去掉符号➕判断正负

        //要先判断正负，从而在计算时判断是否越界
        boolean isNegative = false;
        if(str.charAt(0)=='-'){
            isNegative = true;
            str = str.substring(1);//截取后面除去符号的位数
        }else if(str.charAt(0)=='+'){
            str = str.substring(1);
        }
        char[] c = str.toCharArray();
        long result = 0;
        //2.转换为数字
        for (int i = 0;i<c.length;i++){
            if(c[i]>='0'&&c[i]<='9'){
                result+=Math.pow(10,c.length-i-1) * (c[i]-48);
            }else {
                return 0;
            }
        }
        //3.去掉超出范围的数字
        if(isNegative == true){
            if((0-result)<Integer.MIN_VALUE){
                return 0;
            }else {
                return (int)(0-result);
            }

        }else {
            if(result>Integer.MAX_VALUE){
                return 0;
            }else {
                return (int) result;
            }

        }


    }
}
