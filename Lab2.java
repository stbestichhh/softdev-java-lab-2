public class Lab2 {

  public static void main(String[] args) {
    try {
      if (args.length < 2) {
        throw new IllegalArgumentException("Required arguments are missing.\nUsage: java Lab2 'text to sort' 'target letter' ");

        String text = args[0];
        char targetLetter = args[1].charAt(0);

        String sortedText = "";
      }
    } catch (Exception e) {
      System.error.println(e.getMessage());
    }
  }

  public int countLetter(String word, char targetLetter) {
    int count = 0;
    for (char letter : word.toCharArray()) {
      if (letter == targetLetter) {
        count++;
      }
    }

    return count;
  }
}
