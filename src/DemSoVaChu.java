import java.util.Scanner;


public class DemSoVaChu {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String xau = sc.nextLine();
    String digits = xau.replaceAll("\\D", "");
    int count = digits.length();
    int sum = 0;
    for (char c : digits.toCharArray()) {
      sum += c - '0';
    }
    System.out.println(count);
    System.out.println(sum);
  }
}