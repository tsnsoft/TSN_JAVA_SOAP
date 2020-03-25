package tsn.java.soap;

import javax.xml.ws.Endpoint;
import java.io.FileInputStream;
import java.util.Properties;

public class StartServer {

    public static void main(String[] args) {
        final char exitCh = 'q';
        try {
            Properties prop = new Properties(); // Переменная для доступа к файлу с настройкой
            prop.load(new FileInputStream("sca.config")); // Загружаем данные с файла настроек
            String serverEndpoint = prop.getProperty("server.endpoint"); // Считываем параметр с данных файла настроек

            // АКТИВИРУЕМ WEB-СЕРВИС SOAP
            Endpoint ep = Endpoint.create(new CommunicationWithClient());
            ep.publish(serverEndpoint);

            System.out.println("SOAP-сервер запущен успешно!");
            System.out.println("Адрес сервера: " + serverEndpoint);
            System.out.println("Введите " + exitCh + " и нажмите 'Enter' для остановки сервера ...");

            // Ждать, пока пользователь не введет символ exitCh, после выход из программы (с авто выключением сервера)
            char ch;  int code;
            while (-1 != (code = System.in.read())) {
                ch = (char) code;
                if (ch == exitCh) {
                    ep.stop(); // ОСТАНОВКА SOAP-СЕРВЕРА
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
