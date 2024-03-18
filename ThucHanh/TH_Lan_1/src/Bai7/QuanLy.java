package Bai7;

import java.util.Scanner;

class QuanLy extends Nguoi {
    private int soLuongNhanVienQuanLy;

    public QuanLy(String hoTen, String ngaySinh, double heSoLuong, int soLuongNhanVienQuanLy) {
        super(hoTen, ngaySinh, heSoLuong);
        this.soLuongNhanVienQuanLy = soLuongNhanVienQuanLy;
    }

    // Getter and setter for soLuongNhanVienQuanLy

   QuanLy(){
        super();
        this.soLuongNhanVienQuanLy = 0;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so luong nhan vien quan ly: ");
        this.soLuongNhanVienQuanLy = sc.nextInt();
    }

    public void Xuat() {
        super.Xuat();
        System.out.println("So luong nhan vien quan ly: " + this.soLuongNhanVienQuanLy);
        
   }

   @Override
    public double tinhLuong() {
         return super.tinhLuong() ;
    }
}
