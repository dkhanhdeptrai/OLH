import java.util.Scanner;

public class LetterCounter {

  public static int countTotalLetters(String text) {
    int count = 0;
    for (char ch : text.toCharArray()) {
      if (Character.isLetter(ch)) {
        count++;
      }
    }
    return count;
  }

  public static int countCharacterFrequency(String text, char targetChar) {
    String lowerText = text.toLowerCase();
    char lowerTarget = Character.toLowerCase(targetChar);

    int count = 0;
    for (char ch : lowerText.toCharArray()) {
      if (ch == lowerTarget) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String text = scanner.nextLine();

    String charInput = scanner.nextLine();
    char targetChar = charInput.charAt(0);

    int totalLetters = countTotalLetters(text);
    System.out.println(totalLetters);

    int frequency = countCharacterFrequency(text, targetChar);
    System.out.println(targetChar + " " + frequency);

    scanner.close();
  }
}