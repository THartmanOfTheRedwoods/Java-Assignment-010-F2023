public class Food {
    public String name;
    public double caloricPounds;
    public boolean toxicityToDogs;

    public Food(String name, double caloricPounds, boolean toxicityToDogs) {
        this.name = name;
        this.caloricPounds = caloricPounds;
        this.toxicityToDogs = toxicityToDogs;
    }

    public static void main(String[] args) {
        Food chocolate = new Food("Chocolate", 0.1, true); // Toxic to dogs
        Food beef = new Food("Beef", 0.5, false);
        Food dogFood = new Food("Dog Food", 0.4, false);

        // Display information about the foods
        System.out.println("Foods:");
        System.out.println(chocolate.toString());
        System.out.println(beef.toString());
        System.out.println(dogFood.toString());
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Caloric Pounds: " + caloricPounds +
                ", Toxicity to Dogs: " + (toxicityToDogs ? "Yes" : "No");
    }
}
