// Bài 3 (Date SimpleDateFormat, GregorianCalendar)
// Viết chương trình thực thi các yêu cầu sau:
// a. Kiểm tra năm nay có phải năm nhuận hay không, ngày đầu tiên của năm vào thứ
// mấy trong tuần?.
// b. In ngày hiện tại theo các định dạng khác nhau.
// c. Nhập vào 1 ngày bất kỳ kiểm tra xem ngày đó là thứ mấy trong tuần.
// d.Lấy ngày đầu tiên và ngày cuối cùng của một tháng từ 1 ngày người dùng nhập vào.
package Bai3;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        a();
        b();
        c();
        d();
    }

    static void a() {
        LocalDate date = LocalDate.now();
        System.out.println("a) ");
        System.out.println("Current day is: " + date);
        System.out.println("Is leap year: " + date.isLeapYear());
        System.out.println("First day of the year is: " + date.withDayOfYear(1).getDayOfWeek());

    }

    static void b() {
        LocalDate date = LocalDate.now();
        System.out.println("b) ");
        System.out.println("yyyy-MM-dd: " + date);
        System.out.println("dd/MM/yyyy: " + date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("dd/MM/yyyy: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    static void c() {
        System.out.println("c) ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDay = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDay);
        System.out.println("Day of week: " + date.getDayOfWeek());
    }

    static void d() {
        System.out.println("d) ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDay = scanner.nextLine();
        scanner.close();
        LocalDate date = LocalDate.parse(inputDay);
        System.out.println(
                "First day of the month: " + date.withDayOfMonth(1) + " " + date.withDayOfMonth(1).getDayOfWeek());
        System.out.println("Last day of the month: " + date.withDayOfMonth(date.lengthOfMonth()) + " "
                + date.withDayOfMonth(date.lengthOfMonth()).getDayOfWeek());
    }
}


