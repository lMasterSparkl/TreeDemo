package com.ygt.tree.solve;

import com.ygt.tree.entity.NormalTreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 伊格田
 * @date 2020/12/26
 */
class SymmetryTreeTest {

    @Test
    void isSymmetrical() {
//        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] temp = {1, 2, 2, 3, 4, 4, 3};
        NormalTreeNode normalTreeNode = NormalTreeNode.putAll(temp, 0);
        SymmetryTree symmetryTree = new SymmetryTree();
        boolean symmetrical = symmetryTree.isSymmetrical(normalTreeNode);
        System.out.println(symmetrical);
    }
}