import java.sql.SQLOutput;
import java.util.Scanner;

public class BCNN {

  public static int UCLN(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
  public static int BCNN(int a, int b) {
    return (a * b) / UCLN(a, b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a <= 1 || b >= 100) return;
    else{
      int bcnn = BCNN(a, b);
      System.out.println(bcnn);
    }
  }
}
