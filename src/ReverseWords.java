import java.util.Scanner;

public class ReverseWords {

  public static String daoTuTrongCau(String inputString) {
    String[] words = inputString.split(" ");
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      String reverseWord = new StringBuilder(word).reverse().toString();
      result.append(reverseWord);
      if (i < words.length - 1) {
        result.append(" ");
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
    Scanner docDuLieu = new Scanner(System.in);
    String word = docDuLieu.nextLine();
    System.out.println(daoTuTrongCau(word));
  }

}
