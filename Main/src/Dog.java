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

    public void eat() {
        System.out.println("The " + breed + " is eating.");
    }

    public void run() {
        System.out.println("The " + breed + " is running.");
    }

    public void sleep() {
        System.out.println("The " + breed + " is sleeping.");
    }

    public String name() {
        return breed;
    }

    public static void main(String[] args) {

        Dog Dog1Object = new Dog("Bulldog", "large", "light gray", 5);
        Dog Dog2Object = new Dog("Beagle", "large", "orange", 6);
        Dog Dog3Object = new Dog("German Shepherd", "large", "white & orange", 6);

        // Testing the methods for Dog1Object
        System.out.println("Dog1: " + Dog1Object.name());
        Dog1Object.eat();
        Dog1Object.run();
        Dog1Object.sleep();

        System.out.println("Dog2: " + Dog2Object.name());
        Dog2Object.eat();
        Dog2Object.run();
        Dog2Object.sleep();

        System.out.println("Dog3: " + Dog3Object.name());
        Dog3Object.eat();
        Dog3Object.run();
        Dog3Object.sleep();
    }
}
