//4. Nhập vào tháng và năm. Cho biết tháng đó có bao nhiêu ngày.
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int thang,nam;
        System.out.println("Nhap thang,nam : ");
        thang = scanner.nextInt();
        nam = scanner.nextInt();

        System.out.print(thang+ "/" + nam + " co " );
        if(thang == 2)
        {
            if( KiemTraNamNhuan(nam))
            {
                System.out.print(29+" ngay");
            }
            else
            {
                System.out.print(28+" ngay");
            }
            
        }
        else if ( thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12 )
        {
            System.out.print(31+" ngay");
        }
        else
        {
            System.out.print(30+" ngay");
        }
    }
    
    public static boolean KiemTraNamNhuan(int nam)
    {
        if(nam % 400 == 0)
            return true;
        if (nam % 4 == 0 && nam % 100 != 0) 
            return true;
        return false;
    }

    
}
