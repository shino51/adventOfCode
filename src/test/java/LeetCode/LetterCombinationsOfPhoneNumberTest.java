package LeetCode;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LetterCombinationsOfPhoneNumberTest {
  private final LetterCombinationsOfPhoneNumber classUnderTest = new LetterCombinationsOfPhoneNumber();

  @Test
  public void withSingleNumber() {
    String input = "2";
    List<String> result = classUnderTest.letterCombinations(input);
    assertThat(result).hasSize(3);
    assertThat(result).contains("a", "b", "c");
  }

  @Test
  public void withNoNumber() {
    String input = "";
    List<String> result = classUnderTest.letterCombinations(input);
    assertThat(result).hasSize(0);
  }

  @Test
  public void withTwoNumber() {
    String input = "23";
    List<String> result = classUnderTest.letterCombinations(input);
    assertThat(result).hasSize(9);
    assertThat(result).contains("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
  }

  @Test
  public void withFourNumber() {
    String input = "2389";
    List<String> result = classUnderTest.letterCombinations(input);
    assertThat(result).contains("adtw", "bdtw", "cdtw", "aetw", "betw", "cetw", "aftw", "bftw", "cftw", "aduw", "bduw", "cduw", "aeuw", "beuw", "ceuw", "afuw", "bfuw", "cfuw", "advw", "bdvw", "cdvw", "aevw", "bevw", "cevw", "afvw", "bfvw", "cfvw", "adtx", "bdtx", "cdtx", "aetx", "betx", "cetx", "aftx", "bftx", "cftx", "adux", "bdux", "cdux", "aeux", "beux", "ceux", "afux", "bfux", "cfux", "advx", "bdvx", "cdvx", "aevx", "bevx", "cevx", "afvx", "bfvx", "cfvx", "adty", "bdty", "cdty", "aety", "bety", "cety", "afty", "bfty", "cfty", "aduy", "bduy", "cduy", "aeuy", "beuy", "ceuy", "afuy", "bfuy", "cfuy", "advy", "bdvy", "cdvy", "aevy", "bevy", "cevy", "afvy", "bfvy", "cfvy", "adtz", "bdtz", "cdtz", "aetz", "betz", "cetz", "aftz", "bftz", "cftz", "aduz", "bduz", "cduz", "aeuz", "beuz", "ceuz", "afuz", "bfuz", "cfuz", "advz", "bdvz", "cdvz", "aevz", "bevz", "cevz", "afvz", "bfvz", "cfvz");
  }

  @Test
  public void withDuplicateNumber() {
    String input = "22";
    List<String> result = classUnderTest.letterCombinations(input);
    assertThat(result).contains("aa", "ba", "ca", "ab", "bb", "cb", "ac", "bc", "cc");
  }
}