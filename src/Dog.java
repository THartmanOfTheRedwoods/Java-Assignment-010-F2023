/**
 * @author Alexei Iachkov
 * @date 4-14-24
 * @version 1.0
 */
public class Dog {
    private String breed;
    private String size;
    private String color;
    private int age;

    public Dog(String breed, String size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    public void eat(Food food) {
        System.out.println("The " + breed + " is eating.");
        food.reduceWeight();
    }

    public void run() {
        System.out.println("The " + breed + " is running.");
    }

    public void sleep() {
        System.out.println("The " + breed + " is sleeping.");
    }

    public void name() {
        System.out.println("The " + breed + "'s name is Doober.");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bulldog", "large", "light gray", 5);
        Dog dog2 = new Dog("Beagle", "medium", "orange", 7);
        Dog dog3 = new Dog("German Shepherd", "large", "white and orange", 4);

        dog1.eat(new Food()); // Passing a Food object to the eat method
        dog2.run();
        dog3.sleep();
        dog3.name();
    }
}

class Food {
    public void reduceWeight() {
        System.out.println("Food weight reduced.");
    }
}
