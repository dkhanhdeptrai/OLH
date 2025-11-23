import java.math.BigDecimal;
import java.util.Scanner;

public class KtraTamGiac8{
  private static final BigDecimal ZERO = BigDecimal.ZERO;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if (!sc.hasNextInt()) return;
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      String aStr = sc.next();
      String bStr = sc.next();
      String cStr = sc.next();

      BigDecimal a = new BigDecimal(aStr);
      BigDecimal b = new BigDecimal(bStr);
      BigDecimal c = new BigDecimal(cStr);
      checkTriangle(a, b, c);
    }
    sc.close();
  }

  private static void checkTriangle(BigDecimal a, BigDecimal b, BigDecimal c) {
    boolean cond1 = a.add(b).compareTo(c) > 0;
    boolean cond2 = a.add(c).compareTo(b) > 0;
    boolean cond3 = b.add(c).compareTo(a) > 0;
    boolean isPositive = a.compareTo(ZERO) > 0 &&
        b.compareTo(ZERO) > 0 &&
        c.compareTo(ZERO) > 0;
    if (cond1 && cond2 && cond3 && isPositive) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}