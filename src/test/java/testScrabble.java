import org.junit.*;
import static org.junit.Assert.*;

public class testScrabble {

  @Test
  public void score_aIsOne_int() {
    Scrabble testScrabble = new Scrabble();
    testScrabble.setInputtedWord("a");
    int expectedScore = 1;
    assertEquals(expectedScore, testScrabble.letterScore());
  }
  @Test
  public void score_valueOneLettersEqualOne_int() {
    Scrabble testScrabble = new Scrabble();
    testScrabble.setInputtedWord("n");
    int expectedScore = 1;
    assertEquals(expectedScore, testScrabble.letterScore());
  }
  @Test
  public void score_valueTwoLettersEqualTwo_int() {
    Scrabble testScrabble = new Scrabble();
    testScrabble.setInputtedWord("g");
    int expectedScore = 2;
    assertEquals(expectedScore, testScrabble.letterScore());
  }
  @Test
  public void score_wordAddsUpCorrectly_int() {
      Scrabble testScrabble = new Scrabble();
      testScrabble.setInputtedWord("get");
      int expectedScore = 4;
      assertEquals(expectedScore, testScrabble.letterScore());
  }
  @Test
  public void score_wordAddsUpToTwenty_int() {
      Scrabble testScrabble = new Scrabble();
      testScrabble.setInputtedWord("kookaburra");
      int expectedScore = 20;
      assertEquals(expectedScore, testScrabble.letterScore());
  }
}
