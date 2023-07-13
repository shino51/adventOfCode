package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

public class BalancedBinaryTree {

  private boolean isBalanced;
  public boolean isBalanced(TreeNode root) {
    isBalanced = true;
    countDepth(0, root);

    return isBalanced;
  }

  private int countDepth(int depth, TreeNode currentNode) {
    if (!isBalanced || currentNode == null) {
      return depth;
    }

    int leftCount = countDepth(depth+1, currentNode.left);
    int rightCount = countDepth(depth+1, currentNode.right);

    if (isBalanced) {
      isBalanced = Math.abs(leftCount - rightCount) <= 1;
    }
    return Math.max(leftCount, rightCount);
  }
}
