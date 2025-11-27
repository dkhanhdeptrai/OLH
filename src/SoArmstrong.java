import java.util.Scanner;

public class SoArmstrong {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
  int n = sc.nextInt();
  if(n <= 100 || n >= 999) {
    System.out.println("No");
  }
  else{
    int tram = n / 100;
    int chuc = (n / 10) % 10;
    int don = n % 10;

    int sumcube = (int)(Math.pow(tram, 3)
        + Math.pow(chuc, 3)
        + Math.pow(don, 3));

    if (sumcube == n) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

    sc.close();
  }
}


