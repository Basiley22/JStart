import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumber game = new GuessNumber();
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        

        //Игра, возможно с повтором
        boolean repeatGame;
        do {
            repeatGame = false;

            //Собственно игра
            System.out.println();
            game.play(player1, player2);

            //Запрос команды на повтор или прекращение игры
            char commandRepeat;
            do {
                System.out.print("\n Играть еще раз? (y/n): ");
                commandRepeat = scan.nextLine().charAt(0);
                switch (commandRepeat) {
                    case 'y':
                        repeatGame = true;
                        break;
                    case 'n':
                        System.out.println("\n Бай-Бай!");
                        break;
                    default:
                        System.out.println(" Команда непонятна");
                }
            } while (commandRepeat != 'n' && commandRepeat != 'y');
        } while (repeatGame);
    }
}
