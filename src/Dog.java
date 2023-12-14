import  java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Trevor Hartman
 * @author MJ Fracess
 *
 * @since Version beta
 */
public class Dog {
    //instance variables
    private String breed;
    private String size;
    private List<String> colors;
    private int age; //age in years
    private String name;

//constructor
    Dog(String n,String b, String s, List<String> c, int a){
        this.name = n;
        this.breed = b;
        this.size = s;
        this.colors = c;
        this.age = a;

    }

//instance methods
    void eat(){
        System.out.println(breed+ " is eating");
    }
    void run(){
        if (colors.contains("orange")) {
            System.out.println("The " +breed + " is running.");
        } else {
            System.out.println("The" + breed + " doesn't run because it's hungry.");
        }
    }
    void sleep(){

}
     String getName(){
        return name;
    }
/*public String toString(){
   return String.format("""
           Dog{
           name:%s
           breed:%s
           colors:%s
           size:%s
           age:%d}
           """,name, breed, Arrays.toString(colors.toArray()),size, age);
   } A toString Method for de bugging the List I created and was referencing the wrong colors
 */

    public static void main(String[] args) {

       List<String> colors = new ArrayList<>();
       colors.add("light grey");
        colors.add("orange");
        colors.add("white");

        Dog obj1 = new Dog("Fido","Bulldog","large",colors.subList(0,1), 5);
        Dog obj2 = new Dog("Spud","Beagle","large",colors.subList(1,2),6);
        Dog obj3 = new Dog("Fred","German Shepherd","large",colors.subList(1,3),6);
        //System.out.printf("%s%n%s%n%s%n",obj1,obj2,obj3); - To debug issue with color list
        obj3.run();
        obj2.run();
        obj1.run();
        obj1.eat();
        String dog1 = obj1.getName();
        System.out.printf("The dogs name is " + dog1);

    }
}
