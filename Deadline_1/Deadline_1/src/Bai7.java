//7. Viết chương trình nhập vào mảng phân số(n phần tử) và xuất ra phân số nhỏ nhất, lớn nhất của mảng vừa nhập.
import java.util.Scanner;

class PhanSo {
    int tuSo;
    int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public double giaTri() {
        return (double) tuSo / mauSo;
    }
}

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhanSo[] a = new PhanSo[100];
        
        System.out.println("Nhap so luong phan so: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap tu so va mau so");
            int tu, mau;
            tu = scanner.nextInt();
            mau = scanner.nextInt();
            
            while (mau == 0) {
                System.out.println("Mau so khong duoc bang 0, nhap lai mau so");
                mau = scanner.nextInt();
            }
            
            a[i] = new PhanSo(tu, mau);
        }

        double min = a[0].giaTri();
        double max = a[0].giaTri();
        
        for (int i = 1; i < n; i++) {
            if (a[i].giaTri() >= max) {
                max = a[i].giaTri();
            }

            if (a[i].giaTri() <= min) {
                min = a[i].giaTri();
            }
        }

        System.out.println("Gia tri phan so lon nhat va nho nhat la: " + max + " " + min);
    }
}
