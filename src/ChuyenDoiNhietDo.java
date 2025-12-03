import java.util.Scanner;

interface ChucNangChuyenDoi {
  void ChuyenCSangF(double doC);
  void ChuyenFSangC(double doF);
}

class GiaTriNhietDo implements ChucNangChuyenDoi {

  private double giaTriC;
  private double giaTriF;

  public GiaTriNhietDo() {
  }

  public GiaTriNhietDo(double giaTriC, double giaTriF) {
    this.giaTriC = giaTriC;
    this.giaTriF = giaTriF;
  }

  public double layGiaTriC() {
    return giaTriC;
  }

  public void datGiaTriC(double giaTriC) {
    this.giaTriC = giaTriC;
  }

  public double layGiaTriF() {
    return giaTriF;
  }

  public void datGiaTriF(double giaTriF) {
    this.giaTriF = giaTriF;
  }

  @Override
  public void ChuyenCSangF(double doC) {
    giaTriF = doC * 9 / 5 + 32;
    System.out.println(doC + " C = " + giaTriF + " F");
  }

  @Override
  public void ChuyenFSangC(double doF) {
    giaTriC = (doF - 32) * 5 / 9;
    System.out.println(doF + " F = " + giaTriC + " C");
  }
}

class GiaoDienMenu {
  public void HienThiTuyChon() {
    System.out.println("=== CHUYEN DOI NHIET DO ===");
    System.out.println("1. C sang F");
    System.out.println("2. F sang C");
    System.out.println("3. Thoat");
  }

  public int ChonTuyChon(Scanner boDocDuLieu) {
    System.out.print("Chon (1-3): ");
    return boDocDuLieu.nextInt();
  }
}

public class ChuyenDoiNhietDo {
  public static void main(String[] args) {
    Scanner boDocDuLieu = new Scanner(System.in);
    GiaoDienMenu menu = new GiaoDienMenu();
    GiaTriNhietDo nhietDo = new GiaTriNhietDo();
    int luaChon;

    do {
      menu.HienThiTuyChon();
      luaChon = menu.ChonTuyChon(boDocDuLieu);

      switch (luaChon) {
        case 1:
          System.out.print("Nhap do C: ");
          double doC = boDocDuLieu.nextDouble();
          nhietDo.ChuyenCSangF(doC);
          break;
        case 2:
          System.out.print("Nhap do F: ");
          double doF = boDocDuLieu.nextDouble();
          nhietDo.ChuyenFSangC(doF);
          break;
        case 3:
          System.out.println("Tam biet!");
          break;
        default:
          System.out.println("Lua chon khong hop le. Chon lai!");
      }
      System.out.println();
    } while (luaChon != 3);

    boDocDuLieu.close();
  }
}