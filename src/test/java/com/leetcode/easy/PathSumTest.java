package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PathSumTest {

  private final PathSum classUnderTest = new PathSum();

  @Test
  public void testWithInputNull() {
    boolean result = classUnderTest.hasPathSum(null, 0);

    assertThat(result).isFalse();
  }
  @Test
  public void testWithOneInputTrue() {
    TreeNode root = new TreeNode(3);
    boolean result = classUnderTest.hasPathSum(root, 3);

    assertThat(result).isTrue();
  }

  @Test
  public void testWithOneInputFalse() {
    TreeNode root = new TreeNode(4);
    boolean result = classUnderTest.hasPathSum(root, 3);

    assertThat(result).isFalse();
  }

  @Test
  public void testWithTwoNodeTrue() {
    TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    boolean result = classUnderTest.hasPathSum(root, 3);

    assertThat(result).isTrue();
  }

  @Test
  public void testWithTwoNodeFalse() {
    TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    boolean result = classUnderTest.hasPathSum(root, 5);

    assertThat(result).isFalse();
  }

  @Test
  public void testWithTwoNodeOnlyOneLeafFalse() {
    TreeNode root = new TreeNode(1, new TreeNode(2), null);
    boolean result = classUnderTest.hasPathSum(root, 1);

    assertThat(result).isFalse();
  }

  @Test
  public void testWithMultipleNodeTrue() {
    TreeNode root = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
    boolean result = classUnderTest.hasPathSum(root, 22);

    assertThat(result).isTrue();
  }

  @Test
  public void testWithMinusValueTrue() {
    TreeNode root = new TreeNode(-2, null, new TreeNode(-3));
    boolean result = classUnderTest.hasPathSum(root, -5);

    assertThat(result).isTrue();
  }

}