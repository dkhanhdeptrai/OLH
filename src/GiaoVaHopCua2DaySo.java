
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GiaoVaHopCua2DaySo {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr1 = new int[n];
    for(int i = 0; i < n; i++){
      arr1[i] = sc.nextInt();

    }
    int m = sc.nextInt();
    int[] arr2 = new int[m];
    for(int i=0; i < m; i++){
      arr2[i] = sc.nextInt();
    }
    Set<Integer> hopSet = new TreeSet<>();
    for(int num : arr1){
      hopSet.add(num);
    }
    for(int num :arr2 ){
      hopSet.add(num);
    }
    for(int num : hopSet){
      System.out.print(num + " ");
    }
    System.out.println();

    Set<Integer> set1 = new HashSet<>();
    for (int num : arr1) {
      set1.add(num);
    }
    Set<Integer> intersectionSet = new TreeSet<>();
    for (int num : arr2) {
      if (set1.contains(num)) {
        intersectionSet.add(num);
      }
    }

    if (intersectionSet.isEmpty()) {
      System.out.println("NO");
    } else {
      for (int num : intersectionSet) {
        System.out.print(num + " ");
      }
    }

    sc.close();
  }
}

