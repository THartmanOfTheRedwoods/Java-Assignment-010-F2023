public class Dog {

    // Private instance variables (data members)
    private String breed;
    private String size;
    private String color;
    private int age;

    // Constructor
    public Dog(String breed, String size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

   // Method to simulate eating (functional)
    public void eat() {
        System.out.println(breed + " is happily eating!");
    }

    // Method to simulate running (functional)
    public void run() {
        System.out.println(breed + " has got the zoomies. Look at them go!");
    }

    // Method to simulate sleeping (functional)
    public void sleep() {
        System.out.println(breed + " must be tired.");
    }

    // Method to display the dog's name (assuming name is derived from breed)
    public void name() {
        System.out.println("This dog is a " + breed);
    }

   public static void main(String[] args) {
        // Create Dog objects

        Dog dog1 = new Dog("Bulldog", "Large", "Light Gray" , 5);
        Dog dog2 = new Dog("Beagle", "Large", "Orange", 6);
        Dog dog3 = new Dog("German Shepherd", "Large", "White & Orange", 6);


    }
}
