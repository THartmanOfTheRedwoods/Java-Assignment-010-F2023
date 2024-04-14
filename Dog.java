public class Dog {

    private String breed;
    private String size;
    private String color;
    private int age;

    public Dog(String breed, String size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
                this.age = age;
    }

    public void eat()
        System.out.println("The dog is eating.");
}
public void run() {
    System.out.println("The dog is running.");
}

public void sleep() {
    System.out.println("The dog is sleeping.");
}
    public void name()
        System.out.println("The dog's name is: ");
}
public String toString() {
    return "Breed: " + breed + "\nSize: " + size + "\nColor: " + color + "\nAge: " + age;
}
public static void main(String[] args) {
    Dog dog1 = new Dog("Bulldog", "large", "light gray", 5);
    Dog dog2 = new Dog("Beagle", "large", "orange", 6);
    Dog dog3 = new Dog("German Shepherd", "large", "white & orange", 6);

    System.out.println("Dog 1:");
    System.out.println(dog1.toString());

    System.out.println("\nDog 2:");
    System.out.println(dog2.toString());

    System.out.println("\nDog 3:");
    System.out.println(dog3.toString());

    dog1.run();
    dog3.eat();
    }
}