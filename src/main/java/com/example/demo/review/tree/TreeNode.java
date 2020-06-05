package com.example.demo.review.tree;

import lombok.Data;

@Data
public class TreeNode {

    //red or black rule-1
    private Boolean red;

    //父节点
    private TreeNode parent;

    //左节点
    private TreeNode left;

    //右节点
    private TreeNode right;


    public TreeNode() {

    }


    //一般节点
    public TreeNode(Boolean red, TreeNode parent, TreeNode left, TreeNode right) {
        this.red = red;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }
}
