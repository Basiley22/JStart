public class Cycle {

    public static void main(String[] args) {
        //FOR. Print index for 0 to 20
        System.out.println("\n*** FOR ***");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        //WHILE. Print pair numbers for 6 to -6
        System.out.println("\n*** WHILE ***");
        int counter = 6;
        while (counter >= -6) {
            System.out.println(counter);
            counter -= 2;
        }

        //DO - WHILE. Calculating the sum of odd numbers for start to end
        //Немного доработал алгоритм,
        //чтобы он принимал любые целочисленные границы.
        System.out.println("\n*** DO WHILE ***");
        int startRange = 10;
        int endRange = 20;
        int sum = 0;
        int i;

        if (startRange % 2 == 0) {
            startRange++;
        }
        if (endRange % 2 == 0) {
            endRange--;
        }
        i = startRange;   //Технически, одна переменная лишняя. Но мне так показалось нагляднее.

        do {
            sum += i;
            i += 2;
        } while (i <= endRange);

        System.out.println(" sum = " + sum);
    }
}