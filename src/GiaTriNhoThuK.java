import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GiaTriNhoThuK {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    if (!scanner.hasNextInt()) {
      return;
    }
    int n = scanner.nextInt();

    Set<Integer> uniqueElements = new LinkedHashSet<>();

    for (int i = 0; i < n; i++) {
      if (scanner.hasNextInt()) {
        uniqueElements.add(scanner.nextInt());
      }
    }

    if (!scanner.hasNextInt()) {
      return;
    }
    int k = scanner.nextInt();

    int countUnique = uniqueElements.size();

    if (k < 1 || k > countUnique) {
      System.out.println("invalid");
    } else {
      List<Integer> sortedUniqueList = new ArrayList<>(uniqueElements);
      Collections.sort(sortedUniqueList);
      int result = sortedUniqueList.get(k - 1);
      System.out.println(result);
    }

    scanner.close();
  }
}