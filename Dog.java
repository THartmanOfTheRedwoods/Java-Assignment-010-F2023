// Dog class
public class Dog {
    // Private instance variables/fields
    private String breed;
    private String size;
    private String color;
    private int age;

    // Constructor to set the initial state of the data members via passed parameters
    public Dog(String breed, String size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    // Instance method for eating
    public void eat() {
        System.out.println("The dog is eating.");
    }

    // Instance method for running
    public void run() {
        System.out.println("The dog is running.");
    }

    // Instance method for sleeping
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }

    // Instance method for getting the name of the dog
    public void name() {
        System.out.println("The dog's name is " + breed + ".");
    }

    // Main method
    public static void main(String[] args) {
        // Creating three Dog objects
        Dog dog1 = new Dog("Labrador", "Large", "Golden", 5);
        Dog dog2 = new Dog("Poodle", "Medium", "White", 3);
        Dog dog3 = new Dog("Bulldog", "Small", "Brown", 7);

        // Calling instance methods for each dog object
        dog1.eat();
        dog2.run();
        dog3.sleep();
        dog1.name();
        dog2.name();
        dog3.name();
    }
}
