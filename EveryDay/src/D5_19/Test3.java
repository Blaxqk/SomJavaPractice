package D5_19;

import java.util.Scanner;



/*链接：https://www.nowcoder.com/questionTerminal/480d2b484e1f43af8ea8434770811b4a
        来源：牛客网

  设开始最少有x个桃子

 *每次分5堆都会多出来1个，那么借给猴子们4个桃子，此时每次正好可以分成5堆
 *(假设每次分给猴子们的桃子都不是借给他们的那4个桃子，最后-4就可以得到结果了)
 *假设最初有桃子x个，借给猴子们4个，总共有x+4个
 *那么第一个小猴子得到(x+4)*(1/5)，剩余(x+4)*(4/5)个
 *那么第二个小猴子得到(x+4)*(4/5)*(1/5)，剩余(x+4)*(4/5)^2个
 *那么第三个小猴子得到(x+4)*(4/5)^2*(1/5)，剩余(x+4)*(4/5)^3个
 *以此类推，第n个猴子达到(x+4)*(4/5)^(n-1)*(1/5)，剩余(x+4)*(4/5)^n个
 *要满足最后剩余的桃子为整数，并且x最小，则当且仅当x+4=5^n,即x=5^n-4;
 *因此老猴子最后得到的桃子数为(5^n-4+4)*(4/5)^n+n-4=4^n+n-4
 *(+n是因为每个小猴子都会将多出来的一个给老猴子，-4是刚开始借给小猴子的)
 */
public class Test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt() ){
            int n = scanner.nextInt();
            if(n == 0){
                break;//n==0，结束
            }
            long a=(long)Math.pow(5,n)-4;
            long b=(long)Math.pow(4,n)+n-4;
            System.out.println(a+" "+b);

        }

    }
}
