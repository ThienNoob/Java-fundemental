package Bai5;
import java.util.Scanner;
public class Nguoi implements Measurable{
    protected String name;
    Nguoi() {
        name = "";
    }
    
    Nguoi(String name) {
        this.name = name;
    }
    public void xuat() {
        System.out.println("Ten: " + name);
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
    }
    public String getName() {
        return name;
    }

    @Override
    public double valuate() {
        return 0;
    }

    
}
