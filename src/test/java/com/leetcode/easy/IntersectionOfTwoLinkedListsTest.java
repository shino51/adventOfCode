package com.leetcode.easy;

import com.leetcode.Utils.ListNode;
import com.leetcode.easy.IntersectionOfTwoLinkedLists;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class IntersectionOfTwoLinkedListsTest {

  private final IntersectionOfTwoLinkedLists classUnderTest = new IntersectionOfTwoLinkedLists();

  @Test
  public void testInterceptionAtPosition2() {
    ListNode interceptNode = new ListNode(8, new ListNode(4, new ListNode()));
    ListNode headA = new ListNode(4, new ListNode(1, interceptNode));
    ListNode headB = new ListNode(5, new ListNode(6, interceptNode));

    ListNode result = classUnderTest.getIntersectionNode(headA, headB);
    assertThat(result).isEqualTo(interceptNode);
  }

  @Test
  public void testInterceptionWhereHeadAIsIntercept() {
    ListNode headA = new ListNode(4, new ListNode(1));
    ListNode headB = new ListNode(5, new ListNode(6, headA));

    ListNode result = classUnderTest.getIntersectionNode(headA, headB);
    assertThat(result).isEqualTo(headA);
  }

  @Test
  public void testInterceptionWhereHeadBIsIntercept() {
    ListNode headB = new ListNode(5, new ListNode(6));
    ListNode headA = new ListNode(4, new ListNode(1, headB));

    ListNode result = classUnderTest.getIntersectionNode(headA, headB);
    assertThat(result).isEqualTo(headB);
  }


  @Test
  public void testWhenNoInterception() {
    ListNode headA = new ListNode(4, new ListNode(1));
    ListNode headB = new ListNode(5, new ListNode(6));

    ListNode result = classUnderTest.getIntersectionNode(headA, headB);
    assertThat(result).isNull();
  }

  @Test
  public void testWhenHeadAIsNull() {
    ListNode headB = new ListNode(5, new ListNode(6));

    ListNode result = classUnderTest.getIntersectionNode(null, headB);
    assertThat(result).isNull();
  }

  @Test
  public void testWhenHeadBIsNull() {
    ListNode headA = new ListNode(5, new ListNode(6));

    ListNode result = classUnderTest.getIntersectionNode(headA, null);
    assertThat(result).isNull();
  }

  @Test
  public void testWhenBothHeadsAreNull() {
    ListNode result = classUnderTest.getIntersectionNode(null, null);
    assertThat(result).isNull();
  }
}