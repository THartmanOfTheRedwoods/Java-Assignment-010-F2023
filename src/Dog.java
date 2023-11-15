//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dog {

    private String name;
    private String breed;
    private String size;
    private String[] color;
    private int age;
    private static String printTemplate =
            "Name: %s%nAge: %d%nBreed: %s%nColor: %s%n";
    private static String temp = "My service dog is a SIZE BREED named NAME. He is AGE year old, and has COLOR fur.";


    public Dog (String name, int age, String size, String breed, String[] color) {

        this.name = name;
        this.age = age;
        this.size = size;
        this.breed = breed;
        this.color = color;

        System.out.printf(printTemplate, name, age, breed, getColorString(color));          //scaffold
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
    }

    public static String getSize() {
        String[] arraySize= {"Small", "Medium", "Large"};
        System.out.println("Enter size");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arraySize.length; i++){               //for loop copied from getNumbers method::Assignment009
            System.out.printf("%d: \"%s\"%n", i + 1, arraySize[i]);
        }
        return arraySize[Integer.parseInt(s.nextLine()) - 1];          //modify to checksum the input
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

    public static String getColorString(String[] color) {       //What is the significance of @notNull???
        StringBuilder colorString = new StringBuilder();
        for (int i = 0; i < color.length; i++) {
            colorString.append(color[i]);
            if (i < color.length-2) {
                colorString.append(", ");
            } else if (i == color.length - 2) {
                colorString.append(", and ");
            }
        }
        return colorString.toString();
    }

    public static void blurb(String temp, Dog dog) {
        Pattern pattern = Pattern.compile("(NAME|BREED|SIZE|COLOR|AGE)");
        Matcher matcher = pattern.matcher(temp);

        StringBuffer output = new StringBuffer();
        while (matcher.find()) {
            String stringMatch = matcher.group();
            switch (stringMatch) {
                case "NAME":
                    matcher.appendReplacement(output, dog.name);
                    break;
                case "BREED":
                    matcher.appendReplacement(output, dog.breed);
                    break;
                case "SIZE":
                    matcher.appendReplacement(output, dog.size);
                    break;
                case "COLOR":
                    matcher.appendReplacement(output, getColorString(dog.color));
                    break;
                case "AGE":
                    matcher.appendReplacement(output, String.valueOf(dog.age));
                    break;
                default:
                    break;
            }
        }
        matcher.appendTail(output);
        System.out.println(output);
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

        Dog dog1 = new Dog(getName(), getAge(), getSize(), getBreed(), getColor());

//        Dog dog2 = new Dog(getName(), getAge(), getSize(), getBreed(), getColor());

//        Dog dog3 = new Dog(getName(), getAge(), getSize(), getBreed(), getColor());

        blurb(temp, dog1);

    }
}
