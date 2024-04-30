package mqtt;

import org.eclipse.paho.client.mqttv3.*;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        String broker       = "ssl://d70af6e855ad410989e841b1885813c4.s1.eu.hivemq.cloud:8883"; // URL và cổng của HiveMQ Cloud
        String clientId     = "ImageSubscriber";
        String topic        = "java/image"; // Chủ đề MQTT để nhận ảnh
        int qos             = 2;

        String username = "chucthien";
        String password = "12345678";

        try {
            MqttClient client = new MqttClient(broker, clientId);
            MqttConnectOptions options = new MqttConnectOptions();
            options.setUserName(username);
            options.setPassword(password.toCharArray());

            client.setCallback(new MqttCallback() {
                @Override
                public void connectionLost(Throwable cause) {
                    System.out.println("Connection lost: " + cause.getMessage());
                }

                @Override
                public void messageArrived(String topic, MqttMessage message) throws Exception {
                    // Nhận ảnh và lưu vào một tệp
                    saveImage(message.getPayload(), "received_image_" + System.currentTimeMillis() + ".jpg");
                }

                @Override
                public void deliveryComplete(IMqttDeliveryToken token) {
                    // Đã gửi thành công
                }
            });

            client.connect(options);
            client.subscribe(topic, qos);

            // Xuất thông báo khi kết nối thành công
            System.out.println("Connected to MQTT broker successfully!");

        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    private static void saveImage(byte[] imageData, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.write(imageData);
            fos.close();
            System.out.println("Image saved as: " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
