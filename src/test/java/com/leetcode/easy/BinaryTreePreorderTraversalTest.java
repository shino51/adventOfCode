package com.leetcode.easy;

import com.leetcode.Utils.TreeNode;
import com.leetcode.easy.BinaryTreePreorderTraversal;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BinaryTreePreorderTraversalTest {

  private final BinaryTreePreorderTraversal classUnderTest = new BinaryTreePreorderTraversal();

  @Test
  public void testWithOneNode() {
    TreeNode root = new TreeNode(1);
    List<Integer> result = classUnderTest.preorderTraversal(root);

    assertThat(result).hasSize(1);
    assertThat(result.get(0)).isEqualTo(1);
  }
  @Test
  public void testWithNullNode() {
    List<Integer> result = classUnderTest.preorderTraversal(null);

    assertThat(result).hasSize(0);
  }

  @Test
  public void testWithThreeNode() {
    TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    List<Integer> result = classUnderTest.preorderTraversal(root);

    assertThat(result).hasSize(3);
    assertThat(result.get(0)).isEqualTo(1);
    assertThat(result.get(1)).isEqualTo(2);
    assertThat(result.get(2)).isEqualTo(3);
  }

  @Test
  public void testWithComplexStructuredNode() {
    TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(4, null, new TreeNode(5)));
    List<Integer> result = classUnderTest.preorderTraversal(root);

    assertThat(result).hasSize(5);
    assertThat(result.get(0)).isEqualTo(1);
    assertThat(result.get(1)).isEqualTo(2);
    assertThat(result.get(2)).isEqualTo(3);
    assertThat(result.get(3)).isEqualTo(4);
    assertThat(result.get(4)).isEqualTo(5);
  }
}