package LeetCode;

import LeetCode.Utils.TreeNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BalancedBinaryTreeTest {

  private final BalancedBinaryTree classUnderTest = new BalancedBinaryTree();

  @Test
  public void isBalanced() {
    // [3,9,20,null,null,15,7]
    TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    boolean isBalanced = classUnderTest.isBalanced(root);
    assertThat(isBalanced).isTrue();
  }
  @Test
  public void isNotBalanced() {
    // [1,2,2,3,3,null,null,4,4]
    TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2));
    boolean isBalanced = classUnderTest.isBalanced(root);
    assertThat(isBalanced).isFalse();
  }

  @Test
  public void isNull() {
    boolean isBalanced = classUnderTest.isBalanced(null);
    assertThat(isBalanced).isTrue();
  }

  @Test
  public void isNotBalancedBetween() {
    // [1,2,2,3,null,null,3,4,null,null,4]
    TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null), new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4))));
    boolean isBalanced = classUnderTest.isBalanced(root);
    assertThat(isBalanced).isFalse();
  }

  @Test
  public void isNotBalancedBetween2() {
    // [1,2,3,4,5,null,6,7,null,null,null,null,8]
    TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(7), null), new TreeNode(5)), new TreeNode(3, null, new TreeNode(6, null, new TreeNode(8))));
    boolean isBalanced = classUnderTest.isBalanced(root);
    assertThat(isBalanced).isFalse();
  }
}