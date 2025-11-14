import java.util.Scanner;

public class DemSoVaChu {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String xau = sc.nextLine();
    int count = 0;
    int sum = 0;
    for(int i = 0; i < xau.length(); i++) {
      char c = xau.charAt(i);
      if(Character.isDigit(c)) {
        count++;
        sum += c - '0';

      }
    }
    System.out.println(count);
    System.out.println(sum);
  }
}
