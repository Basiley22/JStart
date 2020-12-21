public class JaegerTest {
    public static void main(String[] args) {
        Jaeger cadet1 = new Jaeger();

        cadet1.setModelName("Markus0");
        cadet1.setHeight(5.2f);
        cadet1.setWeight(2.5f);
        cadet1.setSpeed(20);
        cadet1.setVolleyPower(10);
        
        System.out.println(cadet1.getModelName());
        System.out.println(cadet1.getHeight());
        System.out.println(cadet1.getWeight());
        System.out.println(cadet1.getSpeed());

        cadet1.replenAmmunition();
        cadet1.chargeBattery();
        cadet1.drift();
        cadet1.move();
        cadet1.fire();
    }
}