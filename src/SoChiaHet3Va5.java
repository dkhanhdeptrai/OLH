import java.util.Scanner;

public class SoChiaHet3Va5 {

  public static void main(String[] args) {
    Scanner docDuLieu = new Scanner(System.in);
    int tongCacSo = 0;
    int gioiHanN = docDuLieu.nextInt();
    for (int soHienTai = 1; soHienTai <= gioiHanN; soHienTai++) {
      if (soHienTai % 3 == 0 || soHienTai % 5 == 0) {
        tongCacSo += soHienTai;
      }
    }
    System.out.println(tongCacSo);
  }
}