public class MyFirstGame {

    /*
     *Guessing the number from the range by binary search
     */
    public static void main(String[] args) {
        int targetNumber = 99;
        int startRange = 0;
        int endRange = 100;
        int limitIteration = 10;

        //Checking for incorrect initial conditions
        if ((startRange >= endRange)                                            
                || (targetNumber < startRange)
                || (targetNumber > endRange)) {   
            System.out.println("\n Некорректные условия задачи");
            return;                                                     //Exit of the work
        }


        int playNumber = endRange;
        int counter = 0;
        while (playNumber != targetNumber) {
            counter++;

            //Loop protection
            if (counter > limitIteration) {                        
                System.out.println("\n Извините, мы в зациклизме!");  
                break;                                                  //Emergency exit of the work
            }

            playNumber = (int) ((startRange + (endRange - startRange) / 2));
            if (playNumber < targetNumber) {
                System.out.println(" " + playNumber + " - Мало!");
                startRange = playNumber;
            } else if(playNumber > targetNumber) {
                    System.out.println(" " + playNumber + " - Много!");
                    endRange = playNumber;
            } 
        }
        System.out.println( "\n Совпадение! - " + playNumber + "\n"
                        + " Сделано итераций - " + counter);
    }
}