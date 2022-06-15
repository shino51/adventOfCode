package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999]
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 */

public class RomanToInteger {
  public int romanToInt(String s) {
    char[] romans = s.toCharArray();
    Map<Character, Integer> categories = createCategories();
    int result = 0;
    for (int i = 0; i < romans.length; i++) {
      char roman = romans[i];
      if (i+1 < romans.length && shouldSubtract(roman, romans[i+1])) {
        result -= categories.get(roman);
      } else {
        result += categories.get(roman);
      }
    }
    return result;
  }

  private Map<Character, Integer> createCategories() {
    Map<Character, Integer> categories = new HashMap<>();
    categories.put('I', 1);
    categories.put('V', 5);
    categories.put('X', 10);
    categories.put('L', 50);
    categories.put('C', 100);
    categories.put('D', 500);
    categories.put('M', 1000);
    return categories;
  }
  /**
   * I can be placed before V (5) and X (10) to make 4 and 9.
   * X can be placed before L (50) and C (100) to make 40 and 90.
   * C can be placed before D (500) and M (1000) to make 400 and 900.
   */
  private boolean shouldSubtract(char roman1, char roman2) {
    return (roman1 == 'I' && (roman2 == 'V' || roman2 == 'X'))
      || (roman1 == 'X' && (roman2 == 'L' || roman2 == 'C'))
      || (roman1 == 'C' && (roman2 == 'D' || roman2 == 'M'));
  }
}
