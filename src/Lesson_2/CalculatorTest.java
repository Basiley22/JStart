import java.util.Scanner;

/*Класс CalculatorTest принимает с клавиатуры целое число, знак операции, целое число
 *и передает их для обработки в класс Calculator.
 *После вычисления результата запрашивает команду выхода или продолжения работы
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        int a;
        int b;
        char operation;
        
        //Рабочий цикл
        do {

            //Ввод данных
            System.out.println("\n Enter first number (integer only!)");
            a = scan.nextInt();
            System.out.println("\n Enter operation");
            operation = scan.next().charAt(0);
            System.out.println("\n Enter second number (integer positive only!)");
            b = scan.nextInt();
        
            //Вычисление
            calc.calculation(a, b, operation);

            //Запрос на выход
            System.out.println("\n Exit from work? (y = YES / any symbol = NO)");
            if (scan.next().equalsIgnoreCase("y")) {
                System.out.println(" Bye-bye!");
                break;
            } else {
                System.out.println(" Working again.");
            }
        } while (true);
    }
}