package ArraryAndMatrix;

import com.sun.imageio.plugins.wbmp.WBMPImageReader;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Test19 {
    public static void main(String[] args) {
    }
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        if(matrix==null || matrix.length==0 || matrix[0].length==0 ) return arrayList;

        int up = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while (true){
            //最上面一行
            for(int i = left;i<=right;i++){
                arrayList.add(matrix[up][i]);
            }
            up++;
            //判断是否越界
            if(up>down){
                break;
            }

            //最右边一列
            for(int i = up;i<=down;i++){
                arrayList.add(matrix[i][right]);
            }
            right--;
            //判断是否越界
            if(right<left){
                break;
            }

            //最下边一行
            for(int i = right;i>=left;i--){
                arrayList.add(matrix[down][i]);
            }
            down--;
            //判断是否越界
            if(up>down){
                break;
            }
            //最左边一列
            for(int i = down;i>=up;i--){
                arrayList.add(matrix[i][left]);
            }
            left++;
            //判断是否越界
            if(right<left){
                break;
            }


        }



        return arrayList;

    }


    public ArrayList<Integer> printMatrix1(int [][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(matrix==null || matrix.length==0 || matrix[0].length==0 ) return arrayList;

        int up = 0;
        int right = matrix[0].length-1;
        int down = matrix.length-1;
        int left = 0;

        while(true){
            //最上面一行
            for(int i = left;i<=right;i++){
                arrayList.add(matrix[up][i]);
            }
            up++;
            if(up > down){break;}
            //最右边一列
            for(int i = up;i<=down;i++){
                arrayList.add(matrix[i][right]);
            }
            right--;
            if(right<left){break;}
            //最下面一行
            for(int i = right;i>=left;i--){
                arrayList.add(matrix[down][i]);
            }
            down--;
            if(down<up) {break;}
            //最左边一列
            for(int i = down;i>=up;i--){
                arrayList.add(matrix[i][left]);
            }
            left++;
            if(left>right){break;}

        }

        return arrayList;
    }
}
