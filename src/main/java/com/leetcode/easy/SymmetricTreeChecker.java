package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

public class SymmetricTreeChecker {

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    return isSymmetric(root.left, root.right);
  }

  private boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
    if (leftNode == null && rightNode == null) {
      return true;
    } else if (leftNode == null || rightNode == null) {
      return false;
    }
    // compare values and further nodes
    if (leftNode.val != rightNode.val) {
      return false;
    }
    boolean symmetricCheck1 = isSymmetric(leftNode.left, rightNode.right);
    boolean symmetricCheck2 = isSymmetric(leftNode.right, rightNode.left);

    return symmetricCheck1 && symmetricCheck2;
  }
}
