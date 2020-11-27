public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        //Initial settings
        wolf.setAlias("Dusty");
        wolf.setSex("female");
        wolf.setColor("gray");
        wolf.setWeight(20);
        wolf.setAge(9);

        //Printing settings
        System.out.println();
        System.out.println(" Name " + wolf.getAlias() + '\n'
                        + " Sex " + wolf.getSex() + '\n'
                        + " Color " + wolf.getColor() + '\n'
                        + " Weight " + wolf.getWeight() + '\n'
                        + " Age " + wolf.getAge());

        //Actions
        System.out.println("\n     Go");
        wolf.go("east");
        System.out.println("\n     Sit");
        wolf.sit();
        System.out.println("\n     Run");
        wolf.run("after the leader");
        System.out.println("\n     Howl");
        wolf.howl();
        System.out.println("\n     Hunt");
        wolf.hunt();
    }
}