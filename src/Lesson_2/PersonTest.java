public class PersonTest {
   public static void main(String[] args) {
        Person person = new Person();

        String name = person.getName();
        person.speak("I'm " + name + " !");
        person.move("home");
        person.learn("mathematics");
        System.out.println(name + " is " + person.getAge() + " years old.");

        //person повзрослел на 5 лет
        System.out.println();
        person.mature(5);
        String work = person.changeWork("student");
        System.out.println("Now " + name + " is " + person.getAge() + " years old.");
        System.out.println("He is a " + work);
        System.out.println(person.grow(35) + "\n" + person.putWeight(40));
    }
}