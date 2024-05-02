package com.leetcode.medium;

public class StringToIntegerAtoi {

  /**
   * The algorithm for myAtoi(string s) is as follows:
   * <p>
   * Whitespace: Ignore any leading whitespace (" ").
   * Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
   * Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached.
   * If no digits were read, then the result is 0.
   * Edge case: If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
   * then round the integer to remain in the range.
   * Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
   *
   * @param s
   * @return
   */
  public int myAtoi(String s) {
    long output = 0;
    boolean isSignednessChecked = false;
    boolean isNegative = false;
    for (char ch : s.toCharArray()) {
      if (ch == ' ' && isSignednessChecked) {
        return getIntegerResult(output, isNegative);
      } else if (ch == '+' || ch == '-') {
        if (output == 0 && !isSignednessChecked) {
          isSignednessChecked = true;
          isNegative = ch == '-';
        } else {
          return getIntegerResult(output, isNegative);
        }
      } else if (Character.isDigit(ch)) {
        isSignednessChecked = true;
        if (Integer.MAX_VALUE < output) return getIntegerResult(output, isNegative);
        output = (output * 10) + Character.getNumericValue(ch);
      } else {
        return getIntegerResult(output, isNegative);
      }
    }
    return getIntegerResult(output, isNegative);
  }

  private int getIntegerResult(long output, boolean isNegative) {
    output = isNegative ? -output : output;

    if (Integer.MAX_VALUE <= output) {
      output = Integer.MAX_VALUE;
    } else if (Integer.MIN_VALUE >= output) {
      output = Integer.MIN_VALUE;
    }
    return (int) output;
  }
}
