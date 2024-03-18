// 5. Xây dựng giao diện Measurable có phương thức Valuate có kiểu là số thực. Xây
// dựng lớp NhanVien (họ tên, mã nhân viên số giờ làm, giá theo giờ, lương = số giờ
// * giá theo giờ) hiện thực giao diện Measurable (Valuate trả về lương nhân viên).
// Xây dựng lớp SinhVien (họ tên, mã SV, điểm toán, lý, hóa, ĐTB là trung bình của
// 3 môn) hiện thực giao diện Measurable (Valuate trả về điểm trung bình). Nhập vào
// n nhân viên, m sinh viên và tính lương trung bình của các nhân viên, điểm trung
// bình của các sinh viên vừa nhập. Yêu cầu: quản lý nhân viên và sinh viên chung 1
// danh sách.
package Bai5;

import java.util.Scanner;

public class Main {
    static Nguoi[] aNguois;
    static int n;
    public static void main(String[] args) {
        nhap();
        xuat();
    }
    public static void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nguoi: ");
        n = sc.nextInt();
        aNguois = new Nguoi[n];
        for (int i = 0; i < n; i++) {
            System.out.println("1. Nhap nhan vien");
            System.out.println("2. Nhap sinh vien");
            int chon = sc.nextInt();
            if (chon == 1) {
                aNguois[i] = new NhanVien();
            } else {
                aNguois[i] = new SinhVien();
            }
            aNguois[i].nhap();
        }
    }
    public static void xuat(){
        for (int i = 0; i < n; i++) {
            aNguois[i].xuat();
        }
    }
    
}
