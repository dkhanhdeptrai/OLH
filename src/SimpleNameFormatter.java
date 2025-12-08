import java.util.Scanner;

public class SimpleNameFormatter {

  public static String HoTen(String word) {
    if (word == null || word.isEmpty()) {
      return "";
    }
    String chuThuong = word.toLowerCase();
    return chuThuong.substring(0, 1).toUpperCase() + chuThuong.substring(1);
  }

  public static String formatNameSimple(String fullName) {
    String[] parts = fullName.trim().toLowerCase().split("\\s+");

    if (parts.length < 2) {
      return fullName.trim();
    }

    String lastName = parts[0].toUpperCase();

    StringBuilder middleAndFirstNameBuilder = new StringBuilder();

    for (int i = 1; i < parts.length; i++) {
      String word = parts[i];

      String capitalizedWord = HoTen(word);

      middleAndFirstNameBuilder.append(capitalizedWord);

      if (i < parts.length - 1) {
        middleAndFirstNameBuilder.append(" ");
      }
    }

    String middleAndFirstName = middleAndFirstNameBuilder.toString();

    return middleAndFirstName + ", " + lastName;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      int N = Integer.parseInt(scanner.nextLine());

      for (int i = 0; i < N; i++) {
        String inputName = scanner.nextLine();
        String standardizedName = formatNameSimple(inputName);
        System.out.println(standardizedName);
      }
    } catch (Exception e) {

    } finally {
      scanner.close();
    }
  }
}