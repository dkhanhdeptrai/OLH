import java.util.Scanner;

public class SoHoanHao {
  public static boolean KiemTraSoHoanHao(int soCanKiemTra){
    int tongUocSo = 0;
    for(int uocSo = 1; uocSo <= soCanKiemTra/2; uocSo++){
      if(soCanKiemTra % uocSo == 0) tongUocSo += uocSo;
    }
    if(tongUocSo == soCanKiemTra) return true;
    return false;
  }

  public static void main(String[] args) {
    Scanner boDocDuLieu = new Scanner(System.in);
    int soDaNhap = boDocDuLieu.nextInt();
    System.out.println(KiemTraSoHoanHao(soDaNhap) ? "yes" : "no");
  }
}