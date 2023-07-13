package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

public class PathSum {

  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }
    return hasPathSum(root, 0, targetSum);
  }

  boolean hasPathSum(TreeNode currentNode, int currentSum, int targetSum) {
    if (currentNode == null) {
      return currentSum == targetSum;
    }
    int nextSum = currentSum + currentNode.val;
    if (currentNode.left == null) {
      return hasPathSum(currentNode.right, nextSum, targetSum);
    } else if (currentNode.right == null) {
      return hasPathSum(currentNode.left, nextSum, targetSum);
    }
    return hasPathSum(currentNode.left, nextSum, targetSum) || hasPathSum(currentNode.right, nextSum, targetSum);
  }
}
