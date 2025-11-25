import java.util.Scanner;

public class Palindrome {
  public static boolean isPalind(String str){
    String xau = str.toLowerCase();
    int left = 0;
    int right = xau.length()-1;
    while(left<right){
      if(xau.charAt(left) != xau.charAt(right)){
        return false;
      }
      left++;
      right--;
    }
    return true;

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str = sc.nextLine();
    if(isPalind(str)){
      System.out.println("La chuoi Palindrome");
    }else{
      System.out.println("Khong phai chuoi Palindrome");
    }

  }

}
