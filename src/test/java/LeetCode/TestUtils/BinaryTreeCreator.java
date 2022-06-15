package LeetCode.TestUtils;

import LeetCode.Utils.TreeNode;

public class BinaryTreeCreator {
  // create tree node
  public static TreeNode insertLevelOrder(Integer[] array, TreeNode parent, int index) {
    // Base case for recursion
    if (index < array.length) {
      if (array[index] == null) {
        return null;
      }
      TreeNode temp = new TreeNode(array[index]);
      parent = temp;
      // insert left child
      parent.left = insertLevelOrder(array, parent.left, 2 * index + 1);

      // insert right child
      parent.right = insertLevelOrder(array, parent.right, 2 * index + 2);
    }
    return parent;
  }
}
