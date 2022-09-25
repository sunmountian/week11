package com.week11;

/**
 * @version 1.0
 * @authoe 李祥基
 */
public class MyTreeNode {
    int val;
    MyTreeNode left;
    MyTreeNode right;

    MyTreeNode() {
    }

    MyTreeNode(int val) {
        this.val = val;
    }

    MyTreeNode(int val, MyTreeNode left, MyTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
