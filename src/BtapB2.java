import java.util.Scanner;
public class BtapB2 {
  public static void inMaTran(int[][] matrix){

  for(int i = 0; i < matrix.length;i++){
    for (int j = 0; j < matrix[i].length; j++){
      System.out.printf("%4d", matrix[i][j]);
    }
    System.out.println();
  }
  }


  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int [][] A = new  int [3][3];
    for(int i =0; i < 3; i++ ){
      for(int j =0; j < 3; j++){
        System.out.printf("A[%d][%d] = ", i, j);
        A[i][j] = sc.nextInt();

    }
    }
    inMaTran(A);

  }

}
