import java.util.Scanner;

public class Dog {

    private String name;
    private int age;
    private String breed;
    private String size;
    private String color;

    public Dog(String name, int age, String breed, String size, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.size = size;
        this.color = color;
    }

    // method to change the dog's name
    public void changeName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the new name for the dog: ");
        name = scanner.nextLine();
        System.out.println("The dog's name has been changed to " + name);
    }

    public void eat(Food food) {
        if (food.getWeight() >= 5) {
            food.decreaseWeight(5);
            System.out.println(name + " ate 5 pounds of food. The remaining weight of the food is " + food.getWeight() + " pounds.");
        } else {
            System.out.println("There is not enough food for " + name + " to eat.");
        }
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever", "Large", "Golden");
        Dog dog2 = new Dog("Max", 5, "German Shepherd", "Medium", "Black and Tan");
        Dog dog3 = new Dog("Charlie", 2, "Labrador", "Small", "Black");

        Food food = new Food(100);

        dog1.eat(food);

        System.out.println("The remaining weight of the food is " + food.getWeight() + " pounds.");
    }
}