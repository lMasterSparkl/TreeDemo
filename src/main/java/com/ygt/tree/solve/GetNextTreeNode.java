package com.ygt.tree.solve;

import com.ygt.tree.entity.NextParentBinaryTreeNode;

/**
 * @author 伊格田
 * @date 2020/12/25
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回 。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * ① 如果一个节点的右子树不为空，那么该节点的下一个节点是右子树的最左节点；
 * ② 否则，向上找第一个左链接指向的树包含该节点的祖先节点。
 */
public class GetNextTreeNode {
    public NextParentBinaryTreeNode getNext(NextParentBinaryTreeNode pNode) {
        if (pNode.getRight() != null) {
            NextParentBinaryTreeNode node = pNode.getRight();
            while (node.getLeft() != null) {
                node = node.getLeft();
            }
            return node;
        } else {
            while (pNode.getNext() != null) {
                NextParentBinaryTreeNode parent = pNode.getNext();
                if (parent.getLeft() == pNode) {
                    return parent;
                }
                pNode = pNode.getNext();
            }
        }
        return null;
    }
}
