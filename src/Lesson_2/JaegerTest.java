public class JaegerTest {
    public static void main(String[] args) {

        //String callSign, float hight, float weight, int speed, int energyLevel, int ammoNumber
        Jaeger jag1 = new Jaeger("Cadet", 2.0f, 10.0f, 20, 20, 0);
        Jaeger jag2 = new Jaeger("Cornet", 2.2f, 11.5f, 18, 25, 0);

        System.out.println("\n Параметры после инициализации");
        jag1.showParameters();
        jag2.showParameters();
        
        System.out.println("\n Заправка");
        jag1.fillUp();
        jag2.fillUp();

        System.out.println("\n Параметры после заправки");
        jag1.showParameters();
        jag2.showParameters();
        
        System.out.println("\n Бой");
        jag1.drift();
        jag2.drift();
        jag1.move(10);
        jag1.fire(15);
        jag2.move(20);
        jag2.fire(5);

        System.out.println("\n Параметры после боя");
        jag1.showParameters();
        jag2.showParameters();
    }
}
