public class Dog {
    private String name;
    private int age;
    private double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void eat(Food food) {
        this.weight += food.getWeight();
        food.setWeight(0);
    }
    public void run() {
    }
    public void sleep() {
    }
    public String getName(){
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fido", 5, 20.0);
        Dog dog2 = new Dog("Rex", 7, 25.0);
        Dog dog3 = new Dog("Spot", 3, 15.0);

        Food food = new Food(5);
        dog1.eat(food);
    }
}
class food {
    private double weight;

    public Food(double weight){
        this.weight = weight;
    }
    public double getWeight() {
        retunr this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}