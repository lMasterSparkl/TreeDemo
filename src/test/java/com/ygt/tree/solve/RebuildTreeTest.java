package com.ygt.tree.solve;

import com.ygt.tree.entity.NormalTreeNode;
import org.junit.jupiter.api.Test;


/**
 * @author 伊格田
 * @date 2020/12/24
 */
class RebuildTreeTest {
    /**
     * @author 伊格田
     * @date 2020/12/24
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。 [1,2,3,4,5,6,7],[3,2,4,1,6,5,7]  {1,2,5,3,4,6,7}
     *
     */
    @Test
    void reConstructBinaryTree() {
        RebuildTree rebuildTree = new RebuildTree();
        int[] a=new int[] {1,2,3,4,5,6,7} ;
        int[] b=new int[] {3,2,4,1,6,5,7} ;
        NormalTreeNode normalTreeNode = rebuildTree.reConstructBinaryTree(a, b);
        System.out.println(normalTreeNode);
    }
}