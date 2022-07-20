package LeetCode;

import java.util.stream.IntStream;

public class PlusOne {
  public int[] plusOne(int[] digits) {
    int length = digits.length;
    int index = length-1;
    boolean requireIncrement = true;
    while(index >= 0 && requireIncrement) {
      if(digits[index] == 9) {
        // carry the number
        digits[index] = 0;
        index--;
      } else {
        requireIncrement = false;
        digits[index]++;
      }
    }
    // which means the first element is also 9. Need to carry it to 10
    if(requireIncrement) {
      int[] output = new int[length+1];
      IntStream.range(0, length)
        .forEach(i -> output[i+1] = digits[i]);
      output[0] = 1;
      output[1] = 0;
      return output;
    }
    return digits;
   }
}
