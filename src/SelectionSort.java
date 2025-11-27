import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int k = 0;k<n;k++){
      arr[k] = sc.nextInt();
    }
    for(int i = 0; i < arr.length- 1; i++){
      int min_idx = i;
      for(int j = i+1; j<arr.length;j++){
        if(arr[j]< arr[min_idx]){
          min_idx = j;
        }
      }
      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
    }
    System.out.println(Arrays.toString(arr));

  }
}
