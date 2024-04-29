// Bài 9 (Lập trình Generic)
// Xây dựng hàm max (theo Generic) trả về đối tượng lớn hơn trong 2 đối tượng.
// Xây dựng các lớp NhanVien (họ tên, mã nhân viên, lương) và lớp SinhVien(họ tên,
// mã sv, điểm trung bình)
// Viết chương trình nhập vào N NhanVien và M SinhVien. Dùng hàm max đã xây dựng
// tìm NhanVien lớn nhất (có lương lớn nhất) và SinhVien lớn nhất (có điểm trung bình
// lớn nhất)
package Bai9;

import java.util.Scanner;

// Class đối tượng Generic
class MaxFinder {
    // Hàm Generic trả về đối tượng lớn nhất
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}

// Class NhanVien
class NhanVien implements Comparable<NhanVien> {
    private String hoTen;
    private String maNV;
    private double luong;

    public NhanVien(String hoTen, String maNV, double luong) {
        this.hoTen = hoTen;
        this.maNV = maNV;
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }

    @Override
    public int compareTo(NhanVien nv) {
        return Double.compare(this.luong, nv.luong);
    }

    public String getHoTen() {
       return hoTen;
    }

    public String getMaNV() {
       return maNV;
    }
}

// Class SinhVien
class SinhVien implements Comparable<SinhVien> {
    private String hoTen;
    private String maSV;
    private double diemTB;

    public SinhVien(String hoTen, String maSV, double diemTB) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    public double getDiemTB() {
        return diemTB;
    }

    @Override
    public int compareTo(SinhVien sv) {
        return Double.compare(this.diemTB, sv.diemTB);
    }

    public String getHoTen() {
       return hoTen;
    }

    public String getMaSV() {
       return maSV;
    }
}


public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Nhập số lượng NhanVien: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số lượng SinhVien: ");
        int m = scanner.nextInt();

        
        NhanVien maxNhanVien = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.next();
            System.out.print("Mã nhân viên: ");
            String maNV = scanner.next();
            System.out.print("Lương: ");
            double luong = scanner.nextDouble();

            NhanVien nv = new NhanVien(hoTen, maNV, luong);
            maxNhanVien = (maxNhanVien == null || nv.compareTo(maxNhanVien) > 0) ? nv : maxNhanVien;
        }

        
        SinhVien maxSinhVien = null;
        for (int i = 0; i < m; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.next();
            System.out.print("Mã sinh viên: ");
            String maSV = scanner.next();
            System.out.print("Điểm trung bình: ");
            double diemTB = scanner.nextDouble();

            SinhVien sv = new SinhVien(hoTen, maSV, diemTB);
            maxSinhVien = (maxSinhVien == null || sv.compareTo(maxSinhVien) > 0) ? sv : maxSinhVien;
        }

        
        System.out.println("Nhân viên có lương cao nhất:");
        System.out.println("Họ tên: " + maxNhanVien.getHoTen());
        System.out.println("Mã nhân viên: " + maxNhanVien.getMaNV());
        System.out.println("Lương: " + maxNhanVien.getLuong());

        System.out.println("\nSinh viên có điểm trung bình cao nhất:");
        System.out.println("Họ tên: " + maxSinhVien.getHoTen());
        System.out.println("Mã sinh viên: " + maxSinhVien.getMaSV());
        System.out.println("Điểm trung bình: " + maxSinhVien.getDiemTB());

        scanner.close();
    }
}
