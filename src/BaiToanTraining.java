import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BaiToanTraining {

  static class BaiTap implements Comparable<BaiTap> {
    int tenBai;
    int doKho;

    public BaiTap(int tenBai, int doKho) {
      this.tenBai = tenBai;
      this.doKho = doKho;
    }

    @Override
    public int compareTo(BaiTap other) {
      return Integer.compare(this.doKho, other.doKho);
    }

    @Override
    public String toString() {
      return String.valueOf(this.tenBai);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n;
    try {
      n = scanner.nextInt();
    } catch (java.util.InputMismatchException e) {
      System.err.println("error");
      return;
    }

    int[] tenBaiTap = new int[n];
    for (int i = 0; i < n; i++) {
      tenBaiTap[i] = scanner.nextInt();
    }

    int[] doKho = new int[n];
    for (int i = 0; i < n; i++) {
      doKho[i] = scanner.nextInt();
    }

    List<BaiTap> danhSachBaiTap = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      danhSachBaiTap.add(new BaiTap(tenBaiTap[i], doKho[i]));
    }

    Collections.sort(danhSachBaiTap);

    for (int i = 0; i < danhSachBaiTap.size(); i++) {
      System.out.print(danhSachBaiTap.get(i).tenBai);
      if (i < danhSachBaiTap.size() - 1) {
        System.out.print(" ");
      }
    }
    System.out.println();

    scanner.close();
  }
}