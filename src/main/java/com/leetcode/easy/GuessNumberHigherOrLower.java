package com.leetcode.easy;

public class GuessNumberHigherOrLower {

  private final int pickedNumber;

  public GuessNumberHigherOrLower(int pickedNumber) {
    this.pickedNumber = pickedNumber;
  }

  public int guessNumber(int n) {
    return guessNumber(1, n);
  }

  private int guessNumber(int left, int right) {
    int middleNumber = left + (right - left) / 2;
    int guessedNumber = guess(middleNumber);
    if (guessedNumber == 0) {
      return middleNumber;
    } else if (guessedNumber == -1) {
      // number is bigger than the picked number - should check lower number
      if (middleNumber == right) {
        return guessNumber(left, middleNumber - 1);
      }
      return guessNumber(left, middleNumber);
    } else {
      // number is smaller than the picked number - should check higher number
      if (middleNumber == left) {
        return guessNumber(middleNumber + 1, right);
      }
      return guessNumber(middleNumber, right);
    }
  }

  /**
   * Forward declaration of guess API.
   *
   * @param num your guess
   * @return -1 if num is higher than the picked number
   * 1 if num is lower than the picked number
   * otherwise return 0
   * int guess(int num);
   */
  int guess(int num) {
    return Integer.compare(pickedNumber, num);
  }
}
