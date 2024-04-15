public class Dog {
    private String breed;
    private String size;
    private String color;
    private int age;
    private String dogName;
    public Dog(String breed, String size, String color, int age, String dogName) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.dogName = dogName;
    }
    public void name() {
        System.out.println("the "+ size +" and "+ color +" dog is a "+ breed +" named "+ dogName +" and is "+ age +" years old");
    }
    public void eat() {
        System.out.println(dogName +" is eating.");
    }
    public void run(int distance) {
        distance = 2 * age - distance;
        if (distance < 0) {
            distance = 0;
        }
        System.out.println(dogName +" ran "+ distance +" miles today.");
    }
    public void sleep() {
        System.out.println(dogName +" is sleeping.");
    }

    public static void main(String[] args) {
        Dog Dog1Object = new Dog("Bulldog", "large", "light gray", 5, "Meatloaf");
        Dog Dog2Object = new Dog("Beagle", "large", "orange", 6, "Buddy");
        Dog Dog3Object = new Dog("German Shepherd", "large", "white & orange", 6, "Chop");

        Dog1Object.name();
        Dog1Object.run(6);

        Dog2Object.name();
        Dog2Object.run(6);

        Dog3Object.name();
        Dog3Object.sleep();
    }
}
