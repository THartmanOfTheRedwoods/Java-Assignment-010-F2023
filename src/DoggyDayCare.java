import java.util.Random;

public class DoggyDayCare {
    public static void main(String[] args) {
        String[] names = new String[] {"Fido","spot","queen","jeff","dave"};
        Dog[] dogs = new Dog[]{
                new Dog("Bulldog", "Medium", "Light grey", 5.5),
                new Dog("Beagle", "Large", "orange", 6.0),
                new Dog("German Shepherd", "Large", "White and Orange", 6.0),
        };
        Random r = new Random();
        for (Dog dog : dogs) {
            dog.setName(
                    names[r.nextInt(0, names.length)]
            );

            System.out.printf("%s is breed %s%n", dog.getName(), dog.getBreed());
            dog.Eat(new Food(0.5));
            dog.Run(new Ran(20.0));

        }




        System.out.println();
    }
}
