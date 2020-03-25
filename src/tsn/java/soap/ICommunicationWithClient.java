package tsn.java.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

// Указываем специальную аннотацию, что интерфейс будет работать в web-технологии SOAP
@WebService
public interface ICommunicationWithClient {

    // Указываем специальную аннотацию, что метод будет работать в web-технологии SOAP
    @WebMethod
    public AnswerQE quadraticEquation(double a, double b, double c);
}
