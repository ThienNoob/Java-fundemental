package Bai7;

import java.util.Scanner;

class GiamDoc extends Nguoi {
    private double heSoChucVu;
    GiamDoc(){
        super();
        this.heSoChucVu = 0;
    }
    public GiamDoc(String hoTen, String ngaySinh, double heSoLuong, double heSoChucVu) {
        super(hoTen, ngaySinh, heSoLuong);
        this.heSoChucVu = heSoChucVu;
    }
    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap he so chuc vu: ");
        this.heSoChucVu = sc.nextDouble();

    }

    @Override
    public double tinhLuong() {
        
        return super.tinhLuong() + this.heSoChucVu * 1200000;
    }

    @Override
    public void Xuat() {       
        super.Xuat();
        System.out.println("He so chuc vu: " + this.heSoChucVu);
    }


}
