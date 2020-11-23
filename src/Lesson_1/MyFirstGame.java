public class MyFirstGame {

    /*
     *Guessing the number from the range by binary search
     */
    public static void main(String[] args) {
        final int TARGET_NUMBER = 70;
        int startRange = 0;
        int endRange = 100;

        //Checking for incorrect initial conditions
        if ((startRange >= endRange)                                            
                | (TARGET_NUMBER < startRange)
                | (TARGET_NUMBER > endRange)) {   
            System.out.println("\n Некорректные условия задачи");
            return;                                                     //Exit of the work
        }

        int trialNumber = endRange;
        int iterationCounter = 0;
        while (trialNumber != TARGET_NUMBER) {
            iterationCounter++;

            //Loop protection
            if (iterationCounter > 10) {                        
                System.out.println("\n Извините, мы в зациклизме!");  
                break;                                                  //Emergency exit of the work
            }

            trialNumber = (int) ((startRange + (endRange - startRange) / 2));
            if (trialNumber < TARGET_NUMBER) {
                System.out.println(" " + trialNumber + " - Мало!");
                startRange = trialNumber;
            } else if(trialNumber > TARGET_NUMBER) {
                    System.out.println(" " + trialNumber + " - Много!");
                    endRange = trialNumber;
            } 
        }
        System.out.println( "\n Совпадение! - " + trialNumber + "\n"
                        + " Сделано итераций - " + iterationCounter);
    }
}