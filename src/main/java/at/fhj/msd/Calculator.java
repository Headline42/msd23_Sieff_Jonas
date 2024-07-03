package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    /**
     *
     * @param number1 first number to be added
     * @param number2 second number to be added
     * @return Added value of both numbers
     */
    public double add(double number1, double number2) {
        logger.debug("Called with: " + number1 + " and " + number2);

        return number1 + number2;
    }

    /**
     *
     * @param number1 first number to subtract from
     * @param number2 second number to be subtracted
     * @return Subtracted value of number2 from number1
     */
    public double minus(double number1, double number2) {
        logger.debug("Called with: " + number1 + " and " + number2);
        return number1 - number2;

    }

    /**
     *
     * @param number1 dividend
     * @param number2 divisor
     * @return Divided value of number1 by number2 or -1 if number2 is 0
     */
    public double divide(double number1, double number2) {
        logger.debug("Called with: " + number1 + " and " + number2);
        if (number2 != 0) {
            return number1 / number2;
        } else {
            logger.error("Called with: " + number1 + " and " + number2);
            return -1;
        }
    }

    /**
     *
     * @param number1 first number to be multiplied
     * @param number2 second number to be multiplied
     * @return Multiplied value of number1 and number2
     */
    public double multiply(double number1, double number2) {
        logger.debug("Called with: " + number1 + " and " + number2);


        return number1 * number2;
    }

    /**
     *
     * @param n the number to calculate the factorial of
     * @return Factorial of n or -1 if n is negative
     */
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