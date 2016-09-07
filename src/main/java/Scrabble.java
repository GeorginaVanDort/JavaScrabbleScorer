public class Scrabble {
  private int score = 0;
  private String[] letters1 = {"a", "e", "i", "o", "u","l","n","s","t","r"};
  private String[] letters2 = {"d", "g"};
  private String[] letters3 = {"b", "c", "m", "p"};
  private String[] letters4 = {"f", "h", "v", "w", "y"};
  private String[] letters5 = {"k"};
  private String[] letters8 = {"j", "x"};
  private String[] letters10 = {"q", "z"};


  private String[] inputtedWord;

  public void setInputtedWord(String word) {
    inputtedWord = word.split("");
  }
  public int letterScore() {
    Scores one = new Scores(letters1, 1);
    Scores two = new Scores(letters2, 2);
    Scores three = new Scores(letters3, 3);
    Scores four = new Scores(letters4, 4);
    Scores five = new Scores(letters5, 5);
    Scores eight = new Scores(letters8, 8);
    Scores ten = new Scores(letters10, 10);

    Scores[] scoreObjects = {one, two, three, four, five, eight, ten};
    for (String wordLetter: inputtedWord) {
      for (Scores scoreObject : scoreObjects) {
        for (String letter : scoreObject.mLetter) {
          if (letter.equals(wordLetter)) {
            score += scoreObject.mPointValue;
          }
        }
      }
    }

  return score;
  }
    class Scores {
    public String[] mLetter;
    public int mPointValue;

    public Scores(String[] letters, int pointValue) {
      mLetter = letters;
      mPointValue = pointValue;
    }
  }
}
