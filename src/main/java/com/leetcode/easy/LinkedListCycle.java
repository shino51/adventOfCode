package com.leetcode.easy;

import com.leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {
  public boolean hasCycle(ListNode head) {
    List<ListNode> list = new ArrayList<>();
    return checkCycle(head, list);
  }

  public boolean checkCycle(ListNode currentNode, List<ListNode> list) {
    if (currentNode == null) {
      return false;
    } else if (list.contains(currentNode)) {
      return true;
    } else {
      list.add(currentNode);
      return checkCycle(currentNode.next, list);
    }
  }
}
