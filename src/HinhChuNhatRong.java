import java.util.Scanner;

public class HinhChuNhatRong {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    if(h < 3 || w < 3 || h >20 || w >20) return;
    for (int i = 1; i <= h; i++) {
      for (int j = 1; j <= w; j++) {
        if (i == 1 || i == h || j == 1 || j == w)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
      }
    }

  }

