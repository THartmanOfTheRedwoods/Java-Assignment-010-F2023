class Food {
    static int foodAmount;

    Food(int foodAmount) {
        Food.foodAmount = foodAmount;
    }
}

class Energy {
    int energyAmount;

    Energy(int energyAmount) {
        this.energyAmount = energyAmount;
    }
}

public class Dog {

    private String breed;
    private String size;
    private String color;
    private int age;

    private Food food = new Food(5);
    private Energy energy;
    private String name;

    public Dog(String breed, String size, String color, int age, Energy energy) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.energy = energy;
        // I included energy here so that each dog can use energy without affecting the other dogs energy values, but if one dog eats it reduces the amount of food they all can eat.
    }

    void name(String name) {
        this.name = name;
        System.out.println("It's name is " + name);
    }

    void eat() {
        if (Food.foodAmount > 0) {
            Food.foodAmount--;
            energy.energyAmount++;
            System.out.println(name + " is eating.");
        } else {
            System.out.println("Ran out of food! Time to go to the store!");
        }
    }

    void run() {
        if (energy.energyAmount > 0) {
            energy.energyAmount--;
            System.out.println(name + " is running.");
        } else {
            System.out.println(name + " is too tuckered out.");
        }
    }

    void sleep() {
        energy.energyAmount++;
        System.out.println(name + " is sleeping.");
    }

    public String toString() {
        return "This dog is a " + this.breed + ", it's " + this.size + " in size, it's " + this.color + ", and it's " + this.age + " years old.";
    }

    public static void main(String[] args) {
        Dog Dog1 = new Dog("Bulldog", "Medium","Light Gray",5,new Energy(5));
        Dog Dog2 = new Dog("Beagle", "Small","Orange",6,new Energy(5));
        Dog Dog3 = new Dog("German Shepherd", "Large","White & Orange",6,new Energy(5));

        System.out.println(Dog1);
        Dog1.name("Rufus");
        Dog1.eat();

        System.out.println(Dog2);
        Dog2.name("Snoopy");
        Dog2.run();

        System.out.println(Dog3);
        Dog3.name("Odin");
        Dog3.sleep();
    }
}
