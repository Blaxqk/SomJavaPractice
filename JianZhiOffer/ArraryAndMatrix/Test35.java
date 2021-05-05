package ArraryAndMatrix;

public class Test35 {
    public int InversePairs(int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    sum++;
                }
            }
        }
        return sum%1000000007;
    }

    public static void main(String[] args) {

    }
}
