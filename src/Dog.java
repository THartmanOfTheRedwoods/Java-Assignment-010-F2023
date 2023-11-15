import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
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

        System.out.printf(printTemplate, name, age, breed, getColorString());          //scaffold

        return;
    }

    private static String getName() {
        System.out.println("What this dog's name?");
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    private static int getAge() {

        Scanner s = new Scanner(System.in);
        int age;

        do {
            System.out.print("Enter your dog's age: ");
            while (!s.hasNextInt()) {
                System.out.println("Invalid input. Enter a valid integer.");
                s.next();
            }
            age = s.nextInt();
        } while (age <= 0);

        return age;
//        return 5;
    }

    public static String getBreed(){
        Scanner s = new Scanner((System.in));
        System.out.print("Enter your dog's breed: ");
        return s.nextLine();
    }

    public static String[] getColor() {
        List<String> color = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter the colors of the dog (type 'F' to finish):");
        do {
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("F")) {
                color.add(input);
            }
        } while (!input.equalsIgnoreCase("F"));


        return color.toArray(new String[0]);
    }

    private static String getColorString() {
        StringBuilder colorstring = new StringBuilder();

        return colorstring.toString();
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

        Dog dog2 = new Dog(getName(), getAge(), getBreed(), getColor());

        Dog dog3 = new Dog(getName(), getAge(), getBreed(), getColor());
        return;
    }
//    Make at least 2 of your methods functional (i.e. perform some action)!!!
//    For Example: method eat might take a class parameter named Food (i.e. another class) that has a field weight, and your eat method might reduce the weight in Food.
}
