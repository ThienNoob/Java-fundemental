package Bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CauThu {
    private String ten;
    private int soAo;
    private List<String> viTriDa;
    public CauThu(){
        ten = "";
        soAo = 0;
        viTriDa = new ArrayList<>();
    }
    public CauThu(String ten, int soAo, List<String> viTriDa){
        this.ten = ten;
        this.soAo = soAo;
        this.viTriDa = viTriDa;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten = scanner.nextLine();
        System.out.println("Nhap so ao: ");
        soAo = scanner.nextInt();
        System.out.println("Nhap vi tri da: FW, MF, DF, GK");
        scanner.nextLine();
        String[] viTri = scanner.nextLine().split(" ");
        for (String vt : viTri) {
            viTriDa.add(vt);
        }
    }
    public void xuat(){
        System.out.println("Ten: " + ten);
        System.out.println("So ao: " + soAo);
        System.out.print("Vi tri da: ");
        for (String vt : viTriDa) {
            System.out.print(vt + " ");
        }
        System.out.println();
    }
    public int getSoAo(){
        return soAo;
    }
    public String getTen(){
        return ten;
    }
    public List<String> getViTriDa(){
        return viTriDa;
    }


}
