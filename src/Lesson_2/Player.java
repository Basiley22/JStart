import java.util.Scanner;

public class Player {
    private String name;
    private Scanner scan = new Scanner(System.in);

    //Конструктор. Задает имя игрока
    Player(int numPlayer) {
        System.out.print("\n Дай имя игроку №" + numPlayer + ": ");
        name = scan.nextLine();
    }

    public String getName() {
        return name;
    }

    //Ввод числа - попыткa угадать
    public int guess() {
        System.out.print("\n " + name + ", введи число: ");
        return scan.nextInt();
    }
}