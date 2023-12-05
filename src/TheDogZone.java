import java.util.Random;

public class TheDogZone {
    public static void main (String[] args) {
        System.out.printf("WELCOME TO THE DOG ZONE!%n");

        String[] names = new String[]{"Bingo", "Ringo", "Dingo", "Gringo", "Persephone"};
        Dog[] dogs = new Dog[]{
            new Dog("Bulldog", Dog.SIZE.MEDIUM, "Light Gray", 5),
            new Dog("Beagle", Dog.SIZE.SMALL, "Orange", 6),
            new Dog("German Shepard", Dog.SIZE.LARGE, "Brown", 6),
};

        Random r = new Random();
        for (Dog dog : dogs) {
            dog.setName(
                    names[
                            r.nextInt(0,names.length)
                            ]
            );


            System.out.printf("%s is breed %s %n", dog.getName(), dog.getBreed());
            dog.eat(new Food(1.0));
        }
        }


}


