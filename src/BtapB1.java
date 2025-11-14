import java.util.Scanner;
public class BtapB1 {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a == 0){
      if(b == 0){
        if(c == 0){
          System.out.println("vsn");
        }
        else{
          System.out.println("vn");
        }
      }
      else{
        double x = -c/b;
        System.out.println(x);
      }
    }
    else{
      double delta = b*b -4*a*c;
      if(delta>0){
        double x1 = (-b+Math.sqrt(delta))/(2*a);
        double x2 = (-b-Math.sqrt(delta))/(2*a);
        System.out.println(x1);
        System.out.println(x2);
      }
      else if(delta == 0){
        double x = -b/ (2*a);
        System.out.println(x);

      }else{
        System.out.println("vn");
      }
    }
  }

}