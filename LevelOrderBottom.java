package com.week11;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 107
 */
public class LevelOrderBottom {
    public class N0107 {

        /**
         * 解法：队列，迭代。
         * 层序遍历，再翻转数组即可。
         */
        public List<List<Integer>> solution1(MyTreeNode root) {
            List<List<Integer>> list = new ArrayList<>();
            Deque<MyTreeNode> que = new LinkedList<>();

            if (root == null) {
                return list;
            }

            que.offerLast(root);
            while (!que.isEmpty()) {
                List<Integer> levelList = new ArrayList<>();

                int levelSize = que.size();
                for (int i = 0; i < levelSize; i++) {
                    MyTreeNode peek = que.peekFirst();
                    levelList.add(que.pollFirst().val);

                    if (peek.left != null) {
                        que.offerLast(peek.left);
                    }
                    if (peek.right != null) {
                        que.offerLast(peek.right);
                    }
                }
                list.add(levelList);
            }

            List<List<Integer>> result = new ArrayList<>();
            for (int i = list.size() - 1; i >= 0; i-- ) {
                result.add(list.get(i));
            }

            return result;
        }
    }
}
