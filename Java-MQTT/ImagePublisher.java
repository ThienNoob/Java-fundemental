package mqtt;


import org.eclipse.paho.client.mqttv3.*;
import java.io.File;
import java.io.FileInputStream;

public class ImagePublisher {

    public static void main(String[] args) {
        String broker       = "ssl://d70af6e855ad410989e841b1885813c4.s1.eu.hivemq.cloud:8883"; // URL và cổng của HiveMQ Cloud
        String clientId     = "ImagePublisher";
        String topic        = "java/image"; // Chủ đề MQTT để gửi ảnh
        int qos             = 2;

        String username = "chucthien";
        String password = "12345678";

        try {
            MqttClient client = new MqttClient(broker, clientId);
            MqttConnectOptions options = new MqttConnectOptions();
            options.setUserName(username);
            options.setPassword(password.toCharArray());

            client.connect(options);

            // Đường dẫn của tệp ảnh cần gửi
            String imagePath = "C:\\Users\\chuct\\OneDrive\\Máy tính\\Java\\SamplePNGImage_100kbmb.png";

            // Gửi ảnh
            sendImage(client, topic, qos, imagePath);

            // Ngắt kết nối
            client.disconnect();
            System.out.println("Image sent successfully and disconnected from MQTT broker!");

        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    private static void sendImage(MqttClient client, String topic, int qos, String imagePath) {
        try {
            File imageFile = new File(imagePath);
            FileInputStream fis = new FileInputStream(imageFile);
            byte[] imageData = new byte[(int) imageFile.length()];
            fis.read(imageData);
            fis.close();

            MqttMessage message = new MqttMessage(imageData);
            message.setQos(qos);

            client.publish(topic, message);

            System.out.println("Image sent successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
