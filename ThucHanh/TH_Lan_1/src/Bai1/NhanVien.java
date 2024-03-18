package Bai1;

import java.util.Scanner;

public class NhanVien extends Nguoi {
    int heSoLuong;
    int luongCoBan;

    NhanVien() {
        super();
        heSoLuong = 0;
        luongCoBan = 0;
    }

    NhanVien(String name, int age, String address, int heSoLuong, int luongCoBan) {
        super(name, age, address);
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;

    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so luong: ");
        heSoLuong = sc.nextInt();
        System.out.println("Nhap luong co ban: ");
        luongCoBan = sc.nextInt();

    }

    public void display() {
        super.display();
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Luong co ban: " + luongCoBan);

    }

    int tinhLuong() {
        return heSoLuong * luongCoBan;
    }

}
