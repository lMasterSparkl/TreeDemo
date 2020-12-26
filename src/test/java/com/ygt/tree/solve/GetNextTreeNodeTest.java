package com.ygt.tree.solve;

import com.ygt.tree.entity.NextParentBinaryTreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author 伊格田
 * @date 2020/12/25
 */
class GetNextTreeNodeTest {
    private GetNextTreeNode getNextTreeNode= new GetNextTreeNode();
    /**
     *
     *           4
     *          /  \
     *         2    5
     *        /\      \
     *       1  3      6
     */
    @Test
    void getNext() {
        NextParentBinaryTreeNode node4 = new NextParentBinaryTreeNode(4,null,null,null);
        NextParentBinaryTreeNode node2 = new NextParentBinaryTreeNode(2,null,null,node4);
        NextParentBinaryTreeNode node5 = new NextParentBinaryTreeNode(5,null,null,node4);
        NextParentBinaryTreeNode node1 = new NextParentBinaryTreeNode(1,null,null,node2);
        NextParentBinaryTreeNode node3 = new NextParentBinaryTreeNode(3,null,null,node2);
        NextParentBinaryTreeNode node6 = new NextParentBinaryTreeNode(6,null,null,node5);
        node4.setLeft(node2).setRight(node5);
        node2.setLeft(node1).setRight(node3);
        node5.setRight(node6);
        NextParentBinaryTreeNode nextParentBinaryTreeNode = getNextTreeNode.getNext(node3);
        System.out.println(nextParentBinaryTreeNode.getVal());
    }
}