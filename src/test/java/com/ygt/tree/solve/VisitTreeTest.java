package com.ygt.tree.solve;

import com.ygt.tree.entity.NormalTreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author 伊格田
 * @date 2020/12/25
 */
class VisitTreeTest {
    private VisitTree visitTree= new VisitTree();
    @Test
    void inorderTraversal() {
        NormalTreeNode left = new NormalTreeNode(2,null,null);
        NormalTreeNode right = new NormalTreeNode(4,null,null);
        NormalTreeNode normalTreeNode = new NormalTreeNode(3,left,right);
        visitTree.inorderTraversal(normalTreeNode);
    }
}