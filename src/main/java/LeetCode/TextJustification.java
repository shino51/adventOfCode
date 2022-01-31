package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/text-justification/
 */
class TextJustification {
  List<String> fullJustify(String[] words, int maxWidth) {
    List<String> output = new ArrayList<>();
    int remainingWidth = maxWidth;
    List<String> wordsListForLine = new ArrayList<>();
    for (String word : words) {
      int wordLength = word.length();
      if (!wordsListForLine.isEmpty() && remainingWidth >= wordLength + 1) {
        // add space as word separator
        wordsListForLine.add(" ");
        remainingWidth--;
      }

      if (remainingWidth >= wordLength) {
        wordsListForLine.add(word);
        remainingWidth -= wordLength;
      } else {
        // add existing line to the list
        String line = justifyStringsToLine(wordsListForLine, remainingWidth);
        output.add(line);

        // add current word to the new line list
        wordsListForLine = new ArrayList<>();
        wordsListForLine.add(word);
        // reset remaining width for next iteration
        remainingWidth = maxWidth - word.length();
      }
    }
    // add last line (no extra space between but space at the end)
    String lastLine = String.join("", wordsListForLine) + createSpaces(remainingWidth);
    output.add(lastLine);
    return output;
  }

  private String justifyStringsToLine(List<String> words, int remainingWidth) {
    int listSize = words.size();
    if (words.isEmpty()) {
      return createSpaces(remainingWidth);
    }
    if (listSize == 1) {
      return words.get(0) + createSpaces(remainingWidth);
    }

    int index = 1;
    // add extra space between words until the line length becomes max length
    while (remainingWidth > 0) {
      if (listSize <= index) {
        // reset index
        index = 1;
      }
      words.set(index, words.get(index) + " ");
      remainingWidth--;
      index += 2;
    }
    return String.join("", words);
  }

  private String createSpaces(int number) {
    return IntStream.range(0, number).mapToObj(i -> " ").collect(Collectors.joining());
  }
}