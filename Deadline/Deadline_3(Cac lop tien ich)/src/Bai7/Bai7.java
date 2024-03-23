// Bài 7 (HashMap, HashTable, Bổ sung fail-fast)
// Viết chương trình nhập vào 3 mục dưới đây và sắp xếp chúng theo giá trị key ( trong
// đó sử dụng HashMap và HashTable; HashMap sao chép từ 1 HasHtable )
// {3=OOP, 55=JAVA, 23=HashMap}
package Bai7;

import java.util.HashMap;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        System.out.println("Nhap so luong phan tu: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap key: ");
            int key = scanner.nextInt();
            System.out.println("Nhap value: ");
            String value = scanner.next();
            hashMap.put(key, value);
        }
        System.out.println("HashMap: ");
        System.out.println(hashMap);
        System.out.println("HashTable: ");
        System.out.println(new HashMap<>(hashMap));
        
    }

    


}
