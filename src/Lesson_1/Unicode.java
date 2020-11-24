public class Unicode {
    /*
     *Вывод символов Юникода в десятичном виде из указанного диапазона
     */
    public static void main(String[] args) {
        int startRange = 33;
        int endRange = 127;
        int columnsNumber = 15;
        char simbol = (char)startRange;
        while (simbol <= endRange) {
            System.out.println();
            for (int i = 1; i <= columnsNumber; i++) {
                if (simbol > endRange) {
                    break;
                }
                System.out.print("  " + simbol);
                simbol++;
            }
        }
    }
}       
        
