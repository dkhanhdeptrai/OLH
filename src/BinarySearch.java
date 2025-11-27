import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
  public static int binarySearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int k = 0; k < n; k++) {
      arr[k] = sc.nextInt();
    }
    int target = sc.nextInt();
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int resultIndex = binarySearch(arr, target);
    if (resultIndex != -1) {
      System.out.println(resultIndex);
    } else {
      System.out.println(target);
    }

    sc.close();
  }
}