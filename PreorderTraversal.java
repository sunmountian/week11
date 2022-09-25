package com.week11;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 144
 */
public class PreorderTraversal {
    //递归遍历
    class Solution {
        public List<Integer> preorderTraversal(MyTreeNode root) {
            List<Integer> result = new ArrayList<>();
            preorder(root, result);
            return result;
        }

        public void preorder(MyTreeNode root, List<Integer> result) {
            if (root == null) return;
            result.add(root.val);
            preorder(root.left, result);
            preorder(root.right, result);
        }
    }
}
