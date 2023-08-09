package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CountCompleteTreeNodesTest {

  private final CountCompleteTreeNodes countCompleteTreeNodes = new CountCompleteTreeNodes();

  @Test
  void inputNodeIsNull() {
    int result = countCompleteTreeNodes.countNodes(null);
    assertThat(result).isZero();
  }

  @Test
  void inputNodeIsOne() {
    TreeNode root = new TreeNode(1);
    int result = countCompleteTreeNodes.countNodes(root);
    assertThat(result).isOne();
  }

  @Test
  void inputNodeIsSix() {
    TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
    int result = countCompleteTreeNodes.countNodes(root);
    assertThat(result).isEqualTo(6);
  }



  @Test
  void inputNodeIsFive() {
    TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, null, null));
    int result = countCompleteTreeNodes.countNodes(root);
    assertThat(result).isEqualTo(5);
  }
}