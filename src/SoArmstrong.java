import java.util.Scanner;

public class SoArmstrong {

  public static void main(String[] args) {
    Scanner boDocDuLieu = new Scanner(System.in);
    int soDaNhap = boDocDuLieu.nextInt();

    if(soDaNhap <= 100 || soDaNhap >= 999) {
      System.out.println("No");
    }
    else{
      int chuSoTram = soDaNhap / 100;
      int chuSoChuc = (soDaNhap / 10) % 10;
      int chuSoDonVi = soDaNhap % 10;

      int tongLapPhuong = (int)(Math.pow(chuSoTram, 3)
          + Math.pow(chuSoChuc, 3)
          + Math.pow(chuSoDonVi, 3));

      if (tongLapPhuong == soDaNhap) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }

    boDocDuLieu.close();
  }
}