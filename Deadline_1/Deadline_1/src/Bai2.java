//2. Viết chương trình giải phương trình bậc hai ax2 + bx + c = 0.

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a, b, c;
        Double delta;

        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Nhap a, b, c: ");

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a == 0) {
            System.out.println("Phuong trinh co nghiem: x = " + (-c / b));
        } else {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep: x = " + (-b) / (2 * a));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + " x2 = " + x2);
            }
        }

    }

}
