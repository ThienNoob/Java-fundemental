// 2. Viết chương trình tạo lớp Time biểu diễn thời gian gồm: giờ, phút,
// giây và các phương thức: khởi tạo, lấy và thiết lập giá trị các
// thuộc tính, tăng giây lên 1 đơn vị, so sánh 2 đối tượng thời gian.
// Trong hàm main, nhập vào 2 thời gian, xuất ra thời gian lớn hơn
// và gọi hàm tăng thời gian (thứ nhất) mỗi giây.


import java.util.Scanner;

class Time {
    private int hour, minute, second;

    public Time() {
        hour = minute = second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void inputTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input hour, minutes, second: ");
        while (true) {
            hour = scanner.nextInt();
            if (hour > 23) {
                System.out.println("Hour must not be greater than 23, input again: ");
            } else
                break;
        }
        while (true) {
            minute = scanner.nextInt();
            if (minute > 59) {
                System.out.println("Minute must not be greater than 59, input again: ");
            } else
                break;
        }
        while (true) {
            second = scanner.nextInt();
            if (second > 59) {
                System.out.println("Second must not be greater than 59, input again: ");
            } else
                break;
        }

    }

    public void displayTime() {
        System.out.println(hour + " hours " + minute + " minutes " + second + " seconds");
    }

    public void increaseSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }

        }
    }

    public boolean compare(Time aTime) {
        if (hour > aTime.hour)
            return true;
        if (hour == aTime.hour && minute > aTime.minute)
            return true;
        if (hour == aTime.hour && minute == aTime.minute && second > aTime.second)
            return true;
        return false;
    }

}

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Enter the first Time: ");
        Time time1 = new Time();
        time1.inputTime();

        System.out.println("Enter the second Time: ");
        Time time2 = new Time();
        time2.inputTime();

        System.out.print("The greater time is: ");
        if (time1.compare(time2))
            time1.displayTime();
        else
            time2.displayTime();

        System.out.println("The first Time is: ");
        for (int i = 0; i < 10; i++) {
            time1.displayTime();
            time1.increaseSecond();
            
        }

    }
}
