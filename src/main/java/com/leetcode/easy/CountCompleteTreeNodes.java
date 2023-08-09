package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

public class CountCompleteTreeNodes {
  public int countNodes(TreeNode root) {
    return countNodes(root, 0);
  }

  private int countNodes(TreeNode currentNode, int currentCount) {
    if (currentNode == null) {
      return currentCount;
    }
    currentCount++;
    int left = countNodes(currentNode.left, currentCount);
    int right = countNodes(currentNode.right, 0);
    return left + right;
  }
}
