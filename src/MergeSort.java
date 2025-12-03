import java.util.Arrays;
import java.util.Scanner;

class SapXepTron {
  static void Tron(int mangChinh[], int trai, int giua, int phai) {
    int kichThuocMangCon1 = giua - trai + 1;
    int kichThuocMangCon2 = phai - giua;

    int MangConTrai[] = new int[kichThuocMangCon1];
    int MangConPhai[] = new int[kichThuocMangCon2];

    for (int chiSo = 0; chiSo < kichThuocMangCon1; ++chiSo)
      MangConTrai[chiSo] = mangChinh[trai + chiSo];

    for (int chiSo = 0; chiSo < kichThuocMangCon2; ++chiSo)
      MangConPhai[chiSo] = mangChinh[giua + 1 + chiSo];

    int chiSoTrai = 0, chiSoPhai = 0;
    int chiSoMangChinh = trai;

    while (chiSoTrai < kichThuocMangCon1 && chiSoPhai < kichThuocMangCon2) {
      if (MangConTrai[chiSoTrai] <= MangConPhai[chiSoPhai]) {
        mangChinh[chiSoMangChinh++] = MangConTrai[chiSoTrai++];
      } else {
        mangChinh[chiSoMangChinh++] = MangConPhai[chiSoPhai++];
      }
    }

    while (chiSoTrai < kichThuocMangCon1) mangChinh[chiSoMangChinh++] = MangConTrai[chiSoTrai++];
    while (chiSoPhai < kichThuocMangCon2) mangChinh[chiSoMangChinh++] = MangConPhai[chiSoPhai++];
  }

  static void SapXep(int mangChinh[], int trai, int phai) {
    if (trai < phai) {
      int giua = trai + (phai - trai) / 2;
      SapXep(mangChinh, trai, giua);
      SapXep(mangChinh, giua + 1, phai);
      Tron(mangChinh, trai, giua, phai);
    }
  }

  public static void main(String args[]) {
    Scanner boDocDuLieu = new Scanner(System.in);
    int kichThuocMang = boDocDuLieu.nextInt();
    int[] mangSoNguyen = new int[kichThuocMang];

    for(int chiSoNhap = 0; chiSoNhap < kichThuocMang; chiSoNhap++){
      mangSoNguyen[chiSoNhap] = boDocDuLieu.nextInt();
    }

    SapXep(mangSoNguyen, 0, mangSoNguyen.length - 1);
    System.out.println(Arrays.toString(mangSoNguyen));

    boDocDuLieu.close();
  }
}