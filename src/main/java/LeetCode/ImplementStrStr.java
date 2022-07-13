package LeetCode;

public class ImplementStrStr {

  public int strStr(String haystack, String needle) {
    if(needle == null || needle.isBlank()) return 0;
    if(haystack == null || haystack.isBlank()) return -1;
    return haystack.indexOf(needle);
  }
}
