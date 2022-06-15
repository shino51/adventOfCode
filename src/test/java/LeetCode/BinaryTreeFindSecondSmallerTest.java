package LeetCode;

import LeetCode.TestUtils.BinaryTreeCreator;
import LeetCode.Utils.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeFindSecondSmallerTest {

  private BinaryTreeFindSecondSmaller finder = new BinaryTreeFindSecondSmaller();

  @Test
  public void allSameValue() {
    Integer[] array = new Integer[]{2,2,2};
    TreeNode root = new TreeNode(array[0]);
    root = BinaryTreeCreator.insertLevelOrder(array, root, 0);
    int result = finder.findSecondMinimumValue(root);
    assertThat(result, is(-1));
  }

  @Test
  public void allSameValueBigNumber() {
    Integer[] array = new Integer[]{2147483647,2147483647,2147483647};
    TreeNode root = new TreeNode(array[0]);
    root = BinaryTreeCreator.insertLevelOrder(array, root, 0);
    int result = finder.findSecondMinimumValue(root);
    assertThat(result, is(-1));
  }

  @Test
  public void onlyOneNode() {
    Integer[] array = new Integer[]{2,2,3};
    TreeNode root = new TreeNode(array[0]);
    root = BinaryTreeCreator.insertLevelOrder(array, root, 0);
    int result = finder.findSecondMinimumValue(root);
    assertThat(result, is(3));
  }

  @Test
  public void threeNode() {
    Integer[] array = new Integer[]{2,2,5,null,null,5,7};
    TreeNode root = new TreeNode(array[0]);
    root = BinaryTreeCreator.insertLevelOrder(array, root, 0);
    int result = finder.findSecondMinimumValue(root);
    assertThat(result, is(5));
  }
  @Test
  public void multipleNode() {
    Integer[] array = new Integer[]{1,1,3,1,1,3,4,3,1,1,1,3,8,4,8,3,3,1,6,2,1};
    TreeNode root = new TreeNode(array[0]);
    root = BinaryTreeCreator.insertLevelOrder(array, root, 0);
    int result = finder.findSecondMinimumValue(root);
    assertThat(result, is(2));
  }
}