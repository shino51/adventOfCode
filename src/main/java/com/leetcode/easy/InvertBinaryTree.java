package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

public class InvertBinaryTree {
  public TreeNode invertTree(TreeNode root) {
    swapLeftAndRightNodes(root);
    return root;
  }

  private void swapLeftAndRightNodes(TreeNode currentNode) {
    if (currentNode == null) {
      return;
    }
    // swap nodes
    TreeNode temp = currentNode.left;
    currentNode.left = currentNode.right;
    currentNode.right = temp;

    swapLeftAndRightNodes(currentNode.left);
    swapLeftAndRightNodes(currentNode.right);
  }
}
