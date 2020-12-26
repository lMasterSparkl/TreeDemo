package com.ygt.tree.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 伊格田
 * @date 2020/12/24
 * 包含next节点 其中next指向父节点的二叉树
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class NextParentBinaryTreeNode {
    int val;
    NextParentBinaryTreeNode left;
    NextParentBinaryTreeNode right;
    NextParentBinaryTreeNode next;

    public NextParentBinaryTreeNode(int i) {
        this.val = i;
        this.left = null;
        this.right = null;
    }
}

