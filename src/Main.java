public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal dog = new Animal("canis");

        dog.name = "Szarik";
        dog.weight = 10.3;
        dog.isAlive = true;

        System.out.println(("masz zwierze, nazywa się: "));
        System.out.println(dog.name);
        System.out.println(dog.isAlive);
        System.out.println(dog.species);

        Animal cat = new Animal("cat");

        cat.name = "szarlota";
        cat.weight = 1.5;

        System.out.println(cat.name);
        System.out.println(cat.species);


        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.feed();

        Human me = new Human();
        me.pet = cat;
        System.out.println(me.pet.species);
        me.pet.feed();

        me.car = new Car("Fiat", "Bravo");
        System.out.println(me.car.model);
        System.out.println(me.car.producer);

        me.getSalary();
        me.setSalary(-1000);
        me.getSalary();
        me.setSalary(500);

    }

}