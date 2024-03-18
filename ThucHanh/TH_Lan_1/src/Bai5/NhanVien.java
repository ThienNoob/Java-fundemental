package Bai5;

import java.util.Scanner;

public class NhanVien extends Nguoi{
    private String maNhanVien;
    private double soGioLam, giaTheoGio;
    NhanVien() {
        super();
        maNhanVien = "";
        soGioLam = 0;
        giaTheoGio = 0;
    }
    NhanVien(String name, String maNhanVien, double soGioLam, double giaTheoGio) {
        super(name);
        this.maNhanVien = maNhanVien;
        this.soGioLam = soGioLam;
        this.giaTheoGio = giaTheoGio;
    }
   @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap ma nhan vien: ");
        maNhanVien = sc.nextLine();
        System.out.print("Nhap so gio lam: ");
        soGioLam = sc.nextDouble();
        System.out.print("Nhap gia theo gio: ");
        giaTheoGio = sc.nextDouble();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Luong: " + valuate());
    }

    

    @Override
    public double valuate() {
        return soGioLam * giaTheoGio;
    }

}
