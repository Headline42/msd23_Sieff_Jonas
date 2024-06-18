package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    // Creating a logger
    private static Logger logger = LogManager.getLogger();

    // Log messages
    public static void main(String[] args) {

        Calculator calc = new Calculator();

       calc.add(1,1);
       calc.minus(1,1);
       calc.divide(1,0);
       calc.multiply(1,1);

        System.out.println("Sieff Jonas");
    }
}