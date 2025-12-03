import java.util.Scanner;

public class DemSoNgayTrongThang {

  public static void main(String[] args) {
    Scanner boDocDuLieu = new Scanner(System.in);
    int thang = boDocDuLieu.nextInt();
    int nam = boDocDuLieu.nextInt();
    int soNgay;

    if(thang < 1 || thang > 12) {
      System.out.println("thang khong hop le");
      return;
    }

    if(thang == 1 || thang == 3|| thang == 5|| thang == 7|| thang == 8|| thang == 10|| thang == 12){
      soNgay = 31;
    }
    else if(thang == 2) {
      if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0))
        soNgay = 29;
      else {
        soNgay = 28;
      }
    } else {
      soNgay = 30;
    }

    System.out.println("Thang "+ thang +" nam " + nam + " co "+ soNgay + " ngay");
  }
}