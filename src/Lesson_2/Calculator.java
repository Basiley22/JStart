public class Calculator {
    /*
     *Арифметические действия над двумя целыми положительными числами (переменные "a" и "b")
     *Предусмотрены операции: '+', '-', '*', '/', '^', '%'.
     */
    public void calculate(int a, int b, char operation) {
        switch (operation) {
            case '+':
                System.out.println(" Sum: " + (a + b));
                break;
            case '-':
                System.out.println(" Difference: " + (a - b));
                break;
            case '*':
                System.out.println(" Product: " + (a * b));
                break;
            case '/':
                System.out.println(" Quotient : " + ((float) a / (float) b));
                break;
            case '^':
                int result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                System.out.println(" Power: " + result);
                break;
            case '%':
                System.out.println(" Mod division: " + (a % b));
                break;
            default:
                System.out.println(" Invalid sign of operation. Computation failed!");
        }
    }
}