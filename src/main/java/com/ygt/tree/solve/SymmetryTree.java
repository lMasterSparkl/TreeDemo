package com.ygt.tree.solve;

import com.ygt.tree.entity.NormalTreeNode;

/**
 * 镜像二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 *
 * @author 伊格田
 * @date 2020/12/25
 */
public class SymmetryTree {
    public boolean isSymmetrical(NormalTreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return isSymmetrical(pRoot.getLeft(), pRoot.getRight());
    }

    private boolean isSymmetrical(NormalTreeNode t1, NormalTreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.getVal() != t2.getVal()) {
            return false;
        }
        return isSymmetrical(t1.getLeft(), t2.getRight()) && isSymmetrical(t1.getRight(), t2.getLeft());
    }
}
