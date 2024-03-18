package Bai5;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    private double diemToan, diemLy, diemHoa;
    private String maSV;

    SinhVien() {
        super();
        diemToan = 0;
        diemLy = 0;
        diemHoa = 0;
        maSV = "";
    }

    SinhVien(String name,String maSV, double diemToan, double diemLy, double diemHoa) {
        super(name);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.maSV = maSV;
       
    }
    @Override
    public void nhap() {
        
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        maSV = sc.nextLine();
        System.out.println("Nhap diem toan: ");
        diemToan = sc.nextDouble();
        System.out.println("Nhap diem ly: ");
        diemLy = sc.nextDouble();
        System.out.println("Nhap diem hoa: ");
        diemHoa = sc.nextDouble();

    }

    @Override
    public double valuate() {
        return (diemToan + diemLy + diemHoa) / 3;
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Diem trung binh: " + valuate());

    }

}
