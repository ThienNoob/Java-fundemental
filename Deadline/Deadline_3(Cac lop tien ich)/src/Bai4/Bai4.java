// Bài 4( BufferedReader, FileReader)
// Sắp xếp tăng dần dãy số nguyên đọc từ FileReader và BufferedReader. File gồm N+1
// dòng, dòng thứ nhất là số N (chỉ N phần tử của dãy), N dòng tiếp theo là dãy cần sắp xếp
package Bai4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai4 {
    public static void main(String[] args) {
        // Path to the input file
        String filePath = "/c:/Users/chuct/OneDrive/Máy tính/Java/Java_Visual/GitCLone/SE330.O21-Java/Deadline/Deadline_3/src/Bai4_file";

        // Read the file

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            int n = Integer.parseInt(reader.readLine());
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(reader.readLine()));
            }
            reader.close();
            for (int i : list) {
                System.out.println(i);
            }
            Collections.sort(list);
            System.out.println("After sorting:");
            for (int i : list) {
                System.out.println(i);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
