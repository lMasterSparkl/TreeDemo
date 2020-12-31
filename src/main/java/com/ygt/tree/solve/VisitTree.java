package com.ygt.tree.solve;

import com.ygt.tree.entity.NormalTreeNode;

import java.util.*;

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
     *
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

    /**
     * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
     *
     * @param pRoot
     * @return
     */
    public ArrayList<ArrayList<Integer>> zigzagPrint(NormalTreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        Queue<NormalTreeNode> queue = new LinkedList<>();
        //常用实现就这两种
//        Deque<NormalTreeNode> deque=new ArrayDeque<>();
//        Deque<NormalTreeNode> deque=new LinkedList<>();
        queue.add(pRoot);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = queue.size();
            while (cnt-- > 0) {
                NormalTreeNode node = queue.poll();
                if (node == null) {
                    continue;
                }
                //这里感觉可以优化  直接通过reverse标志位判断左插入或者右插入 用LinkedList  或者用Queue
//                ArrayDeque<Object> objects = new ArrayDeque<>();
//                Queue<NormalTreeNode> queue = new LinkedList<>();
//                LinkedList<Object> objects = new LinkedList<>();
//                objects.addFirst();
                list.add(node.getVal());
                queue.add(node.getLeft());
                queue.add(node.getRight());
            }
            if (reverse) {
                Collections.reverse(list);
            }
            reverse = !reverse;
            if (list.size() != 0) {
                ret.add(list);
            }
        }
        return ret;
    }

    /**
     * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。假设输入的数组的任意两个数字都互不相同。
     * <p>
     * 例如，下图是后序遍历序列 1,3,2 所对应的二叉搜索树。
     * [4,8,6,12,16,14,10]  true
     *
     * @param sequence
     * @return
     */
    public boolean verifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return verify(sequence, 0, sequence.length - 1);
    }

    private boolean verify(int[] sequence, int first, int last) {
        if (last - first <= 1) {
            return true;
        }
        int rootVal = sequence[last];
        int cutIndex = first;
        while (cutIndex < last && sequence[cutIndex] <= rootVal) {
            cutIndex++;
        }
        for (int i = cutIndex; i < last; i++) {
            if (sequence[i] < rootVal) {
                return false;
            }
        }
        return verify(sequence, first, cutIndex - 1) && verify(sequence, cutIndex, last - 1);
    }


    private void visit(NormalTreeNode root) {
        System.out.println(" 二叉树节点值为：" + root.getVal());
    }


}
