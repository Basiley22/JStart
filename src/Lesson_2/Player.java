import java.util.Scanner;

public class Player {
    private String name;
    private String playMethod;
    private Scanner scan = new Scanner(System.in);

    //Конструктор. Задает имя игрока и метод его игры
    Player(String name, String playMethod) {
        this.name = name;
        this.playMethod = playMethod;
    }

    public String getName() {
        return name;
    }

    //Игра
    private String tryResult = "First try";
    private int lowLimit;
    private int uppLimit;
    private int tryNumber = -1;
    private int tryCount;
    public boolean finish;

    public boolean guess(GuessNumber game) {

        //Инициализация игрового диапазона
        if (++tryCount == 1) {
            lowLimit = game.getLowerLimit();
            uppLimit = game.getUpperLimit();
        }
        
        //Предложение ввести число с указанием ввода и результата предыдущей попытки
        System.out.println("\n " + name + ", enter a number");
        System.out.println(" Last try: " + tryNumber + ". Result of a last try: " + tryResult);

        if (playMethod == "manual") {

            //Управление с клавиатуры
            tryNumber = scan.nextInt();
            tryResult = game.checkNumber(tryNumber);
            System.out.println(tryResult);
            if (tryResult == "Concided!") {
                System.out.println(" Yes! " + tryNumber + " !!!");
                return finish = true;
            } else {
                return finish = false;
            }
        } else if (playMethod == "autoBinary") {

            //Автоматический бинарный поиск
            tryNumber = (int) ((lowLimit + (uppLimit - lowLimit) / 2));
            System.out.println(name + " enter " + tryNumber);
            tryResult = game.checkNumber(tryNumber);

            if (tryResult == "Too small!") {
                lowLimit = tryNumber;
                return finish = false;
            } else if (tryResult == "Too big!") {
                uppLimit = tryNumber;
                return finish = false;
            } else if (tryResult == "Concided!") {
                System.out.println(" Yes! " + tryNumber + " !!!");
                return finish = true;
            } else {

                //Невозможный вариант
                System.out.println("Непредусмотренный результат game.checkNumber");
                return finish = false;
            }
        }
        return false; // Не понятно, для чего этот оператор. Без него возникает ошибка: "missing return statement"
    }
}