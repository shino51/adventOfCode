package com.leetcode.easy;

import com.leetcode.Utils.TreeNode;

import static java.lang.Math.min;

public class BinaryTreeFindSecondSmaller {
  public int findSecondMinimumValue(TreeNode root) {
    Integer minValue = root.val;
    Integer secondMinValue = findValue(root, minValue, null);

    if (secondMinValue == null || secondMinValue.equals(minValue)) {
      return -1;
    }
    return secondMinValue;
  }

  private Integer findValue(TreeNode parent, Integer minValue, Integer secondMinValue) {
    if (parent == null) {
      return secondMinValue;
    }

    // first value assignment
    if (secondMinValue == null || secondMinValue.equals(minValue)) {
      secondMinValue = parent.val;
    }

    // if it is still the same as minimum value, go to next recursion
    if (parent.val == minValue) {
      secondMinValue = findValue(parent.left, minValue, secondMinValue);
      secondMinValue = findValue(parent.right, minValue, secondMinValue);
      return secondMinValue;
    }

    return min(secondMinValue, parent.val);
  }
}