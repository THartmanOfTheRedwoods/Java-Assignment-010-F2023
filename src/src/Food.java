public class Food {
    private String name;
    private double weight;

    public Food(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void consume(double amount) {
        if (amount > 0 && amount <= weight) {
            weight -= amount;
            System.out.println(name + " consumed. Remaining weight: " + weight + " grams.");
        } else {
            System.out.println("Invalid amount to consume.");
        }
    }
}

