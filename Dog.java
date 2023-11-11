//Man I don't know why but this code wont run here, I tried it in a different file and it will run there but here it
//just wont run. I think it has to do with the runtime configuration but i don't know. I tried to find out for
// like an hour but I still cant find out why it wont run here.
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

    public void eat(Food food) {
        System.out.println(this.breed + " is eating " + food.getName());
        food.setWeight(food.getWeight() - 10);
    }

    public void run() {
        System.out.println(this.breed + " is running");
    }

    public void sleep() {
        System.out.println(this.breed + " is sleeping");
    }

    public String name() {
        switch (this.breed) {
            case "bulldog":
                return "Buddy";
            case "beagle":
                return "Bailey";
            case "German shepherd":
                return "Max";
            default:
                return "Unknown";
        }
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("bulldog", "large", "light gray", 5);
        Dog dog2 = new Dog("beagle", "large", "orange", 6);
        Dog dog3 = new Dog("German shepherd", "large", "white and orange", 6);

        Food food = new Food("kibble", 100);

        System.out.println(dog1.name() + " is a " + dog1.size + " " + dog1.color + " " + dog1.breed + " and is " + dog1.age + " years old");
        dog1.eat(food);
        System.out.println("The food weight is now " + food.getWeight() + " grams");
        dog1.run();
        dog1.sleep();

        System.out.println(dog2.name() + " is a " + dog2.size + " " + dog2.color + " " + dog2.breed + " and is " + dog2.age + " years old");
        dog2.eat(food);
        System.out.println("The food weight is now " + food.getWeight() + " grams");
        dog2.run();
        dog2.sleep();

        System.out.println(dog3.name() + " is a " + dog3.size + " " + dog3.color + " " + dog3.breed + " and is " + dog3.age + " years old");
        dog3.eat(food);
        System.out.println("The food weight is now " + food.getWeight() + " grams");
        dog3.run();
        dog3.sleep();
    }
}

class Food {

    private String name;
    private int weight;

    public Food(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }
}