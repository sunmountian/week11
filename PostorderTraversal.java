package com.week11;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * leetcode 145
 * @authoe 李祥基
 */
public class PostorderTraversal {
    //递归遍历
    class Solution {
        public List<Integer> postorderTraversal(MyTreeNode root) {
            List<Integer> res = new ArrayList<>();
            postorder(root, res);
            return res;
        }

        void postorder(MyTreeNode root, List<Integer> list) {
            if (root == null) {
                return;
            }
            postorder(root.left, list);
            postorder(root.right, list);
            list.add(root.val);             // 注意这一句
        }
    }
}
