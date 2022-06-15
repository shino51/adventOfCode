package LeetCode;

import LeetCode.Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root.val == null) {
      return result;
    }

    assignChild(root, result);
    return result;
  }

  public void assignChild(TreeNode parent, List<Integer> list) {
    if(parent == null) {
      return;
    }

    assignChild(parent.left, list);
    assignChild(parent.right, list);

    list.add(parent.val);
  }
}

