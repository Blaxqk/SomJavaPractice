package D5_12;

import java.util.Scanner;

/**
 * 【已通过】
 */

/**
 * 小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为a.
 * 在接下来的一段时间内,他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3...bn.
 * 如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,
 * 并且使得自己的能力值增加bi;如果bi大于c,那他也能打败怪物,
 * 但他的能力值只能增加bi 与c的最大公约数.那么问题来了,在一系列的锻炼后,
 * 小易的最终能力值为多少?
 */

public class Test2 {

    //辗转相除求最大公约数
    public static int gcd(int a,int b){
        if(a < b){//a 要大于b
            int t = a;
            a = b;
            b = t;
        }
        int temp = a % b;
        while (temp >0){//退出循环的条件temp==0
            a = b;
            b = temp;
            temp = a % b;
        }

        return b;


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int len = scanner.nextInt();
            int[] arr = new int[len];
            int initEnergy = scanner.nextInt();
            for (int i = 0; i < len; i++) {
                arr[i] = scanner.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] < initEnergy){
                    initEnergy += arr[i];
                }else {
                    initEnergy = initEnergy +gcd(initEnergy,arr[i]);
                }
            }
            System.out.println(initEnergy);

        }
    }
}
