package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    convertToListPreorder(list, root);
    return list;
  }

  private void convertToListPreorder(List<Integer> list, TreeNode currentNode) {
    if (currentNode == null) {
      return;
    }
    list.add(currentNode.val);
    convertToListPreorder(list, currentNode.left);
    convertToListPreorder(list, currentNode.right);
  }
}
