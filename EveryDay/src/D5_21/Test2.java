package D5_21;

import java.util.Scanner;
////从最小因子2到数字的最大因子数（数字的平方根）开始判断是否能够取余，
// 可以则循环取余直到取余不为0，因子个数+1，否则使用下一个因子计算。

//最终整除了各个因子数之后剩余的数字不为1则本身也是一个因子，因此因子数+1



//36= 2 * 2*3*3
//30 = 2*3*5
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int count = 0;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i ==0){
                    while (n % i == 0){
                        n /= i;
                    }
                    count++;
                }
            }

            if(n != 1){//素数情况
                count++;
            }
            System.out.println(count);
        }
    }
}
