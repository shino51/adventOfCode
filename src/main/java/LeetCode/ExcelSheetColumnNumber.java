package LeetCode;

public class ExcelSheetColumnNumber {

  public int titleToNumber(String columnTitle) {
    char[] titles = columnTitle.toCharArray();
    int place = 0;
    int sum = 0;
    int aIndex = 'A';

    for (int i = titles.length - 1; i >= 0; i--) {
      char title = titles[i];
      int numberFromA = title + 1 - aIndex;
      sum += numberFromA * Math.pow(26, place);
      place++;
    }

    return sum;
  }
}
