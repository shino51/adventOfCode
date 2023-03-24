package LeetCode;

public class ExcelSheetColumnTitle {
  private static final int NUMBER_OF_ALPHABET = 26;

  public String convertToTitle(int columnNumber) {
    int digits = getDigits(columnNumber);
    StringBuilder result = new StringBuilder();
    int currentColumnNumber = columnNumber;
    for (int i = 0; i <= digits; i++) {
      if (currentColumnNumber == 0) {
        break;
      }
      int index = currentColumnNumber % NUMBER_OF_ALPHABET;
      if (index == 0) {
        index = NUMBER_OF_ALPHABET;
        currentColumnNumber -= 1;
      }
      index += 'A' - 1;
      currentColumnNumber /= NUMBER_OF_ALPHABET;
      result.insert(0, (char) index);
    }
    return result.toString();
  }

  private int getDigits(int columnNumber) {
    if (columnNumber <= NUMBER_OF_ALPHABET) {
      return 0;
    }
    int digits = 1;
    int residual = columnNumber / NUMBER_OF_ALPHABET;
    while (residual > NUMBER_OF_ALPHABET) {
      residual /= NUMBER_OF_ALPHABET;
      digits++;
    }
    return digits;
  }
}
