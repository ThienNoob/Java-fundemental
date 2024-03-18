package Bai3;

import java.util.Scanner;

public class Main {
    static SinhVien[] aSinhViens;
    static int n;

    public static void main(String[] args) {
        int choose;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    sapXepTangDanTheoDiemTB();
                    display();
                    break;
                case 4:
                    timKiemTheoTen();
                    break;
                case 5:
                    xuatThongTinSinhVienCoHo();
                    break;
                case 6:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Nhap sai, moi nhap lai");
                    break;
            }
        } while (choose != 6);
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        aSinhViens = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            aSinhViens[i] = new SinhVien();
            aSinhViens[i].nhap();
        }
    }

    public static void display() {
        if (n == 0) {
            System.out.println("Chua co sinh vien nao");
            return;
        }
        for (int i = 0; i < n; i++) {
            aSinhViens[i].display();
        }
    }

    public static void sapXepTangDanTheoDiemTB() {

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (aSinhViens[i].getDiemTB() > aSinhViens[j].getDiemTB()) {
                    SinhVien temp = aSinhViens[i];
                    aSinhViens[i] = aSinhViens[j];
                    aSinhViens[j] = temp;
                }
            }
        }
    }

    public static void timKiemTheoTen() {
        if (n == 0) {
            System.out.println("Chua co sinh vien nao");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten can tim: ");
        String ten = scanner.nextLine();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (aSinhViens[i].getName().equals(ten)) {
                aSinhViens[i].display();
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Khong tim thay sinh vien co ten " + ten);
        }
    }

    public static void xuatThongTinSinhVienCoHo() {
        if (n == 0) {
            System.out.println("Chua co sinh vien nao");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho can tim: ");
        String ho = scanner.nextLine();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (aSinhViens[i].getName().startsWith(ho)) {
                aSinhViens[i].display();
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Khong tim thay sinh vien co ho " + ho);
        }
    }

    public static void menu() {
        System.out.println("=========================");
        System.out.println("Chon chuc nang: ");
        System.out.println("1. Nhap danh sach sinh vien");
        System.out.println("2. Xem danh sach sinh vien");
        System.out.println("3. Sap xep sinh vien theo diem trung binh tang dan");
        System.out.println("4. Tim kiem sinh vien theo ten");
        System.out.println("5. Xuat thong tin sinh vien co ho");
        System.out.println("6. Thoat");
        System.out.println("=========================");

    }

}
