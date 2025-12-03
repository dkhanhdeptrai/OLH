import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

  public static void main(String[] args) {
    Scanner boDocDuLieu = new Scanner(System.in);
    int kichThuocMang = boDocDuLieu.nextInt();
    int[] mangSoNguyen = new int[kichThuocMang];

    for(int chiSoNhap = 0; chiSoNhap < kichThuocMang; chiSoNhap++){
      mangSoNguyen[chiSoNhap] = boDocDuLieu.nextInt();
    }

    for( int chiSoLuot = 0; chiSoLuot < kichThuocMang - 1; chiSoLuot++){
      for(int chiSoSoSanh = 0; chiSoSoSanh < kichThuocMang - chiSoLuot - 1; chiSoSoSanh++){
        if(mangSoNguyen[chiSoSoSanh] > mangSoNguyen[chiSoSoSanh + 1]){
          int giaTriTam = mangSoNguyen[chiSoSoSanh];
          mangSoNguyen[chiSoSoSanh] = mangSoNguyen[chiSoSoSanh + 1];
          mangSoNguyen[chiSoSoSanh + 1] = giaTriTam;

          System.out.println(Arrays.toString(mangSoNguyen));
        }
      }

    }
    System.out.println(Arrays.toString(mangSoNguyen));
  }
}