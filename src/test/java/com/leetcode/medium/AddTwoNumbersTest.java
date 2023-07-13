package com.leetcode.medium;

import com.leetcode.utils.ListNode;
import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


public class AddTwoNumbersTest {

  private AddTwoNumbers classUnderTest = new AddTwoNumbers();

  @Test
  public void test1() {
    ListNode input1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode input2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    ListNode output = classUnderTest.addTwoNumbers(input1, input2);
    assertThat(output.val, is(7));
    assertThat(output.next.val, is(0));
    assertThat(output.next.next.val, is(8));
  }

  @Test
  public void test2() {
    ListNode input1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
    ListNode input2 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))));
    ListNode output = classUnderTest.addTwoNumbers(input1, input2);
    assertThat(output.val, is(8));
    assertThat(output.next.val, is(9));
    assertThat(output.next.next.val, is(9));
    assertThat(output.next.next.next.val, is(9));
    assertThat(output.next.next.next.next.val, is(0));
    assertThat(output.next.next.next.next.next.val, is(0));
    assertThat(output.next.next.next.next.next.next.val, is(0));
    assertThat(output.next.next.next.next.next.next.next.val, is(1));
  }

  @Test
  public void test3() {
    ListNode input1 = new ListNode(0);
    ListNode input2 = new ListNode(0);
    ListNode output = classUnderTest.addTwoNumbers(input1, input2);
    assertThat(output.val, is(0));
    assertNull(output.next);
  }

  @Test
  public void test4() {
    ListNode input1 = new ListNode(9);
    ListNode input2 = new ListNode(1,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))))));
    ListNode output = classUnderTest.addTwoNumbers(input1, input2);
    assertThat(output.val, is(0));
    assertThat(output.next.val, is(0));
    assertThat(output.next.next.val, is(0));
    assertThat(output.next.next.next.val, is(0));
    assertThat(output.next.next.next.next.val, is(0));
    assertThat(output.next.next.next.next.next.val, is(0));
    assertThat(output.next.next.next.next.next.next.val, is(0));
    assertThat(output.next.next.next.next.next.next.next.val, is(0));
    assertThat(output.next.next.next.next.next.next.next.next.val, is(0));
    assertThat(output.next.next.next.next.next.next.next.next.next.val, is(0));
    assertThat(output.next.next.next.next.next.next.next.next.next.next.val, is(1));
    assertNull(output.next.next.next.next.next.next.next.next.next.next.next);
  }
}