package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();
    public double add(double number1, double number2) {
        logger.debug("Called with: " + number1 + " and " + number2);

        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        logger.debug("Called with: " + number1 + " and " + number2);
        return number1 - number2;

    }

    public double divide(double number1, double number2) {
        logger.debug("Called with: " + number1 + " and " + number2);
        if (number2 != 0) {
            return number1 / number2;
        } else {
            logger.error("Called with: " + number1 + " and " + number2);
            return -1;
        }
    }


    public double multiply(double number1, double number2) {
        logger.debug("Called with: " + number1 + " and " + number2);


        return number1 * number2;
    }




    public int factorial(int n) {
        logger.debug("Called with:" + n );
        if (n < 0) {
            return -1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}


