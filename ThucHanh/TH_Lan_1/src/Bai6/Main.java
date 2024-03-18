// 6. Viết chương trình tạo và sử dụng lớp MyMath biểu diễn lớp toán học gồm các
// phương thức static:
// • Tìm ước chung lớn nhất của 2 số nguyên
// • Tìm giá trị lớn nhất của 3 số thực
// • Tìm giá trị nhỏ nhất của 3 số thực
// • Kiểm tra một số có là số nguyên tố
// • Tính tổng dãy từ 1 đến N
// • Tính trị tuyệt đối của 1 số nguyên
// • Làm tròn một số thực

package Bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so nguyen a: ");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen b: ");
        int b = sc.nextInt();
        System.out.println("UCLN cua " + a + " va " + b + " la: " + myMath.timUCLN(a, b));

        System.out.println("Nhap so thuc a: ");
        double a1 = sc.nextDouble();
        System.out.println("Nhap so thuc b: ");
        double b1 = sc.nextDouble();
        System.out.println("Nhap so thuc c: ");
        double c1 = sc.nextDouble();
        System.out.println("Max cua 3 so thuc la: " + myMath.timMax(a1, b1, c1));
        System.out.println("Min cua 3 so thuc la: " + myMath.timMin(a1, b1, c1));

        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        System.out.println("Tong tu 1 den " + n + " la: " + myMath.tinhTong(n));

        System.out.println("Nhap so nguyen to can kiem tra: ");
        int soNguyenTo = sc.nextInt();
        if (myMath.laSoNguyenTo(soNguyenTo)) {
            System.out.println(soNguyenTo + " la so nguyen to");
        } else {
            System.out.println(soNguyenTo + " khong la so nguyen to");
        }

        System.out.println("Nhap so nguyen : ");
        a = sc.nextInt();
        System.out.println("Tri tuyet doi cua " + a + " la: " + Math.abs(a));

        System.out.println("Nhap so thuc can lam tron: ");
        double soThuc = sc.nextDouble();
        System.out.println("So thuc sau khi lam tron la: " + Math.round(soThuc));

    }

}
