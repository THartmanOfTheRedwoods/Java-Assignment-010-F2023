// Written By: Austin Barnett
// Date: 4/10/2024
// Version 1.0
public class Dog {
    // Private instance variables/fields
    private String name;
    private int age;
    private double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat(Food food) {
        System.out.println(name + " is eating.");
        weight += food.getWeight();
        food.setWeight(0);
    }


    public void run() {
        System.out.println(name + " is running.");

        weight -= 0.5;
    }


    public void sleep() {
        System.out.println(name + " is sleeping.");
    }


    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 3, 20.0);
        Dog dog2 = new Dog("Charlie", 1, 10.0);
        Dog dog3 = new Dog("Max", 5, 25.0);


        Food dogFood = new Food(5.0);
        dog1.eat(dogFood);
        dog2.run();
        dog3.sleep();
    }
}


class Food {
    private double weight;

    public Food(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
