  import java.util.Scanner;

  public class CayThongGiangSinh {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n<1 || n> 20) return;
      for(int i=1;i<=n;i++){
        for(int space = 1 ; space <= n-i; space++){
          System.out.print(" ");
        }
        for(int sao = 1; sao <= 2*i-1; sao++){
          System.out.print("*");
        }
        System.out.println();
      }

    }

  }
