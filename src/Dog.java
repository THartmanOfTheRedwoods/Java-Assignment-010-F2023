public class Dog {
    private String Breed;
    private String Size;
    private String Colour;
    private int Age;

    public Dog(String breed, String size, String colour, int age) {
        Breed = breed;
        Size = size;
        Colour = colour;
        Age = age;
    }
    public String getBreed() {
        return Breed;
    }
    public void setBreed(String name) {
        Breed = name;
    }
    public String getSize() {
        return Size;
    }
    public void setSize(String size) {
        Size = size;
    }
    public String getColour() {
        return Colour;
    }
    public void setColour(String colour) {
        Colour = colour;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }

    public void eat(String food) {
        System.out.println(Breed+" is eating " + food);
    }

    public void run() {
        System.out.println(Breed+" is running");
    }

    public void sleep() {
        System.out.println(Breed+" is sleeping");
    }

    public String  setName(String name) {
       return name;
    }


    public static void main(String[] args) {
        Dog dog1 = new Dog("Bulldog", "large", "light gray", 5);
        Dog dog2 = new Dog("Beagle", "large", "orange", 6);
        Dog dog3 = new Dog("German Shepherd", "large", "white and orange", 6);

        dog1.eat("bone");
        dog2.run();
        dog3.sleep();
        System.out.println(dog1.setName("Luncky") + " is a " + dog1.getBreed() + ".");

    }
}
