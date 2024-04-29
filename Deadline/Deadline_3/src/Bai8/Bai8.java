// Bài 8 (SortedSet, HashSet, TreeSet)
// Viết chương trình cho phép nhập vào các cầu thủ 1 đội bóng sử dụng Array với mỗi
// cầu thủ gồm các field { tên, số áo, Array các vị trí đá (tượng trưng vài vị trí chứ ko
// cần chính xác đầy đủ) }. Xuất ra màn hình:
// - Danh sách các cầu thủ
// - Danh sách các cầu thủ tăng dần theo số áo
// - Danh sách các cầu thủ lọc theo tên hoặc MỘT vị trí đá
package Bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai8 {
    static ArrayList<CauThu> list = new ArrayList<>();
    static void nhapDanhSach() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong cau thu: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            CauThu ct = new CauThu();
            ct.nhap();
            list.add(ct);
        }
    }
    static void xuatDanhSach() {
        for (CauThu ct : list) {
            ct.xuat();
        }
    }
    static void sapXep() {
        list.sort((ct1, ct2) -> ct1.getSoAo() - ct2.getSoAo());
        System.out.println("Danh sach cau thu tang dan theo so ao: ");
        xuatDanhSach();
    }
    static void loc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String key = scanner.nextLine();
        System.out.println("Danh sach cau thu co ten " + key + ": ");
        for (CauThu ct : list) {
            if (ct.getTen().contains(key)) {
                ct.xuat();
            }
        }
        System.out.print("Nhap vi tri da: ");
        key = scanner.nextLine();
        System.out.println("Danh sach cau thu co vi tri da " + key + ": ");
        for (CauThu ct : list) {
            if (ct.getViTriDa().contains(key)) {
                ct.xuat();
            }
        }
        

    }

    public static void main(String[] args) {
        nhapDanhSach();
        xuatDanhSach();
        sapXep();
        loc();
    }
}
