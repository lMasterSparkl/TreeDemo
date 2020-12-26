package com.ygt.tree.solve;

import com.ygt.tree.entity.NormalTreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author 伊格田
 * @date 2020/12/26
 * 测试翻转二叉树方法
 */
class MirrorTreeTest {

    @Test
    void mirror() {
        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8};
        NormalTreeNode normalTreeNode = NormalTreeNode.putAll(temp, 0);
        MirrorTree mirrorTree = new MirrorTree();
        mirrorTree.Mirror(normalTreeNode);
        System.out.println(normalTreeNode);
    }
}