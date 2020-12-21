import java.lang.Math;

public class GuessNumber {
    private int lowerLimit = 0;
    private int upperLimit = 100;
    private int secretNumber;

    //Игра
    public void play(Player player1, Player player2) {
        String resultPlayer1 = "";
        String resultPlayer2 = "";
        secretNumber = (int)(Math.random() * (upperLimit - lowerLimit)) + lowerLimit;

        //Цикл "Попытка = проверка" до первого попадания в секретное число.
        String victor = "";
        boolean endGame = false;
        int count = 0;
        while (true) {
            count++;

            resultPlayer1 = checkNumber(player1.guess());
            System.out.println("        " + resultPlayer1);
            if (resultPlayer1 == "Точно!") {
                victor = player1.getName();
                break;
            }
            
            resultPlayer2 = checkNumber(player2.guess());
            System.out.println("        " + resultPlayer2);
            if (resultPlayer2 == "Точно!") {
                victor = player2.getName();
                break;
                
            }
        }
        System.out.println(" Победил " + victor + ": " + count + " попыток");
    }

    //Проверка числа, предложенного игроком
    private String checkNumber(int tryNum) {
        if (tryNum < secretNumber) {
            return "Мало!";
        } else if (tryNum > secretNumber) {
            return "Много!";
        }else {
            return "Точно!";
        }
    }
}

