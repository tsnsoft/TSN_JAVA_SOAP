package tsn.java.soap;

import java.io.FileInputStream;
import java.util.Properties;

// Используем библиотеки Apache CXF для реализации SOAP-клиента
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class StartClient {

    public static void main(String[] args) {
        try {
            Properties prop = new Properties(); // Переменная для доступа к файлу с настройкой
            prop.load(new FileInputStream("sca.config")); // Загружаем данные с файла настроек
            String serverEndpoint = prop.getProperty("server.endpoint"); // Считываем параметр с данных файла настроек
            //server.endpoint=http://localhost:8194/mysoap/test

            // ПОДКЛЮЧАЕМСЯ К SOAP-СЕРВЕРУ
            JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
            factoryBean.setServiceClass(ICommunicationWithClient.class);
            factoryBean.setAddress(serverEndpoint);
            ICommunicationWithClient soapService = (ICommunicationWithClient) factoryBean.create();

            // Вызов удаленного метода на сервере через web-технологию SOAP
            AnswerQE answer = soapService.quadraticEquation(-17, 14, 12);

            if (answer != null) {
                //System.out.println(answer.getX1());
                //System.out.println(answer.getX2());
                System.out.println(answer);
            } else {
                System.out.println("Нет решения!");
            }

        } catch (Exception e) {
            System.err.println("Ошибка клиента!");
        }
    }
}
