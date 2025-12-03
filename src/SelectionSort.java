import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

  public static void main(String[] args) {
    Scanner boDocDuLieu = new Scanner(System.in);
    int kichThuocMang = boDocDuLieu.nextInt();
    int[] mangSoNguyen = new int[kichThuocMang];

    for(int chiSoNhap = 0; chiSoNhap < kichThuocMang; chiSoNhap++){
      mangSoNguyen[chiSoNhap] = boDocDuLieu.nextInt();
    }

    for(int chiSoDatViTri = 0; chiSoDatViTri < mangSoNguyen.length - 1; chiSoDatViTri++){
      int chiSoNhoNhat = chiSoDatViTri;
      for(int chiSoDuyet = chiSoDatViTri + 1; chiSoDuyet < mangSoNguyen.length; chiSoDuyet++){
        if(mangSoNguyen[chiSoDuyet] < mangSoNguyen[chiSoNhoNhat]){
          chiSoNhoNhat = chiSoDuyet;
        }
      }
      int giaTriTam = mangSoNguyen[chiSoNhoNhat];
      mangSoNguyen[chiSoNhoNhat] = mangSoNguyen[chiSoDatViTri];
      mangSoNguyen[chiSoDatViTri] = giaTriTam;
    }

    System.out.println(Arrays.toString(mangSoNguyen));
  }
}