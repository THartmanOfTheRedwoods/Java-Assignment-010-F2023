//Dog class
class Dog {
    //Private Variables/Fields for Data Members
    private String breed;
    private String size;
    private String color;
    private int age;
    //Constructor
    private boolean isHungry;

    Dog(String breed, String size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        //Constructor
        this.isHungry = true; //Dog is hungry
    }

    //Method to /set/ dog's name
    void setName(String name) {
        this.name = name;
    }

    //Method to /get/ dog's name
    String getName() {
        return name;
    }

    //4 Methods for eat, run, sleep, and name

    //Method for dog to eat
    void eat() {
        if (isHungry) {
            System.out.println(getName() + " is eating.");
            isHungry = false; //Dog already ate
        } else {
            System.out.println(getName() + " is not hungry right now.");
        }
    }

    //Method for dog to run
    void run() {
        System.out.println(getName() + " is running.");
    }

    //Method for dog to sleep
    void sleep() {
        System.out.println(getName() + " is sleeping.");
    }

    //Main Method: Dog objects and their behavior
    public static void main(String[] args) {
        //Three Dog objects
        Dog bulldog = new Dog("Bulldog", "Large", "Light Grey", 5);
        bulldog.setName("Buddy");

        Dog beagle = new Dog("Beagle", "Large", "Orange", 6);
        beagle.setName("Max");

        Dog germanShepherd = new Dog("German Shepherd", "Large", "White and Orange", 6);
        germanShepherd.setName("Rocky");

        //Performing actions on the dogs
        bulldog.eat();
        beagle.run();
        germanShepherd.sleep();
    }
}
