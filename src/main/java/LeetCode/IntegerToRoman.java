package LeetCode;

public class IntegerToRoman {

  /**
   * Symbol       Value
   * I             1
   * V             5
   * X             10
   * L             50
   * C             100
   * D             500
   * M             1000
   */
  public String intToRoman(int num) {
    String[] romans = {"I", "V", "X", "L", "C", "D", "M"};
    int place = 10;
    int currentNum = num;
    int currentRomanIndex = 0;
    StringBuilder result = new StringBuilder();
    while (currentNum > 0) {
      boolean has5 = false;
      int currentLowestInt = currentNum % place;
      if (currentLowestInt == 9) {
        result.insert(0, romans[currentRomanIndex] + romans[currentRomanIndex + 2]);
        currentLowestInt = 0;
      } else if (currentLowestInt == 4) {
        result.insert(0, romans[currentRomanIndex] + romans[currentRomanIndex + 1]);
        currentLowestInt = 0;
      } else if (currentLowestInt >= 5) {
        result.insert(0, romans[currentRomanIndex + 1]);
        currentLowestInt -= 5;
        has5 = true;
      }
      int offset = has5 ? 1 : 0;
      while (currentLowestInt > 0) {
        result.insert(offset, romans[currentRomanIndex]);
        currentLowestInt--;
      }

      currentRomanIndex += 2;
      currentNum /= place;
    }
    return result.toString();
  }
}
