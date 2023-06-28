package com.leetcode.easy;

import com.leetcode.Utils.TreeNode;

public class SameTree {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    } else if (p == null || q == null) {
      return false;
    }
    if(p.val != q.val) {
      return false;
    }
    boolean isLeftValueEqual = isSameTree(p.left, q.left);
    boolean isRightValueEqual = isSameTree(p.right, q.right);

    return isLeftValueEqual && isRightValueEqual;
  }
}
