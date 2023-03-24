package LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ExcelSheetColumnTitleTest {

  private final ExcelSheetColumnTitle classUnderTest = new ExcelSheetColumnTitle();

  @Test
  public void test1ReturnA() {
    int columnNumber = 1;
    String result = classUnderTest.convertToTitle(columnNumber);
    assertThat(result).isEqualTo("A");
  }

  @Test
  public void test26ReturnZ() {
    int columnNumber = 26;
    String result = classUnderTest.convertToTitle(columnNumber);
    assertThat(result).isEqualTo("Z");
  }

  @Test
  public void test27ReturnAA() {
    int columnNumber = 27;
    String result = classUnderTest.convertToTitle(columnNumber);
    assertThat(result).isEqualTo("AA");
  }

  @Test
  public void test28ReturnAB() {
    int columnNumber = 28;
    String result = classUnderTest.convertToTitle(columnNumber);
    assertThat(result).isEqualTo("AB");
  }

  @Test
  public void test52ReturnAZ() {
    int columnNumber = 52;
    String result = classUnderTest.convertToTitle(columnNumber);
    assertThat(result).isEqualTo("AZ");
  }
  @Test
  public void test54ReturnBB() {
    int columnNumber = 54;
    String result = classUnderTest.convertToTitle(columnNumber);
    assertThat(result).isEqualTo("BB");
  }

  @Test
  public void test701ReturnZY() {
    int columnNumber = 701;
    String result = classUnderTest.convertToTitle(columnNumber);
    assertThat(result).isEqualTo("ZY");
  }

  @Test
  public void test702ReturnZZ() {
    int columnNumber = 702;
    String result = classUnderTest.convertToTitle(columnNumber);
    assertThat(result).isEqualTo("ZZ");
  }

  @Test
  public void test703ReturnAAA() {
    int columnNumber = 703;
    String result = classUnderTest.convertToTitle(columnNumber);
    assertThat(result).isEqualTo("AAA");
  }

  @Test
  public void test1000ReturnALL() {
    int columnNumber = 1000;
    String result = classUnderTest.convertToTitle(columnNumber);
    assertThat(result).isEqualTo("ALL");
  }
}