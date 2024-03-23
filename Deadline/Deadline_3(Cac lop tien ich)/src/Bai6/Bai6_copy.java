// Bài 6 (Vector, ArrayList)
// Viết chương trình cho phép nhập vào danh sách n Sinh viên bao gồm các thuộc tính
// MSSV, họ tên, điểm TB, điểm rèn luyện (thang điểm 100) có sử dụng Vector và
// ArrayList.
// a. Hiển thị danh sách theo điểm TB giảm dần (nếu điểm TB bằng nhau thì xét theo
// điểm rèn luyện giảm dần)
// b. Xóa những sinh viên có điểm TB < 5 hoặc điểm rèn luyện < 50 và xuất ra danh sách.
// c. Nhập vào 1 danh sách m sinh viên chèn vào danh sách ban đầu tại vị trí k do người
// dùng nhập (0 <= k <= n), xuất ra danh sách và đếm số lượng sinh viên đạt loại Giỏi
// (ĐTB >= 8.0 và ĐRL >= 80).
package Bai6;

import java.util.Scanner;
import java.util.Vector;

public class Bai6_copy {
    static int n;
    static Vector<SinhVien> list = new Vector<>();

    static void nhapDanhSach(int n) {
        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);
        }
    }

    static void xuatDanhSach() {
        for (SinhVien sv : list) {
            sv.xuat();
        }
    }

    static void sapXep() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list.get(i).getDiemTB() < list.get(j).getDiemTB()) {
                    SinhVien temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                } else if (list.get(i).getDiemTB() == list.get(j).getDiemTB()) {
                    if (list.get(i).getDiemRL() < list.get(j).getDiemRL()) {
                        SinhVien temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                }
            }
        }
        System.out.println("a) Danh sach theo diem TB giam dan: ");
        xuatDanhSach();
    }

    static void xoa() {
        System.out.println("b) Danh sach sinh vien co diem khong dat: ");
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDiemTB() < 5 || list.get(i).getDiemRL() < 50) {
                list.get(i).xuat();
                flag = 1;
                list.remove(i);
                i--;
            }
        }
        if (flag == 0) {
            System.out.println("Khong co sinh vien nao khong dat");
        }
    }

    static void chen() {
        int m, k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien can chen: ");
        m = scanner.nextInt();
        System.out.print("Nhap vi tri can chen: ");
        k = scanner.nextInt();
        Vector<SinhVien> list1 = new Vector<>();
        for (int i = 0; i < m; i++) {
            SinhVien sv = new SinhVien();
            sv.nhap();
            list1.add(sv);
        }
        list.addAll(k, list1);
        System.out.println("Da chen danh sach sinh vien moi vao vi tri " + k);
        xuatDanhSach();
        System.out.println("So luong sinh vien dat loai gioi: " + demSoLuongSinhVienLoaiGioi());
    }

    static int demSoLuongSinhVienLoaiGioi() {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDiemTB() >= 8.0 && list.get(i).getDiemRL() >= 80) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        n = scanner.nextInt();
        nhapDanhSach(n);
        xuatDanhSach();
        sapXep();
        xoa();
        chen();
    }
}
