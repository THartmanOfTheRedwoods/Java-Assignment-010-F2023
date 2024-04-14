import java.util.*;
public class Dog {
    private String breed;
    private String size;
    private String color;
    private int age;
    private String name;

    public Dog(String breed, String size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    public void eat() {
        if(Objects.equals(this.size, "large")) {
            this.size = "extra large";
        } else if (Objects.equals(this.size, "medium")) {
            this.size = "large";
        } else if (Objects.equals(this.size, "small")) {
            this.size = "medium";
        }
    }

    public void run() {
        System.out.println(this.name + " is running around. They are now tired and could use some sleep.");
    }

    public void sleep() {
        if (this.name == null) {
            System.out.println(this + " is sleeping...zzz...zzz...zzz...");
        } else {
            System.out.println(this.name + " is sleeping...zzz...zzz...zzz...");
        }
    }

    public void name(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Dog dog1 = new Dog("Bulldog", "large", "light grey", 5);
        Dog dog2 = new Dog("Beagle", "large", "orange", 6);
        Dog dog3 = new Dog("German Shepherd", "large", "white & orange", 6);

        System.out.println(dog1.toString());
        dog1.name("Bully");
        System.out.println(dog1.name.toString());
        dog2.sleep();
        dog1.sleep();
        dog1.run();
        dog1.eat();
        System.out.println(dog1.size.toString());

    }
}
