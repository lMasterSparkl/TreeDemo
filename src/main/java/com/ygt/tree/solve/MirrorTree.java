package com.ygt.tree.solve;

import com.ygt.tree.entity.NormalTreeNode;

/**
 * 镜像二叉树
 * @author 伊格田
 * @date 2020/12/25
 */
public class MirrorTree {
    public void Mirror(NormalTreeNode root) {
        if (root == null)
        {
            return;
        }
        swap(root);
        Mirror(root.getLeft());
        Mirror(root.getRight());
    }

    private void swap(NormalTreeNode root) {
        NormalTreeNode t = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(t);
    }
}
