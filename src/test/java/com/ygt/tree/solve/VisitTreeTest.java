package com.ygt.tree.solve;

import com.ygt.tree.entity.NormalTreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author 伊格田
 * @date 2020/12/25
 */
class VisitTreeTest {
    private VisitTree visitTree = new VisitTree();

    /**
     * 中序遍历
     */
    @Test
    void testInorderTraversal() {
        NormalTreeNode left = new NormalTreeNode(2, null, null);
        NormalTreeNode right = new NormalTreeNode(4, null, null);
        NormalTreeNode normalTreeNode = new NormalTreeNode(3, left, right);
        visitTree.inorderTraversal(normalTreeNode);
    }


    /**
     * 层序遍历测试
     */
    @Test
    void testPrintFromTopToBottom() {
        //        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] temp = {1, 2, 2, 3, 4, 4, 3};
        NormalTreeNode normalTreeNode = NormalTreeNode.putAll(temp, 0);
        VisitTree visitTree = new VisitTree();
        ArrayList<Integer> integers = visitTree.printFromTopToBottom(normalTreeNode);
        System.out.println(integers);
        //[1, 2, 2, 3, 4, 4, 3]
    }

    /**
     * 层序遍历每层一个数组
     */
    @Test
    void testLinePrint() {
        //        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] temp = {1, 2, 2, 3, 4, 4, 3};
        NormalTreeNode normalTreeNode = NormalTreeNode.putAll(temp, 0);
        VisitTree visitTree = new VisitTree();
        ArrayList<ArrayList<Integer>> arrayLists = visitTree.linePrint(normalTreeNode);
        System.out.println(arrayLists);
    }

    @Test
    void testZigzagPrint() {
        int[] temp = {1, 2, 3, 4, 5, 6, 7};
        NormalTreeNode normalTreeNode = NormalTreeNode.putAll(temp, 0);
        VisitTree visitTree = new VisitTree();
        ArrayList<ArrayList<Integer>> arrayLists = visitTree.zigzagPrint(normalTreeNode);
        System.out.println(arrayLists);
    }

    @Test
    void verifySquenceOfBST() {
//        int[] temp = {1, 3,2};
        int[] temp = {4,8,6,12,16,14,10};
        VisitTree visitTree = new VisitTree();
        boolean b = visitTree.verifySquenceOfBST(temp);
        System.out.println(b);
    }
}