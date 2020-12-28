package com.ygt.tree.solve;

import com.ygt.tree.entity.NormalTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 各种遍历二叉树方法
 *
 * @author 伊格田
 * @date 2020/12/25
 */
public class VisitTree {
    /**
     * 中序遍历 Inorder Traversal (LDR)
     */
    public void inorderTraversal(NormalTreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.getLeft());
        visit(root);
        inorderTraversal(root.getRight());

    }

    /**
     * 层序遍历 二叉树 通过队列实现
     *
     * @param root
     * @return
     */
    public ArrayList<Integer> printFromTopToBottom(NormalTreeNode root) {
        Queue<NormalTreeNode> queue = new LinkedList<>();
        ArrayList<Integer> ret = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            while (cnt-- > 0) {
                NormalTreeNode t = queue.poll();
                if (t == null) {
                    continue;
                }
                ret.add(t.getVal());
                queue.add(t.getLeft());
                queue.add(t.getRight());
            }
        }
        return ret;
    }

    /**
     * 按行打印 层序遍历
     * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
     * 示例1
     * 输入
     * {8,6,10,5,7,9,11}
     * 返回值
     * [[8],[6,10],[5,7,9,11]]
     * @param pRoot
     * @return
     */
    ArrayList<ArrayList<Integer>> linePrint(NormalTreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        Queue<NormalTreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = queue.size();
            while (cnt-- > 0) {
                NormalTreeNode node = queue.poll();
                if (node == null) {
                    continue;
                }
                list.add(node.getVal());
                queue.add(node.getLeft());
                queue.add(node.getRight());
            }
            if (list.size() != 0) {
                ret.add(list);
            }
        }
        return ret;
    }

    private void visit(NormalTreeNode root) {
        System.out.println(" 二叉树节点值为：" + root.getVal());
    }
}
