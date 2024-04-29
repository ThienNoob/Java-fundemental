package Bai6;

import java.util.Scanner;

public class SinhVien {
    private String MSSV;
    private String hoTen;
    private double diemTB;
    private double diemRL;
    SinhVien(){
        MSSV = "";
        hoTen = "";
        diemTB = 0;
        diemRL = 0;
    }
    SinhVien(String MSSV, String hoTen, double diemTB, double diemRL){
        this.MSSV = MSSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.diemRL = diemRL;
    }
    public SinhVien(String string, String string2, double d) {
        //TODO Auto-generated constructor stub
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap MSSV: ");
        MSSV = scanner.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhap diem TB: ");
        diemTB = scanner.nextDouble();
        System.out.println("Nhap diem RL: ");
        diemRL = scanner.nextDouble();
    }
    public void xuat(){
        System.out.println("MSSV: " + MSSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Diem TB: " + diemTB);
        System.out.println("Diem RL: " + diemRL);
    }
    public double getDiemTB(){
        return diemTB;
    }
    public double getDiemRL(){
        return diemRL;
    }

    
}
