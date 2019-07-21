/**
 * created by Zheng Jiateng on 2019/7/21.
 */

import base.TreeNode;

/**
 * 一棵树是不是另一棵树的子结构（我们约定空树不是任意一个树的子结构）
 * s 的一个子树应包括 s 的一个节点和这个节点的所有子孙。
 * 但子结构不用
 * eg:
 * 给定的树 s：
     3
    / \
   4   5
  / \
 1   2
    /
   0
 给定的树 t：
    4
   / \
  1   2

 t不是s的子树，却是子结构 只要t遍历结束就行了
 */
public class IsSubStructure__ {
    public boolean isSubStructure(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) return false;
        return isSame(root1,root2) || isSubStructure(root1.left,root2) || isSubStructure(root1.right,root2);
    }
    public boolean isSame(TreeNode root1,TreeNode root2) {
        if(root2 == null) return true;
        if(root1 == null) return false;
        return root1.val == root2.val && isSame(root1.left,root2.left) && isSame(root1.right,root2.right);
    }
}
