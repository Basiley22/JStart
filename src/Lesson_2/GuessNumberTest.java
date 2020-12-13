public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber testGame = new GuessNumber();
        Player player1 = new Player("Crazy", "manual");
        Player player2 = new Player("Lucky", "autoBinary");

        //Игра до победы
        boolean player1Finish = false;
        boolean player2Finish = false;
        int count = 0;
        while (!player1Finish && !player2Finish) {
            count++;
            player1Finish = player1.guess(testGame);
            player2Finish = player2.guess(testGame);
        }

        //Выяснение кому досталась победа
        if (player1Finish && player2Finish) {
            System.out.println(" Ничья: " + count + " попыток");
        } else if (player1Finish) {
            System.out.println(" Победил " + player1.getName() + ": " + count + " попыток");
        } else if (player2Finish) {
            System.out.println(" Победил " + player2.getName() + ": " + count + " попыток");
        }else {
            System.out.println(" Ошибка определения победителя");
        }
    }
}
