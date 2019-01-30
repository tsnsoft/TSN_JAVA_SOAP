package tsn.java.soap;

import javax.xml.ws.Endpoint;
import java.io.FileInputStream;
import java.util.Properties;

public class StartServer {

    public static void main(String[] args) {
        final char exitCh = 'q';
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream("sca.config"));
            String serverEndpoint = prop.getProperty("server.endpoint");
            CommunicationWithClient communicationWithClient = new CommunicationWithClient();
            Endpoint.publish(serverEndpoint, communicationWithClient);
            System.out.println("Тестовый SOAP-сервер запущен успешно!");
            System.out.println("Endpoint: " + serverEndpoint);
            System.out.println("Введите " + exitCh + " и нажмите 'Enter' для остановки сервера ...");

            char ch;
            int code;
            while (-1 != (code = System.in.read())) {
                ch = (char) code;
                if (ch == exitCh) {
                    System.out.println("Сервер остановлен.");
                    System.out.println();
                    System.exit(0);
                }
            }

        } catch (Exception e) {
            System.err.println("Ошибка сервера!");
        }
    }
}
