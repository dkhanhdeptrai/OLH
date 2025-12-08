import java.util.Scanner;

public class BinarySum {

  public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);

    String binaryStringA = inputReader.nextLine().trim();
    String binaryStringB = inputReader.nextLine().trim();

    int indexA = binaryStringA.length() - 1;
    int indexB = binaryStringB.length() - 1;
    int carry = 0;

    StringBuilder result = new StringBuilder();

    while (indexA >= 0 || indexB >= 0 || carry != 0) {
      int bitSum = carry;

      if (indexA >= 0) {
        bitSum += binaryStringA.charAt(indexA) - '0';
        indexA--;
      }

      if (indexB >= 0) {
        bitSum += binaryStringB.charAt(indexB) - '0';
        indexB--;
      }

      result.append(bitSum % 2);
      carry = bitSum / 2;
    }

    System.out.println(result.reverse().toString());

    inputReader.close();
  }
}