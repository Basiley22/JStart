public class ImitCalc {

    /*
     *Арифметические действия над двумя целыми положительными числам
     *Предусмотрены операции: '+', '-', '*', '/', '^', '%'.
     */
    public static void main(String[] args) {
        int firstOperand = 4;
        int secOperand = 3;
        double result;
        char signOp = '&';

        if (signOp == '+') {                              //Addition
            result = firstOperand + secOperand;
            System.out.println(" Sum: " + result);
        } else if (signOp == '-') {                       //Difference
            result = firstOperand - secOperand;
            System.out.println(" Difference: " + result);
        } else if (signOp == '*') {                       //Multiply
            result = firstOperand * secOperand;
            System.out.println(" Product: " + result);
        } else if (signOp == '/') {                       // Division
            result = ((double) firstOperand / (double) secOperand);
            System.out.println(" Quotient : " + result);
        } else if (signOp == '^') {                       //Power
            result = 1;

            for (int i = 1; i <= secOperand; i++) {
                result *= firstOperand;
            }
            System.out.println(" Power: " + result);

        } else if (signOp == '%') {                       //Mod division
            result = firstOperand % secOperand;
            System.out.println(" Mod division: " + result);
        } else {
            System.out.println(" ! Invalid sign of operation: \'" + signOp +"\' !");
        }

    }
}