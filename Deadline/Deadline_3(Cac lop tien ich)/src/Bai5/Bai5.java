// Bài 5 (Regular expression)
// Input:
// + username
// + email
// + password
// 1/ không cho phép 1 trong 3 trường trên trống
// 2/ kiểm tra username số ký tự 15 <= username <= 30 (chỉ gồm chữ cái, khoảng trắng,
// và ký tự đầu mỗi từ phải là chữ hoa)
// 3/ kiểm tra email theo định dạng aaa@bbb.ccc với:
// - email không được chứa chữ hoa, ký tự đặc biệt.
// - aaa: có thể là chữ thường hoặc số(trừ ký tự đầu là chữ(a->z)), bbb và ccc là chữ
// thường.
// 4/ kiểm tra password ít nhất 8 ký tự, ký tự đầu là chữ hoa (A->Z), password chỉ gồm
// chữ hoa, chữ thường và số (không được chứa ký tự đặc biệt)
// Output:
// Xuất ra 3 trường trên nếu đúng định dạng, false nếu sai định dạng

package Bai5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;   
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Bai5{
    static String username;
    static String email;
    static String password;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        System.out.print("Enter email: ");
        email = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();
        
        if(check()){
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        }
        else{
            System.out.println("False");
        }
        
       
    }
    private static boolean checkPassword() {
        if ( password.isEmpty() ) {
            return false;
        }
        return password.matches("^[A-Z][a-zA-Z0-9]{7,}$");
    
        
    }
    private static boolean checkEmail() {
        // TODO Auto-generated method stub
        if(email.isEmpty()){
            return false;
        }
        return email.matches("^[a-z][a-z0-9]+@[a-z]+\\.[a-z]+$");

    }
    private static boolean checkUsername() {
        // TODO Auto-generated method stub
        if(username.isEmpty()){
            return false;
        }
        String[] words = username.split(" ");
        for (String word : words) {
            if (!checkWord(word)) {
                return false;
            }
        }

        
        return username.matches("^[A-Z][a-zA-Z ]{14,29}$");
    }
    private static boolean checkWord(String word) {
        // TODO Auto-generated method stub
        return word.matches("^[A-Z][a-z]*$");
    }
    static boolean check(){
        if(checkUsername() && checkEmail() && checkPassword()){
            return true;
        }
        return false;
    }
}
