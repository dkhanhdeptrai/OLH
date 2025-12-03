import java.util.Scanner;

public class TongCacSoLe {

  public static void main(String[] args) {
    Scanner boDocDuLieu = new Scanner(System.in);
    int gioiHanTren = boDocDuLieu.nextInt();
    int tongCacSoLe = 0;

    for (int soHienTai = 1; soHienTai <= gioiHanTren; soHienTai++) {
      if (soHienTai % 2 != 0) {
        tongCacSoLe += soHienTai;
      }
    }
    System.out.println(tongCacSoLe);
  }
}