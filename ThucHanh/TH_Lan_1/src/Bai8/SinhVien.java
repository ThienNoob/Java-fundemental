package Bai8;
public class SinhVien implements Comparable<SinhVien> {
    private String hoTen;
    private double diemTB;
    
    SinhVien() {
        hoTen = "";
        diemTB = 0;
    }
    
    SinhVien(String hoTen, double diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
    
    @Override
    public int compareTo(SinhVien b) {
        if (diemTB > b.diemTB) return 1;
        if (diemTB < b.diemTB) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return hoTen + "_" + diemTB;
    }

}
