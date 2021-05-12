package dp;

/**
 * 【本质：斐波那契】
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * n=1  1
 * n=2  2
 * n=3  3
 * n=4  5
 */
public class JZ10 {

    /**
     * 时间复杂度O(n)
     * @param target
     * @return
     */
    public int rectCover2(int target) {
        if(target <= 0){
            return 0;
        }
        if(target == 1 || target == 2){
            return target;
        }
        int first = 1;
        int second = 2;
        int ret = 0;
        for(int i = 3;i<=target;i++){
            ret = first + second;
            first = second;
            second = ret;
        }
        return ret;
    }

    /**
     * 【递归】
     * @param target
     * @return
     */
    public int rectCover(int target) {
        if(target <= 0){
            return 0;
        }
        if(target == 1 || target == 2){
            return target;
        }
        return rectCover(target-1)+ rectCover(target-2);
    }
}
