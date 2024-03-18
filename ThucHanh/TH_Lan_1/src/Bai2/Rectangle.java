package Bai2;

import java.util.Scanner;
public class Rectangle extends Shape {
    private double rong;
    private double dai;

    @Override
    public double tinhDienTich() {
        return dai * rong;
    }

    @Override
    public String toString() {
        return "Hinh chu nhat{" + "dien tich = " + tinhDienTich();
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        rong = scanner.nextDouble();
        System.out.println("Nhap chieu dai: ");
        dai = scanner.nextDouble();
    }

}
