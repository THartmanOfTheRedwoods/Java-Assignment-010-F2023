import java.util.Scanner;

public class Dog {

    private String name;
    private String breed;
    private String[] color;
    private int age;
    private static String printTemplate =
            "Name: %s%nAge: %d%nBreed: %s%nColor: %s%n";


//    You should have a constructor that sets the initial state of the data members via passed parameters.
    public Dog (String name, int age, String breed, String[] color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        return;
    }

    public static String getName() {
        System.out.println("What this dog's name?");
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static int getAge() {
        return 5;
    }

    public static String getBreed(){
        return "Husky/GSD";
    }

    public static String[] getColor() {
        String[] color = {"black", "brown", "white"};
        return color;
    }

    public void eat() {
        return;
    }
    public void run() {
        return;
    }
    public void sleep() {
        return;
    }
    public void name() {
        return;
    }

    //    You should have a main method that creates the 3 Dog objects in the diagram.
    public static void main(String[] args) {

        Dog dog1 = new Dog(getName(), getAge(), getBreed(), getColor());
        System.out.printf(printTemplate, dog1.name, dog1.age, dog1.breed, dog1.color);          //scaffold

        Dog dog2;

        Dog dog3;
        return;
    }
//    Make at least 2 of your methods functional (i.e. perform some action)!!!
//    For Example: method eat might take a class parameter named Food (i.e. another class) that has a field weight, and your eat method might reduce the weight in Food.
}
