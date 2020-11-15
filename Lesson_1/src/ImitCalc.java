public class ImitCalc {

    /*
     *Арифметические действия над двумя целыми положительными числам
     *Предусмотрены операции: '+', '-', '*', '/', '^', '%'.
     */
    public static void main(String[] args) {
        int firstOperand = 4;
        int secOperand = 3;
        char signOp = '&';

        if (signOp == '+') {
            System.out.println(" Sum: " + (firstOperand + secOperand));

        } else if (signOp == '-') {
            System.out.println(" Difference: " + (firstOperand - secOperand));

        } else if (signOp == '*') {
            System.out.println(" Product: " + (firstOperand * secOperand));

        } else if (signOp == '/') {
            System.out.println(" Quotient : " + ((double) firstOperand / (double) secOperand));

        } else if (signOp == '^') {
            int result = 1;

            for (int i = 1; i <= secOperand; i++) {
                result *= firstOperand;
            }
            System.out.println(" Power: " + result);

        } else if (signOp == '%') {                       //Mod division
            System.out.println(" Mod division: " + (firstOperand % secOperand));

        } else {
            System.out.println(" ! Invalid sign of operation: \'" + signOp +"\' !");
        }

    }
}