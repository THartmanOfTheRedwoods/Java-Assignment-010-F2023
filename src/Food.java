public class Food {

    private int weight;

    public Food(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void decreaseWeight(int amount) {
        weight -= amount;
    }}