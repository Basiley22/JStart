import java.util.Scanner;

/*Класс CalculatorTest принимает с клавиатуры целое число, знак операции, целое число
 *и передает их для обработки в класс Calculator.
 *После вычисления результата запрашивает команду выхода или продолжения работы
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        //Рабочий цикл
        boolean exit = false;
        do {
            
            //Ввод данных
            System.out.println("\n Enter first number (integer only!)");
            int a = scan.nextInt();
            System.out.println("\n Enter operation");
            char operation = scan.next().charAt(0);
            System.out.println("\n Enter second number (integer positive only!)");
            int b = scan.nextInt();
        
            //Вычисление
            calc.calculate(a, b, operation);

            //Запрос на выход
            scan.nextLine();
            boolean correctAnswer;
            do {
                System.out.println("\n Exit from work? (y = YES / n = NO)");
                String answer = scan.nextLine();
                if (answer.equals("y")) {
                    correctAnswer = true;
                    exit = true;
                    System.out.print(" Bye-bye!");
                } else if (answer.equals("n")) {
                    correctAnswer = true;
                    exit = false;
                    System.out.println(" Working again!");
                } else {
                    correctAnswer = false;
                    System.out.print(" The answer is not clear.");
                }
            } while (!correctAnswer);
        } while (!exit);
    }
}