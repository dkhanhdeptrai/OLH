import java.util.Scanner;

interface IChucNang {
  void CSangF(double c);
  void FSangC(double f);
}

class NhietDo implements IChucNang {

  private double c;
  private double f;

  public NhietDo() {
  }

  public NhietDo(double c, double f) {
    this.c = c;
    this.f = f;
  }

  public double getC() {
    return c;
  }

  public void setC(double c) {
    this.c = c;
  }

  public double getF() {
    return f;
  }

  public void setF(double f) {
    this.f = f;
  }

  @Override
  public void CSangF(double c) {
    f = c * 9 / 5 + 32;
    System.out.println(c + " C = " + f + " F");
  }

  @Override
  public void FSangC(double f) {
    c = (f - 32) * 5 / 9;
    System.out.println(f + " F = " + c + " C");
  }
}

class Menu {
  public void hienThi() {
    System.out.println("=== CHUYEN DOI NHIET DO ===");
    System.out.println("1. C sang F");
    System.out.println("2. F sang C");
    System.out.println("3. Thoat");
  }

  public int chon(Scanner sc) {
    System.out.print("Chon (1-3): ");
    return sc.nextInt();
  }
}

public class ChuyenDoiNhietDo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu();
    NhietDo nhietDo = new NhietDo();
    int choice;

    do {
      menu.hienThi();
      choice = menu.chon(sc);

      switch (choice) {
        case 1:
          System.out.print("Nhap do C: ");
          double c = sc.nextDouble();
          nhietDo.CSangF(c);
          break;
        case 2:
          System.out.print("Nhap do F: ");
          double f = sc.nextDouble();
          nhietDo.FSangC(f);
          break;
        case 3:
          System.out.println("Tam biet!");
          break;
        default:
          System.out.println("Lua chon khong hop le. Chon lai!");
      }
      System.out.println();
    } while (choice != 3);

    sc.close();
  }
}
