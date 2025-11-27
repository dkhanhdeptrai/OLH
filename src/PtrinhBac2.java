import java.util.Scanner;

public class PtrinhBac2 {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int f = sc.nextInt();
    giaiPT(a, b, c);
    giaiPT(d, e, f);
    giaiPT(a+d, b+e, c+f);
    giaiPT(a-d, b-e, c-f);
  }
  static void giaiPT(double a, double b, double c) {
    double delta = b * b - 4 * a * c;

    if (delta < -1e-9) {
      System.out.println("Phuong trinh vo nghiem");
    } else if (Math.abs(delta) < 1e-9) {
      double x = -b / (2 * a);
      System.out.printf("%.2f\n", x);
    } else {
      double sqrtD = Math.sqrt(delta);
      double x1 = (-b - sqrtD) / (2 * a);
      double x2 = (-b + sqrtD) / (2 * a);

      if (x1 > x2) {
        double t = x1; x1 = x2; x2 = t;
      }

      System.out.printf("%.2f %.2f\n", x1, x2);
    }
  }
}