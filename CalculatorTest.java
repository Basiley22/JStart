import java.util.Scanner;

/*Класс CalculatorTest принимает с клавиатуры два целых числа и знак операции
 *в обратной польской нотации (число, число, знак) и передает их для обработки в класс Calculator.
 *Числа проверяются на принадлежность к множеству целых, 
 *знак операции проверяется на принадлежность к множеству: { +, -, *, /, ^, % }.
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        int a;
        int b;
        String operation;
        boolean exit = false;
        int i = 0;
        
        //Рабочий цикл
        do {
            // i++;
            // if (i > 3) break;
            //Ввод первого числа
            System.out.println(" \nEnter first number");
            if (scan.hasNextInt()) {
                a = scan.nextInt();
            }
            else {
                System.out.println(" Incorrect input a!");
                scan.nextLine();
                continue;
            }

            //Ввод второго числа
            System.out.println(" \nEnter second number");
            if (scan.hasNextInt()) {
                b = scan.nextInt();
            } else {
                System.out.println(" Incorrect input b!");
                scan.nextLine();
                continue;
            }
        
            //Ввод знака операции
            System.out.println(" \nEnter operation");
            operation = scan.next();
            if (!operation.equals("+") && !operation.equals("-")
                    && !operation.equals("*") && !operation.equals("/")
                    && !operation.equals("^") && !operation.equals("%")) {
                System.out.println(" \nInvalid Operation");
                continue;
            }

            //Вычисление
            calc.calculation(a, b, operation);

            //Запрос на выход из работы
            String answerToExit;
            System.out.println(" \nExit from work? (y = YES / any symbol = NO)");
            answerToExit = scan.next();
            if (answerToExit.equalsIgnoreCase("y")) {
                exit = true;
                System.out.println(" answer YES = " + answerToExit + " exit YES = " + exit);
            } else {
                exit = false;
                System.out.println(" answer NO = " + answerToExit + " exit NO = " + exit);
            }
        } while (!exit);
    }
}