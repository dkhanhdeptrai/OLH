import java.util.Scanner;

public class TamGiacSo {

  public static void main(String[] args) {

    Scanner boDocDuLieu = new Scanner(System.in);
    int soDongCanIn = boDocDuLieu.nextInt();

    for(int chiSoDong = 1; chiSoDong <= soDongCanIn; chiSoDong++){
      for(int chiSoCot = 1; chiSoCot <= chiSoDong; chiSoCot++){
        System.out.print(chiSoDong);
      }
      System.out.println();
    }
  }
}