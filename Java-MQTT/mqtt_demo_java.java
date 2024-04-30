package mqtt;

import org.eclipse.paho.client.mqttv3.*;
import java.io.FileOutputStream;

public class mqtt_demo_java {

    public static void main(String[] args) {
        String broker       = "ssl://d70af6e855ad410989e841b1885813c4.s1.eu.hivemq.cloud:8883"; // URL và cổng của HiveMQ Cloud
        String clientId     = "TemperatureHumiditySubscriber";
        String topic        = "esp32/dht11"; // Chủ đề MQTT để nhận thông tin về nhiệt độ và độ ẩm
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
                    // Nhận dữ liệu về nhiệt độ và độ ẩm và xử lý
                    processTemperatureHumidityData(message.getPayload());
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

    private static void processTemperatureHumidityData(byte[] data) {
        // Xử lý dữ liệu về nhiệt độ và độ ẩm ở đây
        // Ví dụ: giải mã dữ liệu và hiển thị thông tin
        String dataString = new String(data);
        System.out.println("Received temperature and humidity data: " + dataString);
    }
}
