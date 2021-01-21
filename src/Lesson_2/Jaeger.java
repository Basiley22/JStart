public class Jaeger {
    private String callSign;
    private float height;
    private float weight;
    private int speed;
    private int energyLevel;
    private int ammoNumber;

    //Constructor
    Jaeger(String callSign, float height, float weight, int speed, int energyLevel, int ammoNumber) {
        this.callSign = callSign;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.energyLevel = energyLevel;
        this.ammoNumber = ammoNumber;
    }

    //Get
    public String getCallSign() {
        return callSign;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    @Override
    public String toString() {
        return callSign
                + "\n Высота " + height
                + "\n Вес " + weight
                + "\n Скорость " + speed
                + "\n Энергия " + energyLevel
                + "\n Боеприпасы " + ammoNumber;
    }

    //Service
    public void fillUp() {
        ammoNumber = 100;
        energyLevel = 100;
        System.out.println(callSign + "\n Батареи заряжены, боеприпасы пополнены!");
    }

    //Actions
    public void drift() {
        System.out.println(callSign + ": Работаем!");
    }

    public void move(int distance) {
        System.out.println(callSign + ": Бежим!");
        energyLevel -= (distance * speed * weight * 0.005);
    }

    public void fire(int burst) {
        System.out.println(callSign + ": Трададада!");
        ammoNumber -= burst;
    }
}