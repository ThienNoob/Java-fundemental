//3. Nhập n số nguyên. Hãy sắp xếp giá trị của các số nguyên này theo thứ tự tăng dần.

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Mang truoc sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        //
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nMang sau sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
