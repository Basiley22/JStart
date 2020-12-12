import java.lang.Math;

/*Создает случайное число secretNumber в диапазоне от lowerLimit включительно до upperLimit исключительно.
 *Принимает пробное число playNumber, сравнивает его с secretNumber и отсылает сообщение
 */
public class GuessNumber {
    private int lowerLimit = 0;
    private int upperLimit = 100;
    private int secretNumber;

    //Конструктор
    GuessNumber() {
        generSecret();
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

    public int getSecretNumber() {
        return secretNumber;
    }

    //Генерация секретного числа
    public void generSecret() {
        secretNumber = (int)(Math.random() * (upperLimit - lowerLimit)) + lowerLimit;
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

