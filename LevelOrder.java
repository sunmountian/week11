package com.week11;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 102
 */
public class LevelOrder {
    //层序遍历
    class Solution {
        public List<List<Integer>> resList = new ArrayList<List<Integer>>();

        public List<List<Integer>> levelOrder(MyTreeNode root) {
            //checkFun01(root,0);
            checkFun02(root);

            return resList;
        }

        //DFS--递归方式
        public void checkFun01(MyTreeNode node, Integer deep) {
            if (node == null) return;
            deep++;

            if (resList.size() < deep) {
                //当层级增加时，list的Item也增加，利用list的索引值进行层级界定
                List<Integer> item = new ArrayList<Integer>();
                resList.add(item);
            }
            resList.get(deep - 1).add(node.val);

            checkFun01(node.left, deep);
            checkFun01(node.right, deep);
        }

        //BFS--迭代方式--借助队列
        public void checkFun02(MyTreeNode node) {
            if (node == null) return;
            Queue<MyTreeNode> que = new LinkedList<MyTreeNode>();
            que.offer(node);

            while (!que.isEmpty()) {
                List<Integer> itemList = new ArrayList<Integer>();
                int len = que.size();

                while (len > 0) {
                    MyTreeNode tmpNode = que.poll();
                    itemList.add(tmpNode.val);

                    if (tmpNode.left != null) que.offer(tmpNode.left);
                    if (tmpNode.right != null) que.offer(tmpNode.right);
                    len--;
                }

                resList.add(itemList);
            }

        }
    }
}
