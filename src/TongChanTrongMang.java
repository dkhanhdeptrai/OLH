import java.util.Scanner;

public class TongChanTrongMang {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    if (!scanner.hasNextInt()) {
      return;
    }
    int n = scanner.nextInt();

    long tongSoChan = 0;

    for (int i = 0; i < n; i++) {
      if (scanner.hasNextInt()) {
        int a = scanner.nextInt();

        if (a % 2 == 0) {
          tongSoChan += a;
        }
      } else {
        break;
      }
    }

    System.out.println(tongSoChan);

    scanner.close();
  }
}