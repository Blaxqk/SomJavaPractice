package ArraryAndMatrix;

/**
 * 2021-4-25
 */
public class Test1 {
    public boolean Find(int target, int [][] array) {
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[0].length;j++){
                if(target == array[i][j]){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {

    }
}

/**
 * 之前写的代码
 */
class Solution {
    public boolean Find(int target, int [][] array) {
        for(int i = 0; i< array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
