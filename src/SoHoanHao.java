import java.util.Scanner;


public class SoHoanHao {
  public static boolean KtraSoHH(int n){
    int sum = 0;
    for(int i = 1; i <= n/2; i++){
      if(n%i==0) sum +=i;
    }
    if(sum == n) return true;
    return false;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(KtraSoHH(n) ? "yes" : "no");

  }
}
