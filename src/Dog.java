public class Dog {
    private String breed;
    private String name;
    private double weight;
    private int age;
    public Dog(String name, double weight, String breed, int age) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
        this.age = age;
    }
    public void eat(double amount) {
        weight += amount;
        System.out.println(name + " Ate: " + amount + " plates of food.");
    }
    public void run(int minutes) {
        System.out.println(name + " Ran: " + minutes + " minutes.");
    }
    public void sleep(int hours) {
        System.out.println(name + "Slept : " + hours + " hours.");
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", 50.0, "Saint Bernard", 3);
        Dog dog2 = new Dog("Palomo", 30.0, "French Bulldog", 5);
        Dog dog3 = new Dog("Unc", 25.0, "Rottweiler", 2);

        dog1.eat(3);
        dog2.run(15);
        dog3.sleep(8);
    }
}

