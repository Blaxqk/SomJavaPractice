package ArraryAndMatrix;

public class Test51 {
    /**
     * 这道题的中心思想是将返回的数据列成一个矩阵，每一个矩阵的行向量都是一个从a(0)到a(n-1)
     * 然后这个对角线都是1.那么此时B0的值就是A0为一，剩下的行向量相乘。
     * @param A
     * @return
     */
    public int[] multiply(int[] A) {
        //1.判空 + A 长度为一？
        if(A == null || A.length==0||A.length==1){
            return null;
        }
        //2.
        int length = A.length;
        int[] B = new int[length];
        B[0] = 1;
        //先算矩阵 1前面部分的
        for (int i = 1; i < length; i++) {
            B[i] = B[i-1]*A[i-1];
        }
        //计算矩阵1 后边部分的，并把前边部分的乘上
        int temp = 1;
        for (int i = length-2;i >= 0;i--){
            temp *= A[i+1];
            B[i] *= temp;
        }

        return B;
    }

    /**
     * todo:动态规划
     * @param args
     */
    public static void main(String[] args) {

    }
}
