import java.util.Scanner;

public class Dog {
    private String name;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting dog names
        System.out.println("Enter name for Dog 1:");
        String nameOfDog1 = scanner.nextLine();
        System.out.println("Enter name for Dog 2:");
        String nameOfDog2 = scanner.nextLine();
        System.out.println("Enter name for Dog 3:");
        String nameOfDog3 = scanner.nextLine();

        // Dog objects with details from the image
        String breed1 = "Bulldog";
        String size1 = "Large";
        String color1 = "Light grey";
        int age1 = 5;

        String breed2 = "Beagle";
        String size2 = "Large";
        String color2 = "Orange";
        int age2 = 6;

        String breed3 = "German Shepherd";
        String size3 = "Large";
        String color3 = "White & Orange";
        int age3 = 6;

        Dog dog1 = new Dog(nameOfDog1, breed1, size1, color1, age1);
        Dog dog2 = new Dog(nameOfDog2, breed2, size2, color2, age2);
        Dog dog3 = new Dog(nameOfDog3, breed3, size3, color3, age3);

        // The dogs have to eat, right?
        Food food = new Food(40);

        // These strings seem like the easy way to work with the methods required.
        dog1.eat(food);
        dog1.run();
        dog1.sleep();

        dog2.eat(food);
        dog2.run();
        dog2.sleep();

        dog3.eat(food);
        dog3.run();
        dog3.sleep();
    }

    public Dog(String name, String breed, String size, String color, int age) {
        this.name = name;
    }

    public void eat(Food food) {
        food.setWeight(food.getWeight() - 1);
        String message = this.getName() + " is eating.";
        System.out.println(message);
    }

    public void run() {
        System.out.println(this.getName() + " is running!");
    }

    public void sleep() {
        System.out.println(this.getName() + " is sleeping soundly.");
    }

    public String getName() {
        return this.name;
    }

    public static class Food {
        private int weight;

        public Food(int weight) {
            this.weight = weight;
        }

        // Setter method to modify weight
        public void setWeight(int newWeight) {
            this.weight = newWeight;
        }

        // Getter method for biscuits remaining
        public int getWeight() {
            return this.weight;

        }
    }
}