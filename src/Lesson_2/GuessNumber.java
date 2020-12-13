import java.lang.Math;

/*Создает случайное число secretNumber в диапазоне от lowerLimit включительно до upperLimit исключительно.
 *Принимает от игрока число playNumber, сравнивает его с secretNumber и отсылает сообщение
 */
public class GuessNumber {
    private int lowerLimit = 0;
    private int upperLimit = 100;
    private int secretNumber;

    //Конструктор
    GuessNumber() {
        secretNumber = (int)(Math.random() * (upperLimit - lowerLimit)) + lowerLimit;
    }
    
    //Геттеры и сеттеры
    public void setLowerLimit(int lowLim) {
        this.lowerLimit = lowLim;
    }

    public int getLowerLimit() {
        return this.lowerLimit;
    }

    public void setUpperLimit(int uppLim) {
        this.upperLimit = uppLim;
    }

    public int getUpperLimit() {
        return this.upperLimit;
    }

    //Проверка числа игрока на равенство секретному
    public String checkNumber(int playNum) {
        if (playNum < secretNumber) {
            return "Too small!";
        } else if (playNum > secretNumber) {
            return "Too big!";
        }else {
            return "Concided!";
        }
    }
}

