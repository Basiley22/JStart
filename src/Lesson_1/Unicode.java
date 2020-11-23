public class Unicode {
	/*
	 *Вывод символов Юникода в десятичном виде из указанного диапазона
	 */
    public static void main(String[] args) {
    	short startRange = 33;
    	short endRange = 127;
        int columnsNumber = 15;
    	short codeSimbol = startRange;
    	while (codeSimbol <= endRange) {
    		System.out.println();
    		for ( byte i = 1; i <= columnsNumber; i++) {
    			if (codeSimbol > endRange) {
    				break;
    			}
				System.out.print("  " + (char)codeSimbol);
				codeSimbol++;
    		}
    	}
    }
}    	
    	
