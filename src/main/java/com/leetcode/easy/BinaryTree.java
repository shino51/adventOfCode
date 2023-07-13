package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    assignChild(root, result);
    return result;
  }

  public void assignChild(TreeNode parent, List<Integer> list) {
    if(parent == null) {
      return;
    }

    assignChild(parent.left, list);
    assignChild(parent.right, list);

    list.add(parent.val);
  }
}

