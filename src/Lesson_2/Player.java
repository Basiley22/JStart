import java.util.Scanner;

public class Player {
    public boolean finish;
    private String name;
    private String playMethod;
    private String tryResult = "First try";
    private int lowLim = -1;
    private int uppLim = -1;
    private int tryNumber = -1;
    private int tryCount;
    private Scanner scan = new Scanner(System.in);

    //Конструктор
    Player(String name, String playMethod) {
        this.name = name;
        this.playMethod = playMethod;
    }

    public String getName() {
        return name;
    }

    public boolean guess(GuessNumber game) {
        if (++tryCount == 1) {
            lowLim = game.getLowerLimit();
            uppLim = game.getUpperLimit();
        }
        
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
                tryNumber = (int) ((lowLim + (uppLim - lowLim) / 2));
                System.out.println(name + " enter " + tryNumber);
                tryResult = game.checkNumber(tryNumber);

                if (tryResult == "Too small!") {
                    lowLim = tryNumber;
                    return finish = false;
                } else if (tryResult == "Too big!") {
                    uppLim = tryNumber;
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