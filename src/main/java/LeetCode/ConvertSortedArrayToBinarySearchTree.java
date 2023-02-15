package LeetCode;

import LeetCode.Utils.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

  public TreeNode sortedArrayToBST(int[] nums) {
    return createBST(nums, 0, nums.length - 1);
  }

  private TreeNode createBST(int[] numbers, int left, int right) {
    if (left > right) {
      return null;
    } else if (left == right) {
      return new TreeNode(numbers[left]);
    }
    // find middle point
    int midIndex = (right + left) / 2;
    int mid = numbers[midIndex];

    // create mode based on the middle point
    // importance of this is to exclude the middle point. LeftNode only contains the left side of the middle point, right side vice verse
    TreeNode leftNode = createBST(numbers, left, midIndex - 1);
    TreeNode rightNode = createBST(numbers, midIndex + 1, right);
    return new TreeNode(mid, leftNode, rightNode);
  }
}
