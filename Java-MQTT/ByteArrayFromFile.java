package mqtt;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayFromFile {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\chuct\\OneDrive\\Máy tính\\Java\\outputFile.bin"; // replace with your input file path

        try {
            // Open file for reading
            File file = new File(inputFilePath);
            FileInputStream fis = new FileInputStream(file);

            // Read each byte from file and print to console
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                for (int i = 0; i < bytesRead; i++) {
                    System.out.print(buffer[i] + " ");
                }
            }

            // Close input stream
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}