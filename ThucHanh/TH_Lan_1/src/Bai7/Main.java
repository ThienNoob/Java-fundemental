// 7. Viết chương trình quản lý nhân sự một công ty gồm các thành phần:
// • Giám đốc: gồm các thuộc tính họ tên, ngày sinh, hệ số lương, hệ số chức vụ
// • Quản lý: gồm các thuộc tính họ tên, ngày sinh, hệ số lương, số lương nhân viên
// quản lý
// • Nhân viên: gồm các thuộc tính họ tên, ngày sinh, hệ số lương, tên đơn vị
// (phòng/ban)
// Chương trình thực hiện các yêu cầu sau:
// • Nhập vào danh sách gồm N nhân viên của công ty
// • Hiển thị thông tin các nhân viên
// • Xuất nhân viên có lương cao nhất (lương = (hệ số lương + hệ số chức vụ (nếu
// có)) * 1200000
// • Hiển thị các nhân viên sinh trong tháng 2
// • Xuất thông tin nhân viên thuộc phòng “Kế toán”
// • Đếm xem có bao nhiêu nhân viên tên là “An”.
package Bai7;

import java.util.Scanner;

public class Main {
    static Nguoi[] aNguois;
    static int n;
    public static void main(String[] args) {
        nhap();
        xuat();
        System.out.println("\nNhan vien co luong cao nhat: ");
        aNguois[timLuongCaoNhat()].Xuat();
        System.out.println("Luong: " + aNguois[timLuongCaoNhat()].tinhLuong());
        System.out.println("\nDanh sach nhan vien sinh thang 2: ");
        timNhanVienSinhThang2();
        System.out.println("\nDanh sach nhan vien thuoc phong ban \"Ke toan\": ");
        timNhanVienTheoPhongBan("Ke toan");
        demNhanVienTheoTen("An");

    }
    static void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien: ");
        n = sc.nextInt();
        aNguois = new Nguoi[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap loai nhan vien: ");
            System.out.println("1. Nhan vien");
            System.out.println("2. Quan ly");
            System.out.println("3. Giam doc");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    aNguois[i] = new NhanVien();
                    aNguois[i].nhap();
                    break;
                case 2:
                    aNguois[i] = new QuanLy();
                    aNguois[i].nhap();
                    break;
                case 3:
                    aNguois[i] = new GiamDoc();
                    aNguois[i].nhap();
                    break;
                default:
                    break;
            }
        }
    }

    static void xuat(){
        for (int i = 0; i < n; i++) {
            aNguois[i].Xuat();
        }
    }

    static int timLuongCaoNhat(){
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(aNguois[i].tinhLuong() > aNguois[max].tinhLuong()){
                max = i;
            }
        }
        return max;
    }

    static void timNhanVienSinhThang2(){
        int flag = 0;
        System.out.println("Danh sach nhan vien sinh thang 2 ");
        for (int i = 0; i < n; i++) {
            if(aNguois[i].getNgaySinh().split("/")[1].equals("2")){
                aNguois[i].Xuat();
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Khong co nhan vien sinh thang 2");
        }
    }

    static void timNhanVienTheoPhongBan(String tenPhongBan){
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if(aNguois[i] instanceof NhanVien){
                if(((NhanVien) aNguois[i]).getTenDonVi().equals(tenPhongBan)){
                    aNguois[i].Xuat();
                    flag = 1;
                }
            }
        }
        if(flag == 0){
            System.out.println("Khong co nhan vien thuoc phong ban " + tenPhongBan);
        }
    }

    static void demNhanVienTheoTen(String ten){
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if(aNguois[i].getHoTen().contains(ten)){
                dem++;
            }
        }
        System.out.println("So nhan vien ten " + ten + " la: " + dem);
    }



}
