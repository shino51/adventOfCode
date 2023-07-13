package com.leetcode.medium;

import java.util.*;
import java.util.stream.Stream;

public class LetterCombinationsOfPhoneNumber {

  private static final Map<Integer, String> numberMap = new HashMap<>();

  public List<String> letterCombinations(String digits) {
    if (digits.isEmpty()) {
      return Collections.emptyList();
    }
    addMap();
    List<String> result = new ArrayList<>();
    int[] digitsArray = Stream.of(digits.split("")).mapToInt(Integer::parseInt).toArray();

    // get all the possible letters
    for (int i = 0; i < digitsArray.length; i++) {
      result = combine(result, numberMap.get(digitsArray[i]));
    }

    return result;
  }

  private List<String> combine(List<String> list, String letters) {
    List<String> result = new ArrayList<>();
    boolean isFirstIteration = list.isEmpty();
    for (char letter : letters.toCharArray()) {
      if (isFirstIteration) {
        result.add(String.valueOf(letter));
      } else {
        for (String content : list) {
          result.add(content + letter);
        }
      }
    }
    return result;
  }

  private void addMap() {
    if (numberMap.size() == 0) {
      numberMap.putIfAbsent(2, "abc");
      numberMap.putIfAbsent(3, "def");
      numberMap.putIfAbsent(4, "ghi");
      numberMap.putIfAbsent(5, "jkl");
      numberMap.putIfAbsent(6, "mno");
      numberMap.putIfAbsent(7, "pqrs");
      numberMap.putIfAbsent(8, "tuv");
      numberMap.putIfAbsent(9, "wxyz");
    }
  }
}
