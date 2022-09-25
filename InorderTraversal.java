package com.week11;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 94
 */
public class InorderTraversal {
    //递归遍历
    class Solution {
        public List<Integer> inorderTraversal(MyTreeNode root) {
            List<Integer> res = new ArrayList<>();
            inorder(root, res);
            return res;
        }

        void inorder(MyTreeNode root, List<Integer> list) {
            if (root == null) {
                return;
            }
            inorder(root.left, list);
            list.add(root.val);             // 注意这一句
            inorder(root.right, list);
        }
    }
}
