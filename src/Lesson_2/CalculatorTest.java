import java.util.Scanner;

/*Класс CalculatorTest принимает с клавиатуры целое число, знак операции, целое число
 *и передает их для обработки в класс Calculator.
 *После вычисления результата запрашивает команду выхода или продолжения работы
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean firstEntry = true;
        
        //Рабочий цикл
        do {
            if (!firstEntry) {
                System.out.println(" Working again.");
            }

            //Ввод данных
            System.out.println("\n Enter first number (integer only!)");
            int a = scan.nextInt();
            System.out.println("\n Enter operation");
            char operation = scan.next().charAt(0);
            System.out.println("\n Enter second number (integer positive only!)");
            int b = scan.nextInt();
        
            //Вычисление
            calc.calculate(a, b, operation);
            firstEntry = false;

            //Запрос на выход
            System.out.println("\n Exit from work? (y = YES / any symbol = NO)");
        } while (!(scan.next().equalsIgnoreCase("y")));
        System.out.println(" Bye-bye!");
    }
}