/*
*/  Chris Shortt 12/7/2023
 */
public class Dog {
    // Private instance variables for breed, size, color, age, and name
    private String breed;
    private String size;
    private String color;
    private int age;
    private String name;

    // Constructor to set initial state of data members via passed parameters including name
    public Dog(String name, String breed, String size, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    // ... (methods remain the same)

    public static void main(String[] args) {
        // Create 3 Dog objects with names using the constructor
        Dog luci = new Dog("Luci", "Bulldog", "large", "Light grey", 5);
        Dog harvi = new Dog("Harvi", "Beagle", "Large", "Orange", 6);
        Dog mrWaffles = new Dog("Mr. Waffles", "German Shepard", "very Large", "white and orange", 6);

        // Call instance methods on the Dog objects
        luci.eat(new Food(10)); // Assuming Food class with a weight of 10
        harvi.run();
        mrWaffles.sleep();

        // Retrieve the names of the dogs
        luci.name();
        harvi.name();
        mrWaffles.name();
    }
}
