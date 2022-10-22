public class Animal {
    final String species;
    String name;
    Double weight;
    Boolean isAlive;


    Animal(String species){
        this.isAlive = true;
        this.species = species;
    }
    void feed(){
        if (isAlive) {
            this.weight += 0.5;
            System.out.println("thx for food");
        }
        else{
            System.out.println("świeć Panie nad jego duszą");
        }
    }

    void takeForAWalk(){
        if (!isAlive)
        {
            System.out.println("grałem twoim i umar dzwonie na pały");
        }else {

        this.weight -= 0.5;
        System.out.println("thx for a walk");
        }
        if (this.weight <= 0){
            this.isAlive =false;
        }


    }
}
