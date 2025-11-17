import java.util.Scanner;

public class Mang2Chieu {
  public static int[][] nhapMang(int dong, int cot) {
    Scanner sc = new Scanner(System.in);
    int[][] a = new int[dong][cot];
    for (int i = 0; i < dong; i++) {
      for (int j = 0; j < cot; j++) {
        System.out.print("a[" + i + "][" + j + "] = ");
        a[i][j] = sc.nextInt();
      }
    }
    return a;
  }
  public static void xuatMang(int[][] a) {
    for(int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + "\t");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dong, cot;
    System.out.println("nhap hang ");
    dong = sc.nextInt();
    System.out.print("nhap cot ");
    cot = sc.nextInt();
    int[][] arr = nhapMang(dong, cot);
    xuatMang(arr);
  }
}
