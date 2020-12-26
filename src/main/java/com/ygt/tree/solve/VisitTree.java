package com.ygt.tree.solve;

import com.ygt.tree.entity.NormalTreeNode;

/**
 * 各种遍历二叉树方法
 * @author 伊格田
 * @date 2020/12/25
 */
public class VisitTree {
    /**
     * 中序遍历 Inorder Traversal (LDR)
     */
    public void inorderTraversal(NormalTreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.getLeft());
        visit(root);
        inorderTraversal(root.getRight());

    }

    private void visit(NormalTreeNode root) {
        System.out.println(" 二叉树节点值为："+root.getVal());
    }
}
