package BinaryTree;

/**
 * 【二叉树的镜像】---【子问题解决办法】
 */
public class Test18 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot == null){
            return pRoot;
        }
        TreeNode node = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = node;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}
