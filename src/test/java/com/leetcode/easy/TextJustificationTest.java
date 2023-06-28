package com.leetcode.easy;

import com.leetcode.easy.TextJustification;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TextJustificationTest {

  private TextJustification textJustification = new TextJustification();

  @Test
  public void oneWordWithSameLength() {
    String[] words = {"Test"};
    int maxLength = 4;
    List<String> output = textJustification.fullJustify(words, maxLength);
    assertThat(output.toString(), is("[Test]"));
  }

  @Test
  public void oneWordWithDifferentLength() {
    String[] words = {"Test"};
    int maxLength = 10;
    List<String> output = textJustification.fullJustify(words, maxLength);
    assertThat(output.toString(), is("[Test      ]"));
  }

  @Test
  public void twoWordsExact() {
    String[] words = {"Test", "input"};
    int maxLength = 10;
    List<String> output = textJustification.fullJustify(words, maxLength);
    assertThat(output.toString(), is("[Test input]"));
  }

  @Test
  public void twoWordsSpaceAtEnd() {
    String[] words = {"Test", "input"};
    int maxLength = 11;
    List<String> output = textJustification.fullJustify(words, maxLength);
    assertThat(output.toString(), is("[Test input ]"));
  }

  @Test
  public void twoLine() {
    String[] words = {"This", "is", "an", "example", "of", "text"};
    int maxLength = 16;
    List<String> output = textJustification.fullJustify(words, maxLength);
    assertThat(output.size(), is(2));
    assertThat(output.get(0), is("This    is    an"));
    assertThat(output.get(1), is("example of text "));
  }

  @Test
  public void oneWordAtEnd() {
    String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
    int maxLength = 16;
    List<String> output = textJustification.fullJustify(words, maxLength);
    assertThat(output.get(0), is("This    is    an"));
    assertThat(output.get(1), is("example  of text"));
    assertThat(output.get(2), is("justification.  "));
  }

  @Test
  public void twoWordAtEnd() {
    String[] words = {"This", "is", "an", "example", "of", "text", "justi", "fication"};
    int maxLength = 16;
    List<String> output = textJustification.fullJustify(words, maxLength);
    assertThat(output.get(0), is("This    is    an"));
    assertThat(output.get(1), is("example  of text"));
    assertThat(output.get(2), is("justi fication  "));
  }

  @Test
  public void oneWordInMiddle() {
    String[] words = {"What","must","be","acknowledgment","shall","be"};
    int maxLength = 16;
    List<String> output = textJustification.fullJustify(words, maxLength);
    assertThat(output.get(0), is("What   must   be"));
    assertThat(output.get(1), is("acknowledgment  "));
    assertThat(output.get(2), is("shall be        "));
  }
}