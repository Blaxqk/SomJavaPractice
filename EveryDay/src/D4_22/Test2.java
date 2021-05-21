package D4_22;

/**
 * 有一棵无穷大的满二叉树，其结点按根结点一层一层地从左往右依次编号，根结点编号为1。
 * 现在有两个结点a, b。请设计一个算法，求出a和b点的最近公共祖先的编号。
 * 给定两个int a,b。为给定结点的编号。
 * 请返回a和b的最近公共祖先的编号。注意这里结点本身也可认为是其祖先。
 */
public class Test2 {
    public static void main(String[] args) {

    }
    public int getLCA(int a, int b) {
        // write code here
        //分析：这道题因为说了是满二叉树，所以父节点的编号是孩子节点的编号除以2，
        //两个节点的编号那个大就除2，直到有一个时刻两个节点的编号第一次相等，
        // 这就是最近的公共祖先编号。
        int parentA = a;
        int parentB = b;

        while(parentA>0 && parentB>0){
            if(parentA>parentB){
                parentA = parentA/2;
            }else if(parentA<parentB){
                parentB = parentB/2;
            }else {
                return parentA;
            }
        }
        return -1;
    }
}
