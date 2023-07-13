package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MaxDepthOfBinaryTreeTest {

  private final MaxDepthOfBinaryTree classUnderTest = new MaxDepthOfBinaryTree();

  @Test
  public void rootIsNull() {
    int depth = classUnderTest.maxDepth(null);
    assertThat(depth).isZero();
  }

  @Test
  public void onlyOneRoot() {
    TreeNode root = new TreeNode(1);
    int depth = classUnderTest.maxDepth(root);
    assertThat(depth).isEqualTo(1);
  }

  @Test
  public void threeDepth() {
    // Input: root = [3,9,20,null,null,15,7]
    TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    int depth = classUnderTest.maxDepth(root);
    assertThat(depth).isEqualTo(3);
  }

  @Test
  public void twoDepth() {
    // Input: root = [3,9,20,null,null,15,7]
    TreeNode root = new TreeNode(1, null, new TreeNode(2));
    int depth = classUnderTest.maxDepth(root);
    assertThat(depth).isEqualTo(2);
  }
}