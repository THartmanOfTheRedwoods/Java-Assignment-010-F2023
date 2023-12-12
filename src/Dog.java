/*
*
* @author Trevor Hartman
* @author Angelina Perez
 */
public class Dog {
    private String breed;
    private String size;
    private String color;
    private int age;
    private String name;
    private boolean isHungry;
    private static int distance;
    private static int hours;


    public Dog(String name, String breed, String size, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void run(int distance) {
        if(!isHungry) {
        System.out.println(name + " is running");
        int energyLoss = distance;
            System.out.println(name + "'s energy decreased by " + energyLoss + " units.");
        } else {
            System.out.println(name + " is too hungry to run.");
        }
    }


    public void sleep(int hours) {
        System.out.println(name + " is sleeping");
        int energyGain = 5 * hours;
        System.out.println(name + "'s energy increased by " + energyGain + " units.");
        isHungry = true;
    }

    public String name() {
        return name;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bingo", "Bulldog", "large", "light gray", 5);
        Dog dog2 = new Dog("Bluey", "beagle", "large", "orange", 6);
        Dog dog3 = new Dog("Bandit", "German Shepherd", "large", "white and orange", 6);

        dog1.eat();
        dog2.run(5);
        dog3.sleep(8);

        System.out.println("Dog 1 details:");
        printDogDetails(dog1);

        System.out.println("\nDog 2 details:");
        printDogDetails(dog2);

        System.out.println("\nDog 3 details:");
        printDogDetails(dog3);


    }

    private static void printDogDetails(Dog dog) {
        System.out.println("Name: " + dog.name);
        System.out.println("Breed: " + dog.breed);
        System.out.println("Size: " + dog.size);
        System.out.println("Color: " + dog.color);
        System.out.println("Age: " + dog.age);
    }
}
