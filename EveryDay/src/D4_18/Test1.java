package D4_18;

import java.util.Scanner;

/**
 * 【编程题1】
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            int[][] arr = new int[row][col];



            //0表示有蛋糕，1表示没有
            int count = 0;
            for (int i = 0;i<arr.length;i++){
                for(int j = 0;j<(arr[0].length);j++){
                    if(arr[i][j]==0){
                        count++;
                        if((j+2)<col){
                            arr[i][j+2]=1;

                        }
                        if((i+2)<row){
                            arr[i+2][j]=1;
                        }


                    }

                }
            }

            System.out.println(count);

        }
    }
}
