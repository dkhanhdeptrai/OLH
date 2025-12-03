import java.util.Scanner;

public class BoiChungNhoNhat {

  public static int UocChungLonNhat(int soThuNhat, int soThuHai) {
    while (soThuHai != 0) {
      int soTam = soThuHai;
      soThuHai = soThuNhat % soThuHai;
      soThuNhat = soTam;
    }
    return soThuNhat;
  }

  public static int BoiChungNhoNhat(int soThuNhat, int soThuHai) {
    return (soThuNhat * soThuHai) / UocChungLonNhat(soThuNhat, soThuHai);
  }

  public static void main(String[] args) {
    Scanner boDocDuLieu = new Scanner(System.in);
    int giaTriA = boDocDuLieu.nextInt();
    int giaTriB = boDocDuLieu.nextInt();

    if (giaTriA <= 1 || giaTriB >= 100) return;
    else{
      int ketQuaBCNN = BoiChungNhoNhat(giaTriA, giaTriB);
      System.out.println(ketQuaBCNN);
    }
  }
}