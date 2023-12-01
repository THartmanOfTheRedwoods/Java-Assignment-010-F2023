public class Dog {
// private instance variables/fields for data members
    /**
     * @Author Olivia McKittrick
     * @Date 12/1/2023
     */
    private final String name;
    private final int age;
    private final String breed;
    private final String size;
    private final String color;

    // Constructor that sets the initial state of the data members via passed parameters
    Dog(String name, int age, String breed, String size, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.size = size;
        this.color = color;
    }
    // Instance variables
    void eat(Food food) {
        System.out.println(name + " is eating " + food.getName() + " (" + food.getType() + ")");
        // method to reduce weight
        food.reduceWeight();
        food.consume();
    }

    void run() {
        System.out.println(name + " is running ");
    }

    void sleep() {
        System.out.println(name + " is sleeping ");
    }

    String getName() {
        return name;
    }

    // Main method to create dog objects
    public static void main(String[] args) {
        // 3 dog objects
        Dog dog1 = new Dog("Larry",7, "Rottweiler", "Large", "Brown");
        Dog dog2 = new Dog("Winnie", 4, "Pit bull", "Medium", "Brindle");
        Dog dog3 = new Dog("Chucho", 5, "Presa Canario", "Extra Large", "Tan");

        // Calling instance methods
        dog1.run();
        dog2.sleep();
        dog3.eat(new Food("Dog food", 500, "Dry"));

        Food dryFood = new Food("Dog Food", 500, "Dry");
        Food wetFood = new Food("Canned Food", 300, "Wet");

        System.out.println("Initial Weight of " + dryFood.getName() + ": " + dryFood.getWeight());
        System.out.println("Initial Weight of " + wetFood.getName() + ": " + wetFood.getWeight());

        dryFood.setWeight(450);
        wetFood.setWeight(280);

        System.out.println("Updated Weight of " + dryFood.getName() + ": " + dryFood.getWeight());
        System.out.println("Updated Weight of " + wetFood.getName() + ": " + wetFood.getWeight());

    }
}

// Class for Food
class Food {
    public String getName;
    private final String name;
    private int weight;
    private String type;

    String getType() {
        return type;
    }

    void consume() {
        System.out.println(name + " is consumed.");
    }

    Food(String name, int weight, String dry) {
        this.name = name;
        this.weight = weight;
    }

    String getName() {
        return name;
    }

    void reduceWeight() {
        weight -= 50;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
