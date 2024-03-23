// Bài 1 (String, StringTokenizer)
// Nhập string A và string B từ bàn phím: (VD: A="av ajavaja va" B="java")
// a) đếm số lần xuất hiện của chuỗi B trong chuỗi A (VD: 1)
// b) trả về chuỗi C sau khi đã loại bỏ mọi kí tự khoảng trắng của chuỗi A (VD:
// C="avajavajava")
// c) kiểm tra chuỗi A có đối xứng hay không (VD: true)
// d) đảo ngược từng từ (word) của chuỗi A để tạo thành chuỗi D (có thể sẽ có nhiều hơn
// 1 dấu cách giữa các từ) (VD: D="va ajavaja av")
// Có thể sử dụng String hoặc String Tokenizer

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string A: ");
        String A = scanner.nextLine();
        System.out.print("Enter string B: ");
        String B = scanner.nextLine();
        scanner.close();
        System.out.println("a) " + countString(A, B));
        System.out.println("b) " + removeSpace(A));
        System.out.println("c) " + isSymmetric(A));
        System.out.println("d) " + reverseWord(A));
    }

    private static String reverseWord(String a) {
        String[] words = a.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();

    }

    private static String isSymmetric(String a) {
        String b = new StringBuilder(a).reverse().toString();
        return a.equals(b) ? "true" : "false";
       
    }

    private static String removeSpace(String a) {
        return a.replaceAll("\\s", "");
       
    }

    private static String countString(String a, String b) {
        int count = 0;
        int index = a.indexOf(b);
        while (index != -1) {
            count++;
            index = a.indexOf(b, index + 1);
        }
        return String.valueOf(count);
    }
    
}
