package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class InorderTraversalTest {

  private final InorderTraversal classUnderTest = new InorderTraversal();

  @Test
  public void testWIth3Nodes() {
    // Input: root = [1,null,2,3]
    TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
    List<Integer> result = classUnderTest.inorderTraversal(root);

    assertThat(result).isNotNull().containsExactly(1,3,2);
  }

  @Test
  public void testWithThreeNodeWithoutNull() {
    // Input: root = [3,1,2]
    TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(2));
    List<Integer> result = classUnderTest.inorderTraversal(root);

    assertThat(result).isNotNull().containsExactly(1,3,2);
  }

  @Test
  public void testWhenRootIsNull() {
    TreeNode root = null;
    List<Integer> result = classUnderTest.inorderTraversal(root);

    assertThat(result).isNotNull().isEmpty();
  }

  @Test
  public void testWhenOnlyOneNode() {
    TreeNode root = new TreeNode(1);
    List<Integer> result = classUnderTest.inorderTraversal(root);

    assertThat(result).isNotNull().containsExactly(1);
  }
}