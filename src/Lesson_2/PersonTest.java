public class PersonTest{
    public static void main(String[] args) {
        Person p = new Person();

        String name = p.getName();
        p.speak("I'm " + name + " !");
        p.move("home");
        p.learn("mathematics");
        System.out.println(name + " is " + p.getAge() + " years old.");

        //p повзрослел на 5 лет
        System.out.println();
        p.mature(5);
        String work = p.changeWork("student");
        System.out.println("Now " + name + " is " + p.getAge() + " years old.");
        System.out.println("He is a " + work);
        System.out.println(p.grow(35) + "\n"
                        + p.putWeight(40));
    }
}