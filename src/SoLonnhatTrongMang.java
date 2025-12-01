import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SoLonnhatTrongMang {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int k = scanner.nextInt();

    List<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < k; i++) {
      numbers.add(scanner.nextInt());
    }

    int maxNumber = Collections.max(numbers);

    System.out.println(maxNumber);

    scanner.close();
  }
}