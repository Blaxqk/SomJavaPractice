package D5_13;

public class Test2 {

    /**
     * TODO:JZ29
     * 暴力解法
     * @param gifts
     * @param n
     * @return
     */
    public static  int getValue(int[] gifts, int n) {
        // write code here
        for (int i = 0; i < gifts.length; i++) {
            int count = 1;
            for (int j = 0; j < gifts.length; j++) {
                if(i==j){
                    continue;
                }
                if(gifts[i] == gifts[j]){
                    count++;
                }
            }
            if(count>(n/2)){
                return gifts[i];
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2};
        System.out.println(getValue(arr, 5));
    }
}
