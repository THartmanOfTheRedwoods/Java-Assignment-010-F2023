//Daniel Faulkner, CIS 12 11/11/2023
//Note: I cannot for the life of me get this to complile, ive tried many things i found online and none work.
public class Dog {

    private String name;
    private String breed;
    private int age;
    private String color;


    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }


    public void eat(Food food) {
        System.out.println(name + " is eating " + food.getName());
        food.reduceWeight();
    }

    public void run() {
        System.out.println(name + " is running");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Jeremy", "Bulldog", 5, "Light Gray");
        Dog dog2 = new Dog("Buster", "Beagle", 6, "Orange");
        Dog dog3 = new Dog("Graham", "German Shepherd", 6, "White & Orange");


        Food dogFood = new Food("Dog Food", 250);

        dog1.eat(dogFood);
        dog2.run();
        dog3.sleep();

        System.out.println("Dog 1 name: " + dog1.getName() + ", color: " + dog1.getColor());
        System.out.println("Dog 2 name: " + dog2.getName() + ", color: " + dog2.getColor());
        System.out.println("Dog 3 name: " + dog3.getName() + ", color: " + dog3.getColor());
    }
}

class Food {
    private String name;
    private int weight;

    public Food(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }


    public void reduceWeight() {
        if (weight > 0) {
            weight -= 100;
        }
    }
}