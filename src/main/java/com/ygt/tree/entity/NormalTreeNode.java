package com.ygt.tree.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 伊格田
 * @date 2020/12/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class NormalTreeNode {
    private int val;
    private NormalTreeNode left;
    private NormalTreeNode right;

    public NormalTreeNode(int i) {
        this.val = i;
        this.left = null;
        this.right = null;
    }

    /**
     * 递归生成二叉树
     * 传入一个数组生成对应树 前序遍历的int值数组 temp
     * index 是从哪个索引开始生成
     * 返回root根节点
     * 如果temp数组中传入-1代表该节点为空
     *
     * @param temp
     * @return
     */
    public static NormalTreeNode putAll(int[] temp, int index ) {
        int length = temp.length;
        if (index < length) {
            if(temp[index]==-1){
                return null;
            }
            NormalTreeNode root = new NormalTreeNode(temp[index]);
            //这里+1是因为索引值和树的序号对应需要加1  2(index+1)-1=2*index+1
            int nextIndex = 2 * index + 1;
            root.left =putAll(temp,nextIndex) ;
            root.right=putAll(temp,nextIndex+1);
            return root;
        } else {
            return null;
        }
    }
}

