import java.util.ArrayList;

public class Dog {
    private String breed;
    public String size;
    private String color;
    private int age;
    private String name;
    public static ArrayList<String> dogs = new ArrayList<>();

    public Dog(String breed, String size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    public void eat(String size) {
        Food eaten = new Food();
        String amount = eaten.eat();
        String collar = dogName(this.breed);
        System.out.printf("Dog %s is eating %s", collar, amount);
    }

    public String run(int age) {
        Distance m = new Distance();
        return m.exercise(Integer.parseInt(dogArray().get(age)));
    }

    public void sleep(SleepDuration hours) {

    }

    public String dogName(String breed) {
        Collar c = new Collar();
        return name = c.getName();
    }

    public static ArrayList<String> dogArray() {
        for (Object d : dogs) {
            dogs.add((String) d);
        }
        System.out.println(dogs);
        return dogs;
    }

    public ArrayList<String> getDogs() {
        ArrayList<String> retDogs = Dog.dogs;
        return dogs;
    }

        public static void main(String[] args){
            Dog Dog1Object = new Dog("Bulldog", "Small", "Light Gray", 5);
            Dog Dog2Object = new Dog("Beagle", "Medium", "Orange", 6);
            Dog Dog3Object = new Dog("German Shepard", "Large", "White & Orange", 6);
            Dog.dogArray();
            Dog1Object.eat("Small");
            Dog2Object.dogName("Bulldog");
        }
    }

