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

    //Геттеры
    public String getName() {
        return name;

    }
    public int getAge() {
        return age;
    }

    //Изменение состояния персонажа
    //Худеть
    public int setLoseWeight(int lose) {                   
        weight -= lose;
        return weight;
    }

    //Толстеть
    public int setPutWeight(int fat){                      
        weight += fat;
        return weight;
    }

    //Расти
    public int setGrow(int grew) {                         
        haight += grew;
        return haight;
    }

    //Взрослеть
    public void setMature(int years) {                     
        age += years;
    }

    //Сменить работу
    public String setWork(String newWork) {          
        work = newWork;
        return work;
    }

    //Действия персонажа
    //Говорить
    public void speak(String speech) {                  
        System.out.println(speech);
    }

    //Идти к...
    public void move(String destination) {              
        System.out.println("I go to the " + destination);
    }

    //Учиться
    public void learn(String stdObject) {               
        System.out.println("I study " + stdObject);
    }
}