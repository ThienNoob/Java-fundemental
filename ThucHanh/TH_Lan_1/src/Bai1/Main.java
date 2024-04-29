// 1. Tạo lớp Person gồm các thuộc tính: họ tên, tuổi và địa chỉ và các phương thức: khởi
// tạo, hiện thị thông tin. Tạo lớp NhanVien kế thừa từ lớp Nguoi và có thêm thuộc
// tính: lương cơ bản và hệ số có phương thức khởi tạo, tính lương (lương cơ bản * hệ
// số). Trong hàm main nhập vào danh sách các nhân viên và xuất ra tổng lương và
// nhân viên có lương cao nhất.


package Bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NhanVien[] aNhanViens;
        int n;
        System.out.println("Nhap so luong nhan vien: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        aNhanViens = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            aNhanViens[i] = new NhanVien();
            aNhanViens[i].nhap();
        }
        System.out.println("Tong luong: " + tinhTongLuong(aNhanViens));
        System.out.println("Nhan vien co luong cao nhat: ");
        aNhanViens[luongCaoNhat(aNhanViens)].display();

    }
   

    public static int tinhTongLuong(NhanVien[] aNhanViens) {
        int sum = 0;
        for (int i = 0; i < aNhanViens.length; i++) {
            sum += aNhanViens[i].tinhLuong();
        }
        return sum;
    }

    public static int luongCaoNhat(NhanVien[] aNhanViens) {
        int index = 0;
        int max = aNhanViens[0].tinhLuong();
        for (int i = 0; i < aNhanViens.length; i++) {
            if (aNhanViens[i].tinhLuong() > max) {
                max = aNhanViens[i].tinhLuong();
                index = i;
            }
        }
        return index;
    }

    // public static void main(String[] args) {
    //     NhanVien[] aNhanViens;
    //     int n;
    //     System.out.println("Nhap so luong nhan vien: ");
    //     Scanner sc = new Scanner(System.in);
    //     n = sc.nextInt();
    //     aNhanViens = new NhanVien[n];
    //     for (int i = 0; i < n; i++) {
    //         aNhanViens[i] = new NhanVien();
    //         aNhanViens[i].nhap();
    //     }
    //     System.out.println("Tong luong: " + tinhTongLuong(aNhanViens));
    //     System.out.println("Nhan vien co luong cao nhat: ");
    //     aNhanViens[luongCaoNhat(aNhanViens)].display();

    // }
   
}
