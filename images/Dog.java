
public class Dog {

    private String name;
    private String breed;
    private in age;
    private String size;
    private boolean isHungry;

    Dog(String name, String breed, int age, String size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
        this.isHungry = true;
    }

    void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
        isHungry = false;
    }

    void run() {
        System.out.println(name + " is running.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
    String getName() {
        return name;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Ripjaw", "Bulldog", 5, "Large");
        Dog dog2 = new Dog("Updog", "Beagle", 6, "Large");
        Dog dog3 = new Dog("Billy", "German Shepherd", 6, "Large");

        dog1.eat("Dog Food");
        dog2.run();
        dog3.sleep();
    }

}
