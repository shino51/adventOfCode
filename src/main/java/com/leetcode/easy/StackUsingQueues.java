package com.leetcode.easy;

import java.util.LinkedList;

public class StackUsingQueues {

  private LinkedList<Integer> list;

  public StackUsingQueues() {
    list = new LinkedList<>();
  }

  public void push(int x) {
    list.addFirst(x);
  }

  public int pop() {
    return list.poll();
  }

  public int top() {
    return list.getFirst();
  }

  public boolean empty() {
    return list.isEmpty();
  }
}
