package com.ygt.tree.solve;

import com.ygt.tree.entity.NormalTreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author 伊格田
 * @date 2020/12/26
 */
class CheckSubTreeTest {


    @Test
    void hasSubtree() {
        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8};
        NormalTreeNode normalTreeNode = NormalTreeNode.putAll(temp, 0);
        NormalTreeNode normalTreeNode2 = NormalTreeNode.putAll(temp, 4);
        CheckSubTree checkSubTree = new CheckSubTree();
        boolean b = checkSubTree.hasSubtree(normalTreeNode, normalTreeNode2);
        System.out.println(b);
    }
}