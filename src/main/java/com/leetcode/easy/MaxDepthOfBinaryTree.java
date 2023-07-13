package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

public class MaxDepthOfBinaryTree {
  public int maxDepth(TreeNode root) {
    return countDepth(root, 0);
  }

  private int countDepth(TreeNode currentNode, int counter) {
    if (currentNode == null) {
      return counter;
    }
    counter++;
    int leftNodeCount = countDepth(currentNode.left, counter);
    int rightNodeCount = countDepth(currentNode.right, counter);
    return Math.max(leftNodeCount, rightNodeCount);
  }
}
