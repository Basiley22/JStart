public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber testGame = new GuessNumber();
        Player p1 = new Player("Irenka", "manual");
        Player p2 = new Player("Lucky", "autoBinary");

        //Игра до победы
        boolean p1Finish = false;
        boolean p2Finish = false;
        int count = 0;
        while (!p1Finish && !p2Finish) {
            count++;
            p1Finish = p1.guess(testGame);
            p2Finish = p2.guess(testGame);
        }

        //Определить кто победил
        if (p1Finish && p2Finish) {
            System.out.println(" Ничья: " + count + " итераций");
        } else if (p1Finish) {
            System.out.println(" Победил " + p1.getName() + ": " + count + " итераций");
        } else if (p2Finish) {
            System.out.println(" Победил " + p2.getName() + ": " + count + " итераций");
        }else {
            System.out.println(" Ошибка определения победителя");
        }
    }
}
