import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
  public static int TimKiemNhiPhan(int[] mangCanTim, int giaTriCanTim) {
    int chiSoDau = 0;
    int chiSoCuoi = mangCanTim.length - 1;

    while (chiSoDau <= chiSoCuoi) {
      int chiSoGiua = chiSoDau + (chiSoCuoi - chiSoDau) / 2;

      if (mangCanTim[chiSoGiua] == giaTriCanTim) {
        return chiSoGiua;
      } else if (mangCanTim[chiSoGiua] < giaTriCanTim) {
        chiSoDau = chiSoGiua + 1;
      } else {
        chiSoCuoi = chiSoGiua - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner boDocDuLieu = new Scanner(System.in);
    int kichThuocMang = boDocDuLieu.nextInt();
    int[] mangSoNguyen = new int[kichThuocMang];

    for (int chiSoNhap = 0; chiSoNhap < kichThuocMang; chiSoNhap++) {
      mangSoNguyen[chiSoNhap] = boDocDuLieu.nextInt();
    }

    int giaTriMucTieu = boDocDuLieu.nextInt();

    Arrays.sort(mangSoNguyen);
    System.out.println(Arrays.toString(mangSoNguyen));

    int chiSoKetQua = TimKiemNhiPhan(mangSoNguyen, giaTriMucTieu);

    if (chiSoKetQua != -1) {
      System.out.println(chiSoKetQua);
    } else {
      System.out.println(giaTriMucTieu);
    }

    boDocDuLieu.close();
  }
}