public class Cycle {

    public static void main(String[] args) {
        int i;

            //FOR. Print index for 0 to 20
        System.out.println("\n*** FOR ***");
        for (i = 0; i <= 20; i++) {
            System.out.println(i);
        }

            //WHILE. Print pair numbers for 6 to -6
        System.out.println("\n*** WHILE ***");
        i = 6;
        while (i >= -6) {
            System.out.println(i);
            i -= 2;
        }

            //DO - WHILE. Calculating the sum of odd numbers for start to end
            //Немного доработал алгоритм,
            //чтобы он принимал любые целочисленные границы.
        System.out.println("\n*** DO WHILE ***");
        int start = 10;
        int end = 20;
        int sum;

        if (start % 2 == 0) {
            start++;
        }
        if (end % 2 == 0) {
            end--;
        }
        i = start;   //Технически, одна переменная лишняя. Но мне так показалось нагляднее.
        sum = i;

        do {
            i += 2;
            sum = sum + i;
        } while (i < end);

        System.out.println(" sum = " + sum);
    }
}