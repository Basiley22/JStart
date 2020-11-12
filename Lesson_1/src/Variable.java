public class Variable {
    public static void main(String[] args) {
        byte coreNumber = 2;                //Количество ядер процессора
        short ram = 8;                      //Объем оперативной памяти (ГБ)
        int windowsVersion = 1909;
        long diskCapacity = 239_155_015_680L;   //Емкость диска (Б)
        float frequencyCPU = 1.8F;           //Частота процессора (ГГц)
        double password = 0.112_358_132_134;   //Пароль на вход
        char nameLetter = 'B';              //Первый символ логина
        boolean taskCompleted = true;       //Требуемое состояние задачи

        System.out.println("\n  Количество ядер:    " + coreNumber
                + "\n  Оперативная память: " + ram
                + "\n  Версия виндовс:     " + windowsVersion
                + "\n  Емкость диска:      " + diskCapacity
                + "\n  Частота процессора: " + frequencyCPU
                + "\n  Секретный пароль:   " + password
                + "\n  Логин начинается с: " + nameLetter
                + "\n  Это решение верно?  " + taskCompleted);

    }
}