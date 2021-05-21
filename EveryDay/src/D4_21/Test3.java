package D4_21;
/**
 * 【success】
 */

public class Test3 {
    /**
     * 递归
     * @param x
     * @param y
     * @return
     */
    public int countWays2(int x, int y) {
        // write code here

        if(x==1||y==1){
            return 1;
        }
        return countWays2(x,y-1)+countWays2(x-1,y);


    }


    public static void main(String[] args) {

    }
}
