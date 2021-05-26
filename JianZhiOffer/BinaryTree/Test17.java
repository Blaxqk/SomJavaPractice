package BinaryTree;

public class Test17 {

}

//递归：B  的左右子树是否为A的子结构
class Solution {
    //传入两棵根节点值相同的树，判断tree1是否和tree2结构一样
    public boolean sameStru(TreeNode tree1, TreeNode tree2){
        if(tree2 == null){
            return true;
        }
        if(tree1 == null){
            return false;
        }
        if(tree1.val != tree2.val){
            return false;
        }
        return sameStru(tree1.left,tree2.left) && sameStru(tree1.right,tree2.right);
    }

    //遍历大树
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null){
            return false;
        }
        if(root1.val == root2.val){
            if(sameStru(root1,root2)) return true;
        }
        //遍历左右子树
        return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);

    }
}
