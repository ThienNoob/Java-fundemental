// 2. Khai báo lớp Shape là lớp trừu tượng, có phương thức tính diện tích và phương thức
// toString (xuất ra tên hình và diện tích). Xây dựng lớp Rectangle và Circle kế thừa
// lớp Shape để định nghĩa hình chữ nhật và hình tròn. Trong hàm main cho phép nhập
// vào các hình và đếm xem có bao nhiêu hình chữ nhật, hình tròn và xuất ra hình có
// diện tích lớn nhất
package Bai2;

import java.util.Scanner;

public class Main {
    private static int n, demHinhTron, demHinhChuNhat;
    private static Shape[] shapes;

    public static void main(String[] args) {
        demHinhTron = 0;
        demHinhChuNhat = 0;
        input();
        System.out.println("So hinh tron: " + demHinhTron);
        System.out.println("So hinh chu nhat: " + demHinhChuNhat);
        System.out.println("Hinh co dien tich lon nhat: " + shapes[timHinhCoDienTichLonNhat()].toString());

    }

    public static int timHinhCoDienTichLonNhat(){
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (shapes[i].tinhDienTich() > shapes[max].tinhDienTich()) {
                max = i;

            }
        }
        return max;
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong hinh: ");
        n = scanner.nextInt();
        shapes = new Shape[n];
        for (int i = 0; i < n; i++) {
            System.out.println("1. Hinh tron");
            System.out.println("2. Hinh chu nhat");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    shapes[i] = new Circle();
                    shapes[i].input();
                    demHinhTron++;
                    break;
                case 2:
                    shapes[i] = new Rectangle();
                    shapes[i].input();
                    demHinhChuNhat++;
                    break;
                default:
                    System.out.println("Nhap sai");
                    break;
            }
        }
    }
}
