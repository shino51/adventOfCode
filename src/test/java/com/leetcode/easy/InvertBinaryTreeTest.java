package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class InvertBinaryTreeTest {
  
  private final InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

  @Test
  public void whenInputIsNull() {
    TreeNode result = invertBinaryTree.invertTree(null);
    assertThat(result).isNull();
  }

  @Test
  public void whenTwoDeptNode() {
    TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
    TreeNode result = invertBinaryTree.invertTree(root);
    assertThat(result.val).isEqualTo(2);
    assertThat(result.left.val).isEqualTo(3);
    assertThat(result.right.val).isEqualTo(1);
  }

  @Test
  public void whenThreeDepthNode() {
    TreeNode root = new TreeNode(4,
      new TreeNode(2,
          new TreeNode(1), new TreeNode(3)
      ),
      new TreeNode(7,
          new TreeNode(6), new TreeNode(9)
      )
    );
    TreeNode result = invertBinaryTree.invertTree(root);
    assertThat(result.val).isEqualTo(4);
    // left side
    assertThat(result.left.val).isEqualTo(7);
    assertThat(result.left.left.val).isEqualTo(9);
    assertThat(result.left.right.val).isEqualTo(6);
    assertThat(result.left.right.left).isNull();
    assertThat(result.left.right.right).isNull();
    assertThat(result.left.left.left).isNull();
    assertThat(result.left.left.right).isNull();
    // right side
    assertThat(result.right.val).isEqualTo(2);
    assertThat(result.right.left.val).isEqualTo(3);
    assertThat(result.right.right.val).isEqualTo(1);
    assertThat(result.right.right.left).isNull();
    assertThat(result.right.right.right).isNull();
    assertThat(result.right.left.left).isNull();
    assertThat(result.right.left.right).isNull();
  }
}