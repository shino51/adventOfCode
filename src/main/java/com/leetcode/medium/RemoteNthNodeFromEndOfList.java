package com.leetcode.medium;

import com.leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RemoteNthNodeFromEndOfList {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    List<ListNode> list = new ArrayList<>();
    addListNodeToList(list, head);
    int maxIndex = list.size();
    int indexToRemove = maxIndex - n;

    ListNode nextNode = null;

    if (indexToRemove + 1 < maxIndex) {
      nextNode = list.get(indexToRemove + 1);
    }

    // first index cannot be removed
    if (indexToRemove > 0) {
      ListNode previousNode = list.get(indexToRemove - 1);
      // now skip the node
      previousNode.next = nextNode;
    } else {
      return head.next;
    }
    return head;
  }

  void addListNodeToList(List<ListNode> list, ListNode currentNode) {
    if (currentNode != null) {
      list.add(currentNode);
      addListNodeToList(list, currentNode.next);
    }
  }
}
