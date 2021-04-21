package D4_16;

import java.util.Scanner;

/**
 * 【编程1】
 *二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1
 * 每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2
 *
 * 输入描述:
 * 每组数组包含网格长宽W,H，用空格分割.(1 ≤ W、H ≤ 1000)
 * 输出描述:
 * 输出一个最多可以放的蛋糕数
 *
 * 示例1
 * 输入
 * 3 2
 * 输出
 * 4
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            int[][] arr = new int[w][h];
            //创建的未初始化的二维数组，则其值默认为0；
            //将不能放蛋糕的地方置为1，最后剩几个0就意味着可以放几块蛋糕
            int count = 0;
            for(int i = 0; i<w;i++){
                for(int j = 0;j<h;j++){
                    if(arr[i][j]==0){
                        count++;
                        if((i+2)<w){
                            arr[i+2][j]=1;
                        }
                        if((j+2)<h){
                            arr[i][j+2]=1;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }



}
