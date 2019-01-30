package tsn.java.soap;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class StartClient {

    public static void main(String[] args) {
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream("sca.config"));
            String serverEndpoint = prop.getProperty("server.endpoint");

            JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
            factoryBean.setServiceClass(ICommunicationWithClient.class);
            factoryBean.setAddress(serverEndpoint);

            ICommunicationWithClient webserviceSEI = (ICommunicationWithClient) factoryBean.create();

            AnswerQE otvet = webserviceSEI.quadraticEquation(-17, 14, 12);
            if (otvet != null) {
                System.out.println(otvet.getX1());
                System.out.println(otvet.getX2());
                System.out.println(otvet);
            } else {
                System.out.println("Нет решения!");
            }

        } catch (Exception e) {
            System.err.println("Ошибка клиента!");
        }
    }
}
