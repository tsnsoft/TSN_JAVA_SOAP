package tsn.java.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ICommunicationWithClient {

    @WebMethod
    public AnswerQE quadraticEquation(double a, double b, double c);
}
