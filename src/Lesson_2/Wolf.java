public class Wolf {
    private String alias;
    private String sex;
    private String color;
    private int weight;
    private int age;

    //Setting
    public void setAlias (String alias) {
        this.alias = alias;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setColor(String color) {
        this.color = color;
    }

public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Getting
    public String getAlias() {
        return alias;
    }

    public String getSex() {
        return sex;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    //Actions
    public void go(String direct) {
        System.out.println(" I go " + direct);
    }

    public void sit() {
        System.out.println(" I sit, wait.");
    }

    public void run(String direct) {
        System.out.println(" I run " + direct);
    }

    public void howl() {
        for (int i = 0; i < 3; i++) {
            System.out.print(" A-A-A-O-O-O-U-U-U!!!");
        }
        System.out.println();
    }

    public void hunt() {
        System.out.println(" I'm hungry, I hunt.");
    }
}
