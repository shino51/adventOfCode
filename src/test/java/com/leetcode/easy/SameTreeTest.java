package com.leetcode.easy;

import com.leetcode.Utils.TreeNode;
import com.leetcode.easy.SameTree;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SameTreeTest {

  private final SameTree classUnderTest = new SameTree();

  @Test
  public void simpleTreesReturnTrue() {
    TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

    assertThat(classUnderTest.isSameTree(p, q)).isTrue();
  }

  @Test
  public void simpleTreesReturnFalse() {
    TreeNode p = new TreeNode(1, new TreeNode(2), null);
    TreeNode q = new TreeNode(1,null, new TreeNode(2));

    assertThat(classUnderTest.isSameTree(p, q)).isFalse();
  }
  @Test
  public void whenRootsAreNullReturnTrue() {
    assertThat(classUnderTest.isSameTree(null, null)).isTrue();
  }
}