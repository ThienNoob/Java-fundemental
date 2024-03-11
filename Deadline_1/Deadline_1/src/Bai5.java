/*5. Viết chương trình quản lý một dãy số nguyên gồm các tính năng: nhập, xuất dãy; cho
phép thêm, xóa, sửa các số trong dãy; sắp xếp dãy số tăng dần; tính giá trị trung bình
của dãy và cho biết phần tử nào gần với giá trị trung bình nhất. */
import java.util.Scanner;

public class Bai5 {
    public static int[] a = new int[100];
    public static int n;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (true) {
            System.out.println("\nChon chuc nang:");
            System.out.println("1. Nhap day so");
            System.out.println("2. Xuat day so");
            System.out.println("3. Them so");
            System.out.println("4. Xoa so khoi day");
            System.out.println("5. Sua so trong day");
            System.out.println("6. Sap xep day so tang dan");
            System.out.println("7. Tinh ra tri trung binh");
            System.out.println("Khac. Thoat");

            System.out.print("Chon: ");
            int chon = scanner.nextInt();
            scanner.nextLine();
            switch (chon) {
                case 1:
                    NhapDaySo();
                    break;
                case 2:
                    XuatDaySo();
                    scanner.nextLine();
                    break;
                case 3: 
                    ThemSo();
                    scanner.nextLine();
                    break;
                case 4:
                    XoaSoKhoiDay();
                    scanner.nextLine();
                    break;
                case 5:
                    SuaSoTrongDay();
                    scanner.nextLine();
                    break;
                case 6: 
                    SapXepDaySoTangDan();
                    scanner.nextLine();
                    break;
                case 7: 
                    TinhGiaTriTrungBinh();
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Ket thuc chuong trinh.");
                    return;
            }
        }
    }
    
    private static void TinhGiaTriTrungBinh() {
        float m = 0 ;
        for (int i = 0; i < n; i++) {
            m +=(float) a[i];
        }
        m /=n;
        System.out.println("Gia tri trung binh cua mang la: " + m);

        float min = Math.abs(m - a[0]);
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (Math.abs( m - a[i]) < min )
            {
                min = Math.abs( m - a[i]);
                minIndex = i;
            }
        }
        System.out.println("Gia tri gan voi trung binh nhat la: "+ a[minIndex]);
    }

    private static void SapXepDaySoTangDan() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Day so da duoc sap xep.");
    }

    private static void SuaSoTrongDay() {
        System.out.println("Nhap so muon sua: ");
        int m = scanner.nextInt();

        System.out.println("Nhap so moi: ");
        int k = scanner.nextInt();
        for ( int i = 0 ; i < n ; i++) {
            if(a[i] == m) {
                a[i] = k;
            }
        }
        System.out.println("Da sua. ");
    }

    private static void XoaSoKhoiDay() {
        System.out.println("Nhap so muon xoa: ");
        int m = scanner.nextInt();
        for ( int i = 0 ; i < n ; i++) {
            if(a[i] == m) {
                for(int j = i ; i < n-1; i++) {
                    a[j] = a[j+1];
                }
                n--;
            }
        }
        System.out.println("Da xoa. ");
    }

    private static void ThemSo() {
        System.out.println("\nNhap so luong phan tu muon them: ");
        int m = scanner.nextInt();
        n+=m;
        System.out.println("\nNhap cac phan tu: ");
        for(int i = n-m ; i < n ; i++) {
            a[i] = scanner.nextInt();
        }
    }

    public static void XuatDaySo() {
        System.out.println("\nDanh sach cac phan tu: ");
        for(int i = 0 ; i < n ; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void NhapDaySo() {
        System.out.println("\nNhap so luong phan tu: ");
        n = scanner.nextInt();
        System.out.println("\nNhap cac phan tu: ");
        for(int i = 0 ; i < n ; i++) {
            a[i] = scanner.nextInt();
        }
    }
}
