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
        armorLevel = 100;
    }

    //Set & Get
    public void setModelName(String model) {
        this.modelName = model;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return this.height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public float getWeight() {
        return this.weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setVolleyPower(int volleyPower) {
        this.volleyPower = volleyPower;
    }

    public int getVolleyPower() {
        return this.volleyPower;
    }

    //Servise
    public void replenAmmunition() {
        this.ammunitionLevel = 100;
        System.out.println(" Ammunition replenished!");
    }

    public void chargeBattery() {
        this.energyLevel = 100;
        System.out.println(" Battery charged!");
    }

    //Actions
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