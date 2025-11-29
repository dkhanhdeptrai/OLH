import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Tang1DonVi {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextInt()) {
      int n = scanner.nextInt();
    }
    ArrayList<Integer> digits = new ArrayList<>();
    while (scanner.hasNextInt()) {
      digits.add(scanner.nextInt());
    }
    scanner.close();
    int carry = 1;
    for (int i = digits.size() - 1; i >= 0; i--) {
      if (carry == 0) {
        break;
      }

      int sum = digits.get(i) + carry;
      digits.set(i, sum % 10);
      carry = sum / 10;
    }
    if (carry > 0) {
      digits.add(0, carry);
    }
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < digits.size(); i++) {
      result.append(digits.get(i));
      if (i < digits.size() - 1) {
        result.append(",");
      }
    }
    System.out.println(result.toString());
  }
}