package com.leetcode.easy;

import com.leetcode.Utils.TreeNode;

public class MinimumDepthOfBinaryTree {
  public int minDepth(TreeNode root) {
    if (root == null) return 0;
    return findDepth(1, root);
  }

  private int findDepth(int currentDepth, TreeNode currentNode) {
    if (currentNode.left == null && currentNode.right == null) {
      return currentDepth;
    }

    currentDepth++;
    if (currentNode.left == null) {
      return findDepth(currentDepth, currentNode.right);
    } else if (currentNode.right == null) {
      return findDepth(currentDepth, currentNode.left);
    }
    return Math.min(findDepth(currentDepth, currentNode.left), findDepth(currentDepth, currentNode.right));
  }
}
