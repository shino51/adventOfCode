package LeetCode;

import LeetCode.Utils.TreeNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SymmetricTreeCheckerTest {

  private final SymmetricTreeChecker symmetricTreeChecker = new SymmetricTreeChecker();

  @Test
  public void symmetricFound() {
    //  root = [1,2,2,3,4,4,3]
    TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
    assertThat(symmetricTreeChecker.isSymmetric(root)).isTrue();
  }

  @Test
  public void symmetricNotFound() {
    //  root = [1,2,2,null,3,null,3]
    TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3)));
    assertThat(symmetricTreeChecker.isSymmetric(root)).isFalse();
  }

  @Test
  public void rootIsNullReturnTrue() {
    TreeNode root = null;
    assertThat(symmetricTreeChecker.isSymmetric(root)).isTrue();
  }
}