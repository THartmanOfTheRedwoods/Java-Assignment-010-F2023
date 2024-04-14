// Class name: Student
class Student {
    // Instance variables/fields
    private String name;  // Instance variable 'name' of data type String
    private int rollNo;   // Instance variable 'rollNo' of data type int

    // Constructor with parameters
    // Constructor Parameters: String s, int r
    Student(String s, int r) {
        name = s;   // Setting instance variable 'name' with the value of s
        rollNo = r; // Setting instance variable 'rollNo' with the value of r
    }

    // Instance method: methodForDisplay
    void methodForDisplay() {
        System.out.println(name + "'s Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        // A Student object is created here with name "Rambo" and rollNo 21
        Student obj1 = new Student("Rambo", 21); // Where the instance variables value gets set: name = "Rambo", rollNo = 21
        obj1.methodForDisplay(); // Calling the instance method to display the student details
    }
}


public class Dog {
    // Private instance variables/fields
    private String breed;
    private String size;
    private String color;
    private int age;

    // Constructor that sets the initial state of the data members via passed parameters
    public Dog(String breed, String size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    // Instance method: eat
    public void eat(Food food) {
        System.out.println(this.breed + " is eating.");
        food.decreaseWeight(); // Simulate eating by decreasing the food's weight
    }

    // Instance method: run
    public void run() {
        System.out.println(this.breed + " is running.");
        // Running could be associated with losing weight or getting tired, etc.
        // For simplicity, we'll just print an action statement.
    }

    // Instance method: sleep
    public void sleep() {
        System.out.println(this.breed + " is sleeping.");
        // Sleep could be associated with resting or time passing.
    }

    // Instance method: name
    public void name() {
        System.out.println("The dog's breed is " + this.breed + " and it is " + this.age + " years old.");
    }

    // Main method that creates 3 Dog objects as per the diagram
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bulldog", "large", "light gray", 5);
        Dog dog2 = new Dog("Beagle", "large", "orange", 6);
        Dog dog3 = new Dog("German Shepherd", "large", "white & orange", 6);

        dog1.name();
        dog2.name();
        dog3.name();

        Food dogFood = new Food(5); // Initialize some food with a weight

        dog1.eat(dogFood);
        dog2.run();
        dog3.sleep();
    }
}

class Food {
    private int weight; // Weight of the food

    public Food(int weight) {
        this.weight = weight;
    }

    public void decreaseWeight() {
        if (this.weight > 0) {
            this.weight--;
            System.out.println("Food weight is now " + this.weight);
        } else {
            System.out.println("No more food left.");
        }
    }
}
