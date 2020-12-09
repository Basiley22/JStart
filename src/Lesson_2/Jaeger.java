public class Jaeger {
    private String modelName;
    private float height;
    private float weight;
    private int speed;
    private int volleyPower;
    private int armorLevel;
    private int energyLevel;
    private int ammunitionLevel;

    //Constructor
    Jaeger() {
        energyLevel = 0;
        ammunitionLevel = 0;
        armorLevel = 100;
    }

    //Set & Get
    public void setModelName(String model) {
        modelName = model;
    }

    public String getModelName() {
        return modelName;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setVolleyPower(int volPow) {
        volleyPower = volPow;
    }

    public int getVolleyPower() {
        return volleyPower;
    }

    //Servise
    public void replenAmmunition() {
        ammunitionLevel = 100;
        System.out.println(" Ammunition replenished!");
    }

    public void chargeBattery() {
        energyLevel = 100;
        System.out.println(" Battery charged!");
    }

    //Action
    public void move() {
        System.out.println(" Бежим!");
    }

    public void drift() {
        System.out.println(" Работаем!");
    }

    public void fire() {
        System.out.println(" Бах!");
    }
}