import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemSo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int t = 1; t <= T; t++) {
      int n = sc.nextInt();
      int[] dem = new int[100001];
      boolean[] xuathien = new boolean[100001];
      List<Integer> order = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        int x = sc.nextInt();
        dem[x]++;
        if (!xuathien[x]) {
          xuathien[x] = true;
          order.add(x);
        }
      }

      System.out.println("Test " + t + ":");
      for (int x : order) {
        System.out.println(x + " " + dem[x]);
      }
    }
  }
}
