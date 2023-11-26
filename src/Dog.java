import java.util.Random;


public class Dog {
    private String breed;
    private String Size;
    private String color;
    private double age;
    private String name;  //dogs name
    private Random rand = new Random();


    public Dog(String name, String breed, String Size, String color, double age){
        this.breed = breed;
        this.Size = Size;
        this.color = color;
        this.age = age;
        this.name = name;
        this.rand = new Random();
    }

    public Dog(String breed, String size, String color, double age){
        this(null, breed, size, color, age);
    }

    public Dog(){
        this(null, null, null, null, 1.0);
    }


    public void Eat(Food food){
        double foodLeft;
        double foodDogEats = Math.min(
                rand.nextDouble(0.0, Food.getWeight()+1),
                Food.getWeight()
        );
        foodLeft = 1 - foodDogEats;
        System.out.printf("%s ate %fkgs of food.%n", getName(), foodDogEats);
        System.out.printf("there is %s out of 1kg of food left%n", foodLeft);

    }
    public void Run(Ran ran){
        double howLong = rand.nextDouble(ran.minutesRan);

        System.out.printf("%s ran %f minutes. %n%n",getName(), howLong);

        }

    private void Sleep(){
        System.out.printf("dog %s is Sleeping %n", this.name);
    }
    public String getName(){
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBread(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }
}
