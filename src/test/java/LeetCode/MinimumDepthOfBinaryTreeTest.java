package LeetCode;

import LeetCode.Utils.TreeNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MinimumDepthOfBinaryTreeTest {

  private final MinimumDepthOfBinaryTree classUnderTest = new MinimumDepthOfBinaryTree();

  @Test
  public void test1() {
    TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    int result = classUnderTest.minDepth(root);
    assertThat(result).isEqualTo(2);
  }

  @Test
  public void test2() {
    TreeNode root = new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));

    assertThat(classUnderTest.minDepth(root)).isEqualTo(5);
  }

  @Test
  public void whenInputIsNull() {
    TreeNode root = null;
    assertThat(classUnderTest.minDepth(root)).isEqualTo(0);

  }
}