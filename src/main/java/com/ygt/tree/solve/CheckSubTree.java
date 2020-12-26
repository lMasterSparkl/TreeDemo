package com.ygt.tree.solve;

import com.ygt.tree.entity.NormalTreeNode;


/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @author 伊格田
 * @date 2020/12/25
 */
public class CheckSubTree {
    public boolean hasSubtree(NormalTreeNode root1, NormalTreeNode root2) {
        if (root1 == null || root2 == null)
        {
            return false;
        }
        return isSubtreeWithRoot(root1, root2) || hasSubtree(root1.getLeft(), root2) || hasSubtree(root1.getRight(), root2);
    }

    private boolean isSubtreeWithRoot(NormalTreeNode root1, NormalTreeNode root2) {
        //这里root2为null说明符合条件了  root2为空树的处理在最开始就有了
        if (root2 == null)
        {
            return true;
        }
        if (root1 == null)
        {
            return false;
        }
        if (root1.getVal() != root2.getVal())
        {
            return false;
        }
        return isSubtreeWithRoot(root1.getLeft(), root2.getLeft()) && isSubtreeWithRoot(root1.getRight(), root2.getRight());
    }
}
