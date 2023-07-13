package com.leetcode.easy;

import com.leetcode.TestUtils.BinaryTreeCreator;
import com.leetcode.utils.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BinaryTreeTest {

  private final BinaryTree binaryTree = new BinaryTree();

  @Test
  public void nullNode() {
    TreeNode root = null;
    List<Integer> result = binaryTree.postorderTraversal(root);
    assertThat(result.toString(), is("[]"));
  }

  @Test
  public void oneNode() {
    TreeNode root = new TreeNode(1);
    List<Integer> result = binaryTree.postorderTraversal(root);
    assertThat(result.toString(), is("[1]"));
  }

  @Test
  public void twoNode() {
    TreeNode root = new TreeNode(1);
    List<Integer> result = binaryTree.postorderTraversal(root);
    assertThat(result.toString(), is("[1]"));
  }

  @Test
  public void threeTree() {
    Integer[] array = new Integer[]{1,null,2, null, null, 3};
    TreeNode root = new TreeNode(array[0]);
    root = BinaryTreeCreator.insertLevelOrder(array, root, 0);
    List<Integer> result = binaryTree.postorderTraversal(root);
    assertThat(result.toString(), is("[3, 2, 1]"));
  }
}