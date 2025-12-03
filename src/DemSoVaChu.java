import java.util.Scanner;

public class DemSoVaChu {
  public static void main(String[] args) {
    Scanner boDocDuLieu = new Scanner(System.in);
    String chuoiNguoiDungNhap = boDocDuLieu.nextLine();
    String cacKyTuSo = chuoiNguoiDungNhap.replaceAll("\\D", "");
    int soLuongKyTuSo = cacKyTuSo.length();
    int tongGiaTriCacSo = 0;
    for (char kyTuSoHienTai : cacKyTuSo.toCharArray()) {
      tongGiaTriCacSo += kyTuSoHienTai - '0';
    }
    System.out.println(soLuongKyTuSo);
    System.out.println(tongGiaTriCacSo);
  }
}