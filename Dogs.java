class Dogs {
    private String name;
    private String breed;
    private String size;
    private String color;
    private int age;
    private int energy;

    Dogs(String name, String breed, String size, String color, int age, int energy) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.energy = energy;
    }
    void Run() {
        energy -= 10;
        System.out.println(name + " is running and losing energy");
    }
    void Sleep() {
        energy += 20;
        System.out.println(name + " is sleeping and gaining energy");
    }
    void Eat(Food food) {
        energy += food.getWeight();
        System.out.println(name + " is eating and gaining energy");
    }
    String Name() {
        return name;
    }
    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Red", "Bulldog", "large", "light gray", 5, 50);
        Dogs dog2 = new Dogs("Wood", "Beagle", "large", "orange", 6, 60);
        Dogs dog3 = new Dogs("Tater", "German Shepherd", "large", "white and orange", 6, 70);
        dog1.Run();
        dog2.Sleep();
        dog3.Eat(new Food(15));
        System.out.println("Dog 1's name is: " + dog1.Name());
        System.out.println("Dog 2's name is: " + dog2.Name());
        System.out.println("Dog 3's name is: " + dog3.Name());
    }
}
class Food {
    private int weight;

    public Food(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
}