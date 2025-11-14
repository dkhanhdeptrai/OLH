import java.util.Scanner;

public class DemSoNgayTrongThang {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int m = sc.nextInt();
    int y = sc.nextInt();
    int d;
    if(m< 1 || m > 12) {
      System.out.println("thang khong hop le");
      return;
    }
    if(m == 1 || m == 3|| m ==5||m==7||m==8||m==10||m==12){
      d = 31;
    }
    else if(m == 2) {
      if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
        d = 29;
      else {
        d = 28;
      }
    }else{
     d = 30;
    }
    System.out.println("Thang "+ m +" nam " + y + " co "+ d+ " ngay");
  }


}
