import java.util.ArrayList;

public class Dog {
    private String breed;
    public String size;
    private String color;
    private int age;
    public Dog Dog1Object;
    public Dog Dog2Object;
    public Dog Dog3Object;
  public static ArrayList<String> dogs = new ArrayList<>();

    public Dog(String breed, String size, String color, int age){
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }
    public String eat(String size){
        Food eaten = new Food();
        eaten.eat();
        return size;
    }
    public void run (Distance exercise){

    }
    public void sleep(SleepDuration hours){

    }
    public void name(Collar inspect){

    }
    /*public ArrayList<String> dogArray(){
        dogs.add(Dog1Object.toString());
        dogs.add(Dog2Object.toString());
        dogs.add(Dog3Object.toString());
        return dogs;
    }*/

    public static void main(String[] args) {
        Dog Dog1Object = new Dog("Bulldog", "Small", "Light Gray", 5);
        Dog Dog2Object = new Dog("Beagle", "Medium", "Orange", 6);
        Dog Dog3Object = new Dog("German Shepard", "Large", "White & Orange", 6);
        for(int i = 0; i < dogs.size(); i++) {
            String dog = dogs.get(i);
        }
        Dog1Object.eat("Small");
    }
}
