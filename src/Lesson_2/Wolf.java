public class Wolf {
    private String alias;
    private String sex;
    private String color;
    private int weight;
    private int age;
    private int maxAge = 8;

    //Setting - Getting
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > maxAge) {
            System.out.println(age + " years - wolves don't live that long \n Enter the correct age.");
            this.age = -1;
        } else {
            this.age = age;
        }
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
