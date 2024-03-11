//6. Viết chương trình xuất ra lịch của một năm (do người dùng nhập vào)
import java.util.Scanner;
public class Bai6 {
    static int nam;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam: ");
        
        nam = scanner.nextInt();
        System.out.println("Lich nam " + nam);
        XuatLich(nam);
        
    }

    private static void XuatLich(int nam) {
       
       for(int i = 0 ; i<=12 ; i++)
       {
          int soNgay = SoNgayTrongThang(i);
          System.out.println("Thang "+ i);
          System.out.println("T2 T3 T4 T5 T6 T7 CN");
          int thuDauTrongThang = ThuDauTienTrongThang(nam,i);
          for(int j = 0 ; j < thuDauTrongThang; j++)
          {
            System.out.print("   ");
          }

          for ( int ngay = 1 ; ngay <= soNgay ; ngay++)
          {
            System.out.printf("%2d ", ngay);
            if( (ngay+thuDauTrongThang)%7==0 || ngay == soNgay)
             System.out.println();
                
          }
          System.out.println();

       }
    }

    private static int ThuDauTienTrongThang(int nam, int thang) {
        if (thang < 3) {
            thang += 12;
            nam--;
        }
        int thu = (1 + (26 * (thang + 1)) / 10 + nam + nam / 4 + 6 * (nam / 100) + nam / 400) % 7;
        return (thu + 5) % 7;
    }

    private static int SoNgayTrongThang(int thang) {
        if(thang == 2)
        {
            if( KiemTraNamNhuan(nam))
            {
                return 29;
            }
            else
            {
                return 28;
            }
            
        }
        else if ( thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12 )
        {
            return 31;
        }
        else
        {
            return 30;
        }
    }

    private static boolean KiemTraNamNhuan(int nam)
    {
        if(nam % 400 == 0)
            return true;
        if (nam % 4 == 0 && nam % 100 != 0) 
            return true;
        return false;
    }
    
}
