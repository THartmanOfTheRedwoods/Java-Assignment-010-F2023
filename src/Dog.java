import java.util.Random;



public class Dog {
   public enum SIZE {
        LARGE, MEDIUM, SMALL
    }
    private String breed;
    private SIZE size;
    private String color;
    private int age;


private Random rando = new Random();

    public void eat(Food food) {
        double foodQuantity = food.getFoodWeight();
        double foodToEat = switch(this.size){
            case LARGE ->
                foodToEat = Math.min(
                    rando.nextDouble (Math.min(0.75, foodQuantity),foodQuantity+0.1), foodQuantity
                    );
            case MEDIUM ->
                foodToEat = Math.min(
                    rando.nextDouble (Math.min(0.50, foodQuantity), foodQuantity+0.1),foodQuantity
                );

            case SMALL ->
                foodToEat = Math.min(
                    rando.nextDouble (Math.min(0.25,foodQuantity), foodQuantity+0.1),foodQuantity
                );

            default -> 0.0;
        };


        System.out.printf("Dog %s is eating %f kg of food. %n", getName(), foodToEat);
        food.setFoodWeight(foodQuantity - foodToEat);
        System.out.printf("There is %f kg of food left.%n",food.getFoodWeight());
    }
    public void run(){
        System.out.printf("Dog %s is running. %n", getName());
    }
    public void sleep(){
        System.out.printf("Dog %s is sleeping. %n", getName());
    }

    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Dog (String name, String breed, SIZE size, String color, int age){
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;

    }
    public Dog(String breed, SIZE size, String color, int age){
        this(null,breed,size,color,age);
    }

    public Dog(){
        this(null,null,null,null,-1);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public SIZE getSize() {
        return size;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
