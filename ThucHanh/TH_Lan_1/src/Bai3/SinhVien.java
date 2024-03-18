package Bai3;
import Bai1.Nguoi;
import java.util.Scanner;
public class SinhVien extends Nguoi{
    private double diemTB;
    SinhVien() {
        super();
        diemTB = 0;
    }
    SinhVien(String name, int age, String address, double diemTB) {
        super(name, age, address);
        this.diemTB = diemTB;
    }
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem trung binh: ");
        diemTB = sc.nextDouble();
    }
    @Override
    public void display() {
        System.out.println("Ten: " + name);
        System.out.println("Diem trung binh: " + diemTB);
    }
    public double getDiemTB() {
        return diemTB;
    }
    public String getName() {
        return name;
    }

    
}



