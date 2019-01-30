package tsn.java.soap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)

public class CommunicationWithClient implements ICommunicationWithClient {

    @Override
    public AnswerQE quadraticEquation(double a, double b, double c) {
        double x1;
        double x2;
        double desc;
        try {
            desc = Math.pow(b, 2) - 4 * a * c;
            x1 = -b + Math.sqrt(desc);
            x2 = -b - Math.sqrt(desc);
            if ((Double.isNaN(x1)) || (Double.isInfinite(x1)) || (Double.isNaN(x2)) || (Double.isInfinite(x2))) {
                throw new Exception();
            }
            AnswerQE otvet = new AnswerQE();
            otvet.setX1(x1);
            otvet.setX2(x2);
            return otvet;
        } catch (Exception e) {
            return null;
        }
    }

}
