package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePath {

  private static final String ARRAY = "->";

  public List<String> binaryTreePaths(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }
    List<String> result = new ArrayList<>();
    generatePath(root, "", result);
    return result;
  }

  private void generatePath(TreeNode currentNode, String currentPath, List<String> result) {
    if (currentNode == null) {
      return;
    }
    if (currentPath.isEmpty()) {
      currentPath = String.valueOf(currentNode.val);
    } else {
      currentPath += (ARRAY + currentNode.val);
    }

    if (currentNode.left == null && currentNode.right == null) {
      result.add(currentPath);
    }
    generatePath(currentNode.left, currentPath, result);
    generatePath(currentNode.right, currentPath, result);
  }
}
