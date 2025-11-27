import java.util.Scanner;

public class SoChiaHet3Va5 {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int sum = 0;
    int n =sc.nextInt();
      for (int i = 1; i <= n; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
          sum += i;
        }
      }
      System.out.println(sum);

  }
}
