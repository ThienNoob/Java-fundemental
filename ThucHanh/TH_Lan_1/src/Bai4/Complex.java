package Bai4;

import java.util.Scanner;

public class Complex {
    private double phanThuc;
    private double phanAo;

    Complex(){
        phanThuc = 0;
        phanAo = 0;
    }
    Complex(double phanThuc, double phanAo){
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan thuc: ");
        phanThuc = sc.nextDouble();
        System.out.println("Nhap phan ao: ");
        phanAo = sc.nextDouble();
    }

    public void display(){
        System.out.println(phanThuc + " + " + phanAo + "i");
    }

    public Complex cong(Complex c){
        Complex kq = new Complex();
        kq.phanThuc = this.phanThuc + c.phanThuc;
        kq.phanAo = this.phanAo + c.phanAo;
        return kq;
    }
    public Complex tru(Complex c){
        Complex kq = new Complex();
        kq.phanThuc = this.phanThuc - c.phanThuc;
        kq.phanAo = this.phanAo - c.phanAo;
        return kq;
    }
    public Complex nhan(Complex c){
        Complex kq = new Complex();
        kq.phanThuc = this.phanThuc * c.phanThuc - this.phanAo * c.phanAo;
        kq.phanAo = this.phanThuc * c.phanAo + this.phanAo * c.phanThuc;
        return kq;
    }
    public Complex chia(Complex c){
        Complex kq = new Complex();
        double mauSo = c.phanThuc * c.phanThuc + c.phanAo * c.phanAo;
        kq.phanThuc = (this.phanThuc * c.phanThuc + this.phanAo * c.phanAo) / mauSo;
        kq.phanAo = (this.phanAo * c.phanThuc - this.phanThuc * c.phanAo) / mauSo;
        return kq;
    }



}
