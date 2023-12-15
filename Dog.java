public class Dog {
    // Private instance variables
    private String name;
    private int age;
    private String breed;

    // Constructor to set initial state
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Instance method for eat
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Instance method for run
    public void run() {
        System.out.println(name + " is running.");
    }

    // Instance method for sleep
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Instance method for name
    public String getName() {
        return name;
    }

    // Main method to create Dog objects
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");
        Dog dog2 = new Dog("Max", 2, "Labrador");
        Dog dog3 = new Dog("Charlie", 4, "German Shepherd");

        // Example usage of methods
        dog1.eat();
        dog2.run();
        dog3.sleep();

        System.out.println("Dog 1's name: " + dog1.getName());
    }
    public static void main(String[] args) {

        }
    }


