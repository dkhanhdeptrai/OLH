import java.util.Scanner;

public class FindHello {

  public static String checkHello(String input) {
    String target = "hello";

    int targetIndex = 0;

    if (input == null || input.length() < target.length()) {
      return "NO";
    }

    for (int inputIndex = 0; inputIndex < input.length(); inputIndex++) {
      if (targetIndex == target.length()) {
        break;
      }

      char currentChar = input.charAt(inputIndex);
      char targetChar = target.charAt(targetIndex);

      if (currentChar == targetChar) {
        targetIndex++;
      }
    }

    if (targetIndex == target.length()) {
      return "YES";
    } else {
      return "NO";
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    System.out.println(checkHello(input));

    scanner.close();
  }
}