package Bai7;
import java.util.List;
import java.util.Scanner;

class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private double heSoLuong;
    public Nguoi(){
        this.hoTen = "";
        this.ngaySinh = "";
        this.heSoLuong = 0;
    }
    public Nguoi(String hoTen, String ngaySinh, double heSoLuong) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.heSoLuong = heSoLuong;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh: (dd/mm/yyyy)");
        this.ngaySinh = sc.nextLine();
        System.out.println("Nhap he so luong: ");
        this.heSoLuong = sc.nextDouble();
    }

    // Getters and setters

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public double tinhLuong(){
        return this.heSoLuong * 1200000;
    
    }

    public void Xuat(){
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Ngay sinh: " + this.ngaySinh);
        System.out.println("He so luong: " + this.heSoLuong);
        
    }


}

