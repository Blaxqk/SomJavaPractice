package ArraryAndMatrix;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * todo:快排法，和Hash Map
 */
public class Test28 {
    /**
     * 我的解法
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution1(int [] array) {
        int res = 0;
        for(int i = 0;i<array.length;i++){
            int count = 0;
            for (int j = 0; j <array.length ; j++) {
                if(array[i] == array[j]){
                    count++;
                    if(count>array.length/2){
                        res = array[i];
                        return res;
                    }
                }
            }
        }

        return res;
    }




    public static void main(String[] args) {

    }
}
