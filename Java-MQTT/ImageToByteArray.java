package mqtt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageToByteArray {
    public static void main(String[] args) {
        String imagePath = "C:\\Users\\chuct\\OneDrive\\Máy tính\\Java\\Sample-jpg-image-50kb.jpg"; // replace with your image file path
        String outputFilePath = "C:\\Users\\chuct\\OneDrive\\Máy tính\\Java\\outputFile.bin"; // replace with your output file path

        try {
            // Read image file
            File file = new File(imagePath);
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();

            // Read each byte from file and write to ByteArrayOutputStream
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            // Convert ByteArrayOutputStream to byte array
            byte[] imageData = bos.toByteArray();

            // Write byte array to file
            FileOutputStream fos = new FileOutputStream(outputFilePath);
            fos.write(imageData);

            // Close input and output streams
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}