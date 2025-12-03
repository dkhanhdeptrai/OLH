import java.util.Scanner;
import java.util.Arrays;

public class QuickSort {

  private static void HoanDoi(int[] mangSoNguyen, int chiSoA, int chiSoB) {
    int giaTriTam = mangSoNguyen[chiSoA];
    mangSoNguyen[chiSoA] = mangSoNguyen[chiSoB];
    mangSoNguyen[chiSoB] = giaTriTam;
  }

  private static int PhanHoach(int[] mangSoNguyen, int chiSoDau, int chiSoCuoi) {
    int giaTriChot = mangSoNguyen[chiSoCuoi];
    int chiSoGiaTriNhoHon = (chiSoDau - 1);

    for (int chiSoDuyet = chiSoDau; chiSoDuyet < chiSoCuoi; chiSoDuyet++) {
      if (mangSoNguyen[chiSoDuyet] < giaTriChot) {
        chiSoGiaTriNhoHon++;
        HoanDoi(mangSoNguyen, chiSoGiaTriNhoHon, chiSoDuyet);
      }
    }

    HoanDoi(mangSoNguyen, chiSoGiaTriNhoHon + 1, chiSoCuoi);
    return chiSoGiaTriNhoHon + 1;
  }

  public static void SapXepNhanh(int[] mangSoNguyen, int chiSoDau, int chiSoCuoi) {
    if (chiSoDau < chiSoCuoi) {
      int chiSoChot = PhanHoach(mangSoNguyen, chiSoDau, chiSoCuoi);
      SapXepNhanh(mangSoNguyen, chiSoDau, chiSoChot - 1);
      SapXepNhanh(mangSoNguyen, chiSoChot + 1, chiSoCuoi);
    }
  }

  public static void main(String[] args) {
    Scanner boDocDuLieu = new Scanner(System.in);
    int kichThuocMang = boDocDuLieu.nextInt();
    int[] mangSoNguyen = new int[kichThuocMang];

    for(int chiSoNhap = 0; chiSoNhap < kichThuocMang; chiSoNhap++){
      mangSoNguyen[chiSoNhap] = boDocDuLieu.nextInt();
    }

    SapXepNhanh(mangSoNguyen, 0, kichThuocMang - 1);
    System.out.println(Arrays.toString(mangSoNguyen));

    boDocDuLieu.close();
  }
}