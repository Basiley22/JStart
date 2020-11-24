public class Person {
    private String name;
    private String sex;
    private String work;
    private int age;
    private int haight;
    private int weight;

    //Конструктор класса
    Person() {
        name = "Stashek";
        sex = "male";
        work = "schoolboy";
        age = 12;
        haight = 135;
        weight = 28;
    }

    //Действия персонажа
    public void speak(String speech) {                  //Говорить
        System.out.println(speech);
    }
    public void move(String destination) {              //Идти к...
        System.out.println("I go to the " + destination);
    }
    public void learn(String stdObject) {               //Учиться
        System.out.println("I study " + stdObject);
    }

    //Изменение состояния персонажа
    public int loseWeight(int lose) {                   //Худеть
        weight -= lose;
        return weight;
    }
    public int putWeight(int fat){                      //Толстеть
        weight += fat;
        return weight;
    }
    public int grow(int grew) {                         //Расти
        haight += grew;
        return haight;
    }
    public void mature(int years) {                     //Взрослеть
        age += years;
    }
    public String changeWork(String newWork) {          //Сменить работу
        work = newWork;
        return work;
    }

    //Передача полей персонажа
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}