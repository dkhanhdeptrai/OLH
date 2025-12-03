import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

  public static void main(String[] args) {
    Scanner boDocDuLieu = new Scanner(System.in);
    int kichThuocMang = boDocDuLieu.nextInt();
    int[] mangSoNguyen = new int[kichThuocMang];

    for (int chiSoNhap = 0; chiSoNhap < kichThuocMang; chiSoNhap++) {
      mangSoNguyen[chiSoNhap] = boDocDuLieu.nextInt();
    }

    for (int chiSoCanChen = 1; chiSoCanChen < kichThuocMang; chiSoCanChen++) {
      int giaTriCanChen = mangSoNguyen[chiSoCanChen];
      int chiSoDuyet = chiSoCanChen - 1;

      while (chiSoDuyet >= 0 && mangSoNguyen[chiSoDuyet] > giaTriCanChen) {
        mangSoNguyen[chiSoDuyet + 1] = mangSoNguyen[chiSoDuyet];
        chiSoDuyet = chiSoDuyet - 1;
      }
      mangSoNguyen[chiSoDuyet + 1] = giaTriCanChen;
    }
    System.out.println(Arrays.toString(mangSoNguyen));
  }
}