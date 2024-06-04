package at.fhj.msd;

public class CalculatorTest {

        public  double add(double number1, double number2) {

            return number1 + number2;
        }

        public  double minus(double number1, double number2) {
            return number1 - number2;

        }
        public double divide(double number1, double number2) {

            if(number2 != 0) {
                return number1 / number2;
            }else {

                return -1;
            }
        }


        public double multiply(double number1, double number2){


            return number1 * number2;
        }


    }



