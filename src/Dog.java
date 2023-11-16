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
    public void Eat(Food food) {
        System.out.println("The "+ this.breed + " is eating "+ food.getName());

    }
    public void Run() {
        System.out.println("The "+ this.getBreed() + " is running");

    }
    public void Sleep() {
        System.out.println("The "+ this.getBreed() + " is sleeping");
    }
    public void Name() {

    }

    public String getColor() {
        return color;
    }
    public String getSize() {
        return size;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
}
