// 3. Khai báo lớp PhanSo có các thuộc tính: tử số, mẫu số (số nguyên)
// và các phương thức: constructor (0, 1, 2 tham số), nhập, xuất, rút
// gọn, cộng, trừ, nhân, chia, so sánh (với một phân số khác). Sau
// đó viết chương trình cho phép nhập vào dãy n phân số, xuất ra:
// ▪ Các phân số vừa nhập
// ▪ Tổng các phân số
// ▪ Xuất danh sách phân số theo thứ tự tăng dần

import java.util.Scanner;

class Fraction {
    private int numerator, denominator;

    Fraction() {
        numerator = 0;
        denominator = 1;
    }

    Fraction(int numerator) {
        this.numerator = numerator;
        denominator = 1;

    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplifyFration();

    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void inputFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numerator, denominator: ");
        numerator = scanner.nextInt();
        while (true) {
            denominator = scanner.nextInt();
            if (denominator == 0) {
                System.out.println("Denominator must not equal to 0, enter again: ");
            } else {
                break;
            }

        }
        simplifyFration();

    }

    public void displayFraction() {
        System.out.print(numerator + "/" + denominator);
    }

    public int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);

    }

    public void simplifyFration() {
        int gcd = findGCD(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public Fraction addFraction(Fraction b) {
        return new Fraction(this.numerator * b.denominator + this.denominator * b.numerator,
                this.denominator * b.denominator);
    }

    public Fraction subtractFraction(Fraction b) {
        return new Fraction(this.numerator * b.denominator - this.denominator * b.numerator,
                this.denominator * b.denominator);
    }

    public Fraction multiplyFraction(Fraction b) {
        return new Fraction(this.numerator * b.numerator,
                this.denominator * b.denominator);
    }

    public Fraction divideFraction(Fraction b) {
        return new Fraction(this.numerator * b.denominator,
                this.numerator * b.denominator);
    }

    public boolean compareToFraction(Fraction another) {
        if (numerator / denominator > another.getNumerator() / another.getDenominator())
            return true;
        return false;
    }

}

public class Bai3 {
    public static void main(String[] args) {
        Fraction[] arrFractions = new Fraction[100];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of fraction: ");
        int n = scanner.nextInt();

        // Nhap danh sach phan so
        System.out.println("Enter fractions: ");
        for (int i = 0; i < n; i++) {
            arrFractions[i] = new Fraction();
            arrFractions[i].inputFraction();
        }

        // Xuat danh sach phan so
        System.out.println("Array of fractions: ");
        for (int i = 0; i < n; i++) {
            arrFractions[i].displayFraction();
            System.out.print(" ");
        }

        System.out.println();

        // Xuat tong cac phan so
        Fraction sum = new Fraction();
        for (int i = 0; i < n; i++)
            sum = sum.addFraction(arrFractions[i]);
        System.out.print("Sum of fractions: ");
        sum.displayFraction();
        System.out.println();

        // Xuat day cac phan so theo chieu tang dan
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (!arrFractions[i].compareToFraction(arrFractions[j])) {
                    min = j;
                }
            }
            if (min != i) {
                int numerator = arrFractions[i].getNumerator();
                int denominator = arrFractions[i].getDenominator();

                arrFractions[i] = new Fraction(arrFractions[min].getNumerator(), arrFractions[min].getDenominator());
                arrFractions[min] = new Fraction(numerator, denominator);
            }

        }

        System.out.println("Fractions is sorted in ascending order: ");
        for (int i = 0; i < n; i++) {
            arrFractions[i].displayFraction();
            System.out.print(" ");
        }

       

    }

    
    

}
