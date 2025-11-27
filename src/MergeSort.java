import java.util.Scanner;
import java.util.Arrays;

class MergeSort {
  static void merge(int a[], int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;
    int L[] = new int[n1];
    int R[] = new int[n2];
    for (int i = 0; i < n1; ++i)
      L[i] = a[l + i];
    for (int j = 0; j < n2; ++j)
      R[j] = a[m + 1 + j];
    int i = 0, j = 0;
    int k = l;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        a[k++] = L[i++];
      } else {
        a[k++] = R[j++];
      }
    }
    while (i < n1) a[k++] = L[i++];
    while (j < n2) a[k++] = R[j++];
  }
  static void sort(int a[], int l, int r) {
    if (l < r) {
      int m = l + (r - l) / 2;
      sort(a, l, m);
      sort(a, m + 1, r);
      merge(a, l, m, r);
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int k = 0; k < n; k++){
      arr[k] = sc.nextInt();
    }
    sort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));

    sc.close();
  }
}