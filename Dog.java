/**
 *
 * @author Trevor Hartman
 * @author Cameron Meng
 *
 * @since Version 1.0
 *
 */
import java.util.Random;

public class Dog {
   private String breed;
   private String size; // small, med, large.
    private String color; // color of the dogs coat or fur.
    private double age; // age in years & months.
    private String name; // dogs name
    private Random rand; // to determine how much food to eat.
    public Dog(String name, String breed, String size, String color, double age){
        this.breed = breed;
        this.size = size.toUpperCase();
        this.color = color;
        this.age = age;
        this.name = name;
        this.rand = new Random();

    }
    public Dog(String breed, String size, String color, double age){
        this(null, breed, size, color, age);
    }
    public Dog(){
        this(null, null, null, null,-1.0);
    }
    public void eat(Food food) {
        double foodQty = food.getWeight();
        double foodDogEats = switch (this.size) {
            case "LARGE" -> Math.min(
                    rand.nextDouble(Math.min(0.5, foodQty), foodQty +1), foodQty
            );
            case "MEDIUM" -> Math.min(
                    rand.nextDouble(Math.min(0.25, foodQty), foodQty +1), foodQty
            );
            case "SMALL" -> Math.min(
                    rand.nextDouble(Math.min(0.1, foodQty), foodQty +1), foodQty
            );
            default -> 0.0;
        };
            System.out.printf("Dog %s is eating %f kgs of food.%n", getName(), foodDogEats);
            food.setWeight(foodQty - foodDogEats);
            System.out.printf("Dog %s is eating %f kgs of food left.%n",getName(), food.getWeight());
        }
    public void run(){
        System.out.printf("Dog %s is running.%n", getName());
    }
    public void sleep(){
        System.out.printf("Dog %s is sleeping.%n", getName());
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
