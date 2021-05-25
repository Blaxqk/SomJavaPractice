package BinaryTree;

import java.util.Arrays;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    TreeNode(int x) { val = x; }
 }
public class Test4 {
    /**
     * 【递归】
     * 1.根据前序遍历确定根节点
     * 2.根据中序遍历确定根的左右子树
     * 3.递归重复
     */
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0 || in.length==0){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        //遍历数组在中序找到根节点的位置
        for (int i = 0; i < in.length; i++) {
            if(in[i] == pre[0]){
                //注意 copyOfRange 函数，左闭右开
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
                break;
            }
        }

        return root;
    }
    public static void main(String[] args) {

    }
}
