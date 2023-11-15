package com.leetcode.easy;

import com.leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
  public boolean isPalindrome(ListNode head) {
    List<Integer> list = new ArrayList<>();
    addList(list, head);
    int currentIndex = 0;
    int currentIndexFromBackward = list.size() - 1;

    while (currentIndex < currentIndexFromBackward) {
      if (!list.get(currentIndex).equals(list.get(currentIndexFromBackward))) {
        return false;
      }
      currentIndex++;
      currentIndexFromBackward--;
    }
    return true;
  }

  private void addList(List<Integer> list, ListNode currentNode) {
    list.add(currentNode.val);
    if (currentNode.next != null) {
      addList(list, currentNode.next);
    }
  }
}
