package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class LC144二叉树的前序遍历 {

    /**
     * 方法1
     */

    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null) return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;

    }
    /**
     * 方法2
     */
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root != null) {
            list.add(root.val);
            List<Integer> ll = preorderTraversal(root.left);
            list.addAll(ll);
            List<Integer> lr = preorderTraversal(root.right);
            list.addAll(lr);
        }

        return list;

    }
}
