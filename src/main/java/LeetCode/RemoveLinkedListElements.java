package LeetCode;

import LeetCode.Utils.ListNode;

public class RemoveLinkedListElements {


  public ListNode removeElements(ListNode head, int val) {
    return removeElements(head, null, head, val);
  }

  public ListNode removeElements(ListNode head, ListNode previous, ListNode current, int val) {
    if (current == null) {
      return head;
    }
    if (current.val == val) {
      if (previous == null) {
        return removeElements(current.next, null, current.next, val);
      } else {
        previous.next = current.next;
        removeElements(head, previous, current.next, val);
      }
    }
    return removeElements(head, current, current.next, val);
  }
}
