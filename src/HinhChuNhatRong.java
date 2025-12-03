import java.util.Scanner;

public class HinhChuNhatRong {

  public static void main(String[] args) {
    Scanner boDocDuLieu = new Scanner(System.in);
    int chieuCao = boDocDuLieu.nextInt();
    int chieuRong = boDocDuLieu.nextInt();

    if(chieuCao < 3 || chieuRong < 3 || chieuCao > 20 || chieuRong > 20) return;

    for (int chiSoDong = 1; chiSoDong <= chieuCao; chiSoDong++) {
      for (int chiSoCot = 1; chiSoCot <= chieuRong; chiSoCot++) {
        if (chiSoDong == 1 || chiSoDong == chieuCao || chiSoCot == 1 || chiSoCot == chieuRong)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}