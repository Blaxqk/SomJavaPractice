package ArraryAndMatrix;

public class Test35 {
    /**
     * 我的暴力破解居然用例过不了---》超时
     * @param array
     * @return
     */
    public int InversePairs1(int [] array) {
        int sum = 0;
        if(array.length<2){
            return sum;
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    sum++;
                }
            }
        }
        return sum%1000000007;
    }

    /**
     * 归并
     */
//    public int InversePairs(int [] array) {
//
//    }

    public static void main(String[] args) {

    }
}
