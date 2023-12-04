/**
 *
 * @author Trevor Hartman
 * @author Cameron Meng
 *
 * @since Version 1.0
 *
 */
import java.util.Random;

public class DoggyDayCare {
    public static void main(String[] args) {
        String[] names = new String[]{"Fido", "Butch", "Rex", "Spot", "John"};
        Dog[] dogs = new Dog[]{
                new Dog("Bulldog", "Medium", "Light Gray", 5.5),
                new Dog("Beagle", "Small", "Orange", 6.0),
                new Dog("German Sheppard", "Large", "White & Orange", 6.0)
    };
    Random r = new Random();
    for(Dog dog : dogs){
        dog.setName(
                names[
                        r.nextInt(0,names.length)
                        ]
        );
        System.out.printf("%n"+"%s is a %s%n", dog.getName(), dog.getBreed());
        dog.eat(new Food(1.0));
    }
    }
}

