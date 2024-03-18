package Bai4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Complex a = new Complex();
        Complex b = new Complex();
        System.out.println("Nhap so phuc a ");
        a.nhap();
        System.out.println("Nhap so phuc b ");
        b.nhap();

        System.out.print("So phuc a: ");
        a.display();
        System.out.print("So phuc b: ");
        b.display();

        Complex kq = a.cong(b);
        System.out.print("Tong: ");
        kq.display();
       

        kq = a.tru(b);
        System.out.print("Hieu: ");
        kq.display();
       

        kq = a.nhan(b);
        System.out.print("Tich: ");
        kq.display();
        

        kq = a.chia(b);
        System.out.print("Thuong: ");
        kq.display();

    }

}
