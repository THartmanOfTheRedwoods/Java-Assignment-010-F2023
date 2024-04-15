public class Dog {

    private String breed;
    private String size;
    private String color;
    private int age;
    private String name;

    private boolean isHungry;

    Dog(String breed, String size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.isHungry = true;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void eat() {
        if (isHungry) {
            System.out.println(getName() + " is eating.");
            isHungry = false;
        } else {
            System.out.println(getName() + " is not hungry right now.");
        }
    }

    void run() {
        System.out.println(getName() + " is running.");
        isHungry = true;
    }


    void sleep() {
        System.out.println(getName() + " is sleeping.");
    }

    public static void main(String[] args) {

        Dog bulldog = new Dog("Bulldog", "Large", "Light Grey", 5);
        bulldog.setName("Buddy");

        Dog beagle = new Dog("Beagle", "Large", "Orange", 6);
        beagle.setName("Max");

        Dog germanShepherd = new Dog("German Shepherd", "Large", "White and Orange", 6);
        germanShepherd.setName("Rocky");

        bulldog.eat();
        beagle.run();
        germanShepherd.sleep();
    }
}
