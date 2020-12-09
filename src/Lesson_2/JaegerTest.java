public class JaegerTest {
    public static void main(String[] args) {
        Jaeger m1 = new Jaeger();

        m1.setModelName("Markus0");
        m1.setHeight(5.2f);
        m1.setWeight(2.5f);
        m1.setSpeed(20);
        m1.setVolleyPower(10);

        
        System.out.println(m1.getModelName());
        System.out.println(m1.getHeight());
        System.out.println(m1.getWeight());
        System.out.println(m1.getSpeed());

        m1.replenAmmunition();
        m1.chargeBattery();
        m1.drift();
        m1.move();
        m1.fire();
    }
}