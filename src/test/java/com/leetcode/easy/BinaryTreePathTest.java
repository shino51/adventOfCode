package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreePathTest {

  private final BinaryTreePath binaryTreePath = new BinaryTreePath();

  @Test
  public void testOnlyOneValue() {
    TreeNode root = new TreeNode(1);
    List<String> result = binaryTreePath.binaryTreePaths(root);
    assertThat(result).hasSize(1).containsExactly("1");
  }

  @Test
  public void testTwoPath() {
    TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
    List<String> result = binaryTreePath.binaryTreePaths(root);
    assertThat(result).hasSize(2).containsExactly("1->2->5", "1->3");
  }
}