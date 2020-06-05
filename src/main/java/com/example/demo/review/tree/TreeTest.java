package com.example.demo.review.tree;


/**
 * 1.结点是红色或黑色。
 * <p>
 * 2.根结点是黑色。
 * <p>
 * 3.每个叶子结点都是黑色的空结点（NIL结点）。
 * <p>
 * 4 每个红色结点的两个子结点都是黑色。(从每个叶子到根的所有路径上不能有两个连续的红色结点)
 * <p>
 * 5.从任一结点到其每个叶子的所有路径都包含相同数目的黑色结点。
 */
public class TreeTest {


    public static void main(String[] args) {

    }


    /**
     * -----------------------  not allowed ----------------------------
     */

    //rule-2:根结点是黑色
    private static boolean rootNodeNotBlack(TreeNode root) {

        //如果根节点不存在
        if (root == null) {
            return false;
        }

        //如果根节点验测为红色
        if (root.getRed()) {
            return false;
        }

        return true;
    }

    //rule-3:每个叶子结点都是黑色的空结点（NIL结点）
    private static boolean everyLeafNodeAreBlackNIL(TreeNode root) {

        return false;

    }


}
