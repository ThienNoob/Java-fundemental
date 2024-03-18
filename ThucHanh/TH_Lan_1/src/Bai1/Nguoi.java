package Bai1;

import java.util.Scanner;

public class Nguoi {
    protected String name;
    int age;
    String address;

    public Nguoi() {
        name = "";
        age = 0;
        address = "";
    }

    public Nguoi(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();

    }
}
