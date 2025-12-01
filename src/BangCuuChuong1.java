import java.util.Scanner;

public class BangCuuChuong1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    if (!scanner.hasNextInt()) {
      return;
    }
    int n = scanner.nextInt();

    if (n < 1 || n > 9) {
      System.out.println("nhap sai");
      return;
    }

    for (int i = 1; i <= 10; i++) {
      int ketqua = n * i;
      System.out.println(n + " x " + i + " = " + ketqua);
    }

    scanner.close();
  }
}