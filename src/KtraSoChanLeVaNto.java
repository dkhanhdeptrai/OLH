import java.util.Scanner;

public class KtraSoChanLeVaNto {

  public static boolean KiemTraSoNguyenTo(int soCanKiemTra) {
    if (soCanKiemTra < 2) {
      return false;
    }
    for (int i = 2; i * i <= soCanKiemTra; i++) {
      if (soCanKiemTra % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);


    int soDaNhap = inputReader.nextInt();


    if (soDaNhap % 2 == 0) {
      System.out.println("So chan");
    } else {
      System.out.println("So le");
    }

    if (KiemTraSoNguyenTo(soDaNhap)) {
      System.out.println("So nguyen to");
    } else {
      System.out.println("Khong phai so nguyen to");
    }
  }
}