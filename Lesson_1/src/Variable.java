public class Variable {

    public static void main(String[] args) {
        byte numberCoresCpu = 2;                    //Количество ядер процессора
        short ramSizeGb = 8;                        //Объем оперативной памяти (ГБ)
        int windowsVersion = 1909;
        long capasityDiskByte = 239_155_015_680L;   //Емкость диска (Б)
        float frequencyCPU = 1.8F;                  //Частота процессора (ГГц)
        double userPassword = 0.112_358_132_134;    //Пароль на вход
        char firstLetterName = 'B';                 //Первый символ логина
        boolean taskCompleted = true;               //Требуемое состояние задачи

        System.out.println("\n  Количество ядер:    " + numberCoresCpu
                         + "\n  Оперативная память: " + ramSizeGb
                         + "\n  Версия виндовс:     " + windowsVersion
                         + "\n  Емкость диска:      " + capasityDiskByte
                         + "\n  Частота процессора: " + frequencyCPU
                         + "\n  Секретный пароль:   " + userPassword
                         + "\n  Логин начинается с: " + firstLetterName
                         + "\n  Это решение верно?  " + taskCompleted);
    }
}