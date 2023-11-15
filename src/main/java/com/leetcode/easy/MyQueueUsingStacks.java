package com.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Implement a first in first out (FIFO) queue using only two stacks.
 * The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
 */
public class MyQueueUsingStacks {
  /**
   * Your MyQueue object will be instantiated and called as such:
   * MyQueue obj = new MyQueue();
   * obj.push(x);
   * int param_2 = obj.pop();
   * int param_3 = obj.peek();
   * boolean param_4 = obj.empty();
   */

  private final Deque<Integer> stack;

  public MyQueueUsingStacks() {
    stack = new ArrayDeque<>();
  }

  public void push(int x) {
    stack.addLast(x);
  }

  public int pop() {
    return stack.pop();
  }

  public int peek() {
    return stack.peek();
  }

  public boolean empty() {
    return stack.isEmpty();
  }
}
