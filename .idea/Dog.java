public class Dog {
    //private instance variables/fields for all data members
    private String breed;
    private String size;
    private String color;
    private int age;

    //constructor to set initial state of data members
    public Dog(String breed, String size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;

    }

    //instance method for eating
    public void eat() {
        System.out.println("dog is eating.");

    }

    //instance method for running
    public void run() {
        System.out.println("dog is running.");
    }

    //instacne methof for  sleeping
    public void sleep() {
        System.out.println("dog is sleeping.");
    }

    //instacne method for getting name of dog
    public String getName() {
        return breed; //assuming breed is the name
    }

    //main to creat 3 dog objects
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bulldog", "large", "light gray", 5);
        System.out.println("Dog 1:");
        System.out.println("name: " + dog1.getName());
        System.out.println("size: " + dog1.size);
        System.out.println("color: " + dog1.color);
        System.out.println("age: " + dog1.age);
        dog1.eat();
        dog1.run();
        dog1.sleep();

        //dog2object
        Dog dog2 = new Dog("Beagle", "large", "orange", 6);
        System.out.println("Dog 2:");
        System.out.println("name: " + dog2.getName());
        System.out.println("size: " + dog2.size);
        System.out.println("color: " + dog2.color);
        System.out.println("age: " + dog2.age);
        dog2.eat();
        dog2.run();
        dog2.sleep();

        //dog3object
        Dog dog3 = new Dog("german sheoherd", "large", "white and orange", 6);
        System.out.println("Dog 3:");
        System.out.println("name: " + dog3.getName());
        System.out.println("size: " + dog3.size);
        System.out.println("color: " + dog3.color);
        System.out.println("age: " + dog3.age);
        dog3.eat();
        dog3.run();
        dog3.sleep();

    }
}
