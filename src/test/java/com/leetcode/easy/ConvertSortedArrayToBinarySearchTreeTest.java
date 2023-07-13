package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertSortedArrayToBinarySearchTreeTest {

  private final ConvertSortedArrayToBinarySearchTree classUnderTest = new ConvertSortedArrayToBinarySearchTree();

  @Test
  public void test1() {
    int[] input = {-10, -3, 0, 5, 9};
    TreeNode resultRoot = classUnderTest.sortedArrayToBST(input);
    assertThat(resultRoot.val).isZero();
    assertThat(resultRoot.left).isNotNull();
    assertThat(resultRoot.left.val).matches(value -> value == -3 || value == -10);
  }

  @Test
  public void testWith2Number() {
    int[] input = {1, 3};
    TreeNode resultRoot = classUnderTest.sortedArrayToBST(input);
    assertThat(resultRoot.val).isEqualTo(1);
    assertThat(resultRoot.right.val).isEqualTo(3);
  }

  @Test
  public void testWith4Number() {
    int[] input = {0, 1, 2, 3};
    TreeNode resultRoot = classUnderTest.sortedArrayToBST(input);
    assertThat(resultRoot.val).isEqualTo(1);
    assertThat(resultRoot.left.val).isZero();
    assertThat(resultRoot.right.val).isEqualTo(2);
  }

  @Test
  public void test2() {
    int[] input = {0, 1, 2, 3, 4, 5};
    TreeNode resultRoot = classUnderTest.sortedArrayToBST(input);
    assertThat(resultRoot.val).isEqualTo(3);
    assertThat(resultRoot.left).isNotNull();
    assertThat(resultRoot.left.val).isEqualTo(1);
    assertThat(resultRoot.right.val).isEqualTo(5);
    assertThat(resultRoot.left.left.val).isZero();
    assertThat(resultRoot.left.right.val).isEqualTo(2);
    assertThat(resultRoot.right.left.val).isEqualTo(4);
  }


}