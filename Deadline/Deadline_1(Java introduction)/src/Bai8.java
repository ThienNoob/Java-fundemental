// 8. Viết hàm nhập, xuất 1 mảng gồm n phần tử (số nguyên) và thực hiện các yêu cầu
// • Đếm số phần tử chẵn và lẻ
// • Tính giá trị trung bình của mảng
// • Tìm phần tử lớn nhất và nhỏ nhất
// • Xuất mảng theo chiều ngược lại
// • Sắp xếp mảng tăng dần và xuất ra kết quả


import java.util.Scanner;

public class Bai8 {
    static int n;
    static int[] a = new int[100];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so phan tu: ");
        n = scanner.nextInt();
        NhapMang();
        XuatMang();
        ChanLe();
        TinhGiaTriTrungBinh();
        TimPhanTuLonNhatVaNhoNhat();
        XuatMangTheoChieuNguoc();
        SapXepMangTangDan();
    }

    private static void SapXepMangTangDan() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Mang sap xep tang dan: ");
        XuatMang();
    }

    private static void XuatMangTheoChieuNguoc() {
        System.out.print("Danh sach cac phan tu theo chieu nguoc: ");
        for(int i = n-1 ; i >= 0 ; i--) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    private static void TimPhanTuLonNhatVaNhoNhat() {
        int maxIndex = 0;
        int minIndex = 0;
        
        for (int i = 1; i < n; i++) {
            if (a[i] >= a[maxIndex]) {
                maxIndex = i;
            }

            if (a[i]<= a[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Phan tu co gia tri lon nhat va nho nhat lan luot la: " + maxIndex + " " + minIndex);
    }

    private static void TinhGiaTriTrungBinh() {
        System.out.print("Gia tri trung binh: ");
        double tb = 0;
        for(int i = 0 ; i < n ; i++) {
            tb+=a[i];
        }
        System.out.println((tb / n)+"");
    }

    private static void ChanLe() {
        System.out.print("So phan tu chan va le lan luot la: ");
        int chan = 0;
        int le = 0;
        for(int i = 0 ; i < n ; i++) {
            if(a[i] % 2 == 0)
                chan++;
            else
                le++;
        }
        System.out.println(chan +" " + le);
    }

    private static void XuatMang() {
        System.out.print("Danh sach cac phan tu: ");
        for(int i = 0 ; i < n ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    private static void NhapMang() {
        System.out.println("Nhap cac phan tu: ");
        for(int i = 0 ; i < n ; i++) {
            a[i] = scanner.nextInt();    
        }
    }  
}
