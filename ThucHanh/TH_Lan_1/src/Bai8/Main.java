// 8. Comparable là một interface có sẵn trong Java nhằm hỗ trợ xây dựng các lớp có thể
// so sánh được (ví dụ hỗ trợ sắp xếp) với khai báo như sau:
// public interface Comparable <T> {
// public int compareTo (T o); //1, 0, -1
// }
// class SinhVien implements Comparable <SinhVien>
// class SinhVien implements Comparable
// • Xây dựng lớp sinh viên hiện thực interface trên. Thông tin sinh viên gồm họ tên
// (chuỗi) và điểm trung bình (số thực). Hai đối tượng sinh viên so sánh với nhau
// dựa trên điểm trung bình. Ngoài ra xây dựng lại phương thức toString() (public
// String toString()) trả về chuỗi gồm: [họ tên] + “_” + điểm trung bình.
// • Viết chương trình nhập vào một mảng sinh viên và xuất ra danh sách sinh viên
// có điểm trung bình tăng dần. Gợi ý: dùng lớp Arrays.sort(Object []),
// Arrays.toString(Object[])
package Bai8;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static SinhVien[] aSinhViens;
    static int n;
    public static void main(String[] args) {
        nhap();
        sapXep();
        xuatTangDan();
    }
    static void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        sc.nextLine(); 
        aSinhViens = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i+1) + ": ");
            System.out.println("Nhap ho ten: ");
            String hoTen = sc.nextLine();
            System.out.println("Nhap diem trung binh: ");
            double diemTB = sc.nextDouble();
            sc.nextLine(); // Consume the newline character
            aSinhViens[i] = new SinhVien(hoTen, diemTB);
        }
    }

    static void sapXep() {
        Arrays.sort(aSinhViens);
    }

    static void xuatTangDan(){
        
        System.out.println(Arrays.toString(aSinhViens));
    }

   
    
}
