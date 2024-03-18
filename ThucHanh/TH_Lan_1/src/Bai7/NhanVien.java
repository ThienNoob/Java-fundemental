package Bai7;

import java.util.Scanner;

class NhanVien extends Nguoi {
    private String tenDonVi;
    NhanVien(){
        super();
        this.tenDonVi = "";
    }
    public NhanVien(String hoTen, String ngaySinh, double heSoLuong, String tenDonVi) {
        super(hoTen, ngaySinh, heSoLuong);
        this.tenDonVi = tenDonVi;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap ten don vi: ");
        this.tenDonVi = sc.nextLine();
    }
    public void Xuat() {
        super.Xuat();
        System.out.println("Ten don vi: " + this.tenDonVi);
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong();
    }
    public String getTenDonVi() {
        return tenDonVi;
    }
}
