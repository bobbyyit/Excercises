package com.yit.exercise.leetcode;

/**
 * https://leetcode.com/problems/validate-binary-search-tree
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {


        return false;

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}