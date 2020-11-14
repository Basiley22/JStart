public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 30;
        if (age > 20) {
            System.out.println("Возраст больше 20");
        }

        boolean maleGender = true;
        if (maleGender) {
            System.out.println("Мужской");
        }

        if (!maleGender) {
            System.out.println("Не мужской");
        }

        double haight = 1.9;
        if (haight < 1.8) {
            System.out.println("Рост средний или ниже");
        }
        else {
            System.out.println("Рост высокий");
        }

        char nameFirstLetter = 'M';
        if (nameFirstLetter == 'M') {
            System.out.println("Чувак на букву М");
        }
        else if (nameFirstLetter == 'I') {
            System.out.println("Чувак на букву I");
        }
        else {
            System.out.println("Неизвестный чувак");
        }
    }
}