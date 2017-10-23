import com.epam.lab.service.soap.CalcServiceImpl;
import com.epam.lab.service.soap.CalcServiceImplService;

/**
 *
 */
public class Main {

    // wsimport -keep -verbose -s ./src/main/java/ -d ./target/ http://localhost:8090/calc?wsdl

    public static void main(String[] args) {
        CalcServiceImpl calcService = new CalcServiceImplService().getCalcServiceImplPort();
        System.out.println(calcService.plus(2, 2222));
        System.out.println(calcService.minus(5, 2));
        System.out.println(calcService.division(2, 22));
        System.out.println(calcService.multiple(2, 10.1111));
        System.out.println(calcService.percent(5, 2));
    }
}
