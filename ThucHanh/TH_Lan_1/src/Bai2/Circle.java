package Bai2;

import java.util.Scanner;

public class Circle extends Shape {
    private double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Hinh tron{" + "dien tich = " + tinhDienTich() + '}';
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        radius = scanner.nextDouble();
    }

}
