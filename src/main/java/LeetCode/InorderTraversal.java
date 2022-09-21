package LeetCode;

import LeetCode.Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    // get the most right node
    assignNodeValue(root, result);
    return result;
  }

  private void assignNodeValue(TreeNode currentNode, List<Integer> list) {
    if (currentNode == null) {
      return;
    }
    assignNodeValue(currentNode.left, list);
    list.add(currentNode.val);
    assignNodeValue(currentNode.right, list);
  }
}
