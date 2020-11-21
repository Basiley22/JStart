public class Calculator {

    /*
     *Арифметические действия над двумя целыми положительными числам
     *Предусмотрены операции: '+', '-', '*', '/', '^', '%'.
     */
    public static void main(String[] args) {
        //Начальные условия: два операнда и знак операции.
        int a = 4;
        int b = 3;
        char operation = '#';
        //Выполнение операций
        if (operation == '+') {
            System.out.println(" Sum: " + (a + b));
        } else if (operation == '-') {
            System.out.println(" Difference: " + (a - b));
        } else if (operation == '*') {
            System.out.println(" Product: " + (a * b));
        } else if (operation == '/') {
            System.out.println(" Quotient : " + ((float) a / (float) b));
        } else if (operation == '^') {
            int result = 1;

            for (int i = 1; i <= b; i++) {
                result *= a;
            }
            System.out.println(" Power: " + result);
        } else if (operation == '%') {
            System.out.println(" Mod division: " + (a % b));
        } else {
            System.out.println(" ! Invalid sign of operation: \'" + operation +"\' !");
        }
    }
}