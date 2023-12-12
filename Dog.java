//NAQIBULLAH HAIWADPAL
//12/11/2023


public class Dog {
    // Private instance variables/fields
    private String name;
    private double weight;
    private String breed;
    private int age;

    // Constructor that sets the initial state of the data members via passed parameters
    public Dog(String name, double weight, String breed, int age) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
        this.age = age;
    }

    // Instance methods
    public void eat(double amount) {
        weight += amount; // Assuming the amount passed is the weight of the food
        System.out.println(name + " is eating " + amount + " pounds of food.");
    }

    public void run(int minutes) {
        System.out.println(name + " is running for " + minutes + " minutes.");
    }

    public void sleep(int hours) {
        System.out.println(name + " is sleeping for " + hours + " hours.");
    }

    public String getName() {
        return name;
    }

    // Main method that creates the 3 Dog objects
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 50.0, "Golden Retriever", 3);
        Dog dog2 = new Dog("Max", 30.0, "Beagle", 5);
        Dog dog3 = new Dog("Luna", 25.0, "Border Collie", 2);

        // Call methods to demonstrate functionality
        dog1.eat(1.5); // Buddy eats 1.5 pounds of food
        dog2.run(30); // Max runs for 30 minutes
        dog3.sleep(6); // Luna sleeps for 6 hours
    }
}


