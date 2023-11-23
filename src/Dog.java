import java.util.ArrayList;
public class Dog {
    private String breed;
    private String size;
    private String color;
    private int age;
    public Dog[] dogs;
    public static String food;
    public static String exercise;
    public static String shutEye;
    public static String collar;

    public Dog(String breed, String size, String color, int age){
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        //this.dogs = dogs;
    }

    public String getBreed(){
        return breed;
    }
    public String getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
    public static void eat(Dog[] dogs) {
        for(Dog d : dogs){
            if (d.getSize().equals("Small")){
                food = "1 cup of food";
            }if (d.getSize().equals("Medium")){
                food = "3 cups of food";
            }if (d.getSize().equals("Large")){
                food = "5 cups of food";
            }
            System.out.printf("Dog %s has eaten %s\n", d.getBreed(), food);
        }
    }
    public static void run(Dog[] dogs){
        for (Dog d : dogs){
            if (d.getSize().equals("Small")) {
                exercise = "An energetic 3 miles";
            }
            if (d.getSize().equals("Medium")) {
                exercise = "A brisk 5 miles";
            }
            if (d.getSize().equals("Large")) {
                exercise = "7 miles with intermitten breaks and lots of panting";
            }
            System.out.printf("Dog %s has run %s\n", d.getBreed(), exercise);
        }
    }
    public static void sleep(Dog[] dogs){
        for (Dog d : dogs){
            if (d.getSize().equals("Small")) {
                shutEye = "14 - 16 hours today";
            }
            if (d.getSize().equals("Medium")) {
                shutEye = "10 - 14 hours today";
            }
            if (d.getSize().equals("Large")) {
                shutEye = "18 hours today";
            }
            System.out.printf("Dog %s has slept %s\n", d.getBreed(), shutEye);
        }
    }
    public static void name(Dog[] dogs){
        for (Dog d : dogs){
            if (d.getBreed().equals("Bulldog")) {
                collar = "Crook";
            }
            if (d.getBreed().equals("Beagle")) {
                collar = "Snoopy";
            }
            if (d.getBreed().equals("German Shepard")) {
                collar = "Biscuit";
            }
            System.out.printf("Dog %s has a collar, on the collar it says it's name is %s\n", d.getBreed(), collar);
        }
    }
    public static void main(String[] args) {
        Dog Dog1Object = new Dog("Bulldog", "Small", "Light Gray", 5);
        Dog Dog2Object = new Dog("Beagle", "Medium", "Orange", 6);
        Dog Dog3Object = new Dog("German Shepard", "Large", "White & Orange", 6);
        Dog[] dogs = {Dog1Object, Dog2Object, Dog3Object};
        name(dogs);
        eat(dogs);
        run(dogs);
        sleep(dogs);
    }
}
