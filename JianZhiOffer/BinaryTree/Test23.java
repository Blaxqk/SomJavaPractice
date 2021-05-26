package BinaryTree;

/**
 * 【 二叉搜索树的后序遍历序列】
 *
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则返回true,否则返回false。假设输入的数组的任意两个数字都互不相同。
 * （ps：我们约定空树不是二叉搜素树）
 */
public class Test23 {
    /**
     *  【思路】：数组的前部分都小于根节点（也就是数组的最后一个数值）
     *           数组的后部分都大于根节点
     *           这样才是二叉搜索树的后序遍历结果
     */
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null ||sequence.length ==0){
            return false;
        }
        return helpVerity(sequence,0,sequence.length-1);
    }
    public static boolean helpVerity(int [] sequence,int start,int rootI){
        if(start >= rootI){//遍历完数组的一部分，没报错，返回true
            return true;
        }
        int key = sequence[rootI];//记录根节点的值
        int i = start;
        //找到左右子树的分界点
        for (; i < rootI; i++) {
            if(sequence[i] > key){
                break;//多执行了i++;所以i指向后半段的第一个值
            }
        }
        //判断分界点后边是否都>根节点的值
        for (int j = i; j < rootI; j++) {
            if(sequence[j] <= key){
                return false;
            }
        }
        //子问题--递归  根节点的左右子树的节点也要满足以上条件
        return helpVerity(sequence,start,i-1) && helpVerity(sequence,i,rootI-1);

    }

}
