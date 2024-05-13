public class Dog {
    private final String breed;
    private final String size;
    private final String color;
    private final int age;
    private final String name;

    public Dog(String breed, String size, String color, int age, String name) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.name = name;
    }

    public void eat() {
        System.out.println(name + ": is eating.");
    }

    public void run() {
        System.out.println(name + ": is running.");
    }

    public void sleep() {
        System.out.println(name + ": is now sleeping, ZZZZZzzzz");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        System.out.println(name + ": is awake now!");
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bulldog", "large", "light gray", 5, "Buddy");
        Dog dog2 = new Dog("Beagle", "large", "orange", 6, "Max");
        Dog dog3 = new Dog("German Shepherd", "large", "white & orange", 6, "Rocky");
        dog1.eat();
        dog2.run();
        dog3.sleep();
    }
}