//import java.lang.reflect.Array;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dog {

    private final String name;
    private final String breed;
    private final String size;
    private final String[] color;
    private final int age;
    private static final String divider = "****************************************\n";
    private static final String[] filepath = {
            "Scripts/introduction Scripts.txt",
            "Scripts/name Scripts.txt",
            "Scripts/run Scripts.txt",
            "Scripts/eat Scripts.txt",
            "Scripts/sleep Scripts.txt"
    };

    private static final String[] dogActions = {
            "Call name",
            "Run",
            "Eat",
            "Sleep"
    };

    private static final String errMessage = "Invalid Selection";
    private static final String[] again = {
            "Would you like to interact with another dog?",
            "Choose Another dog",
            "Go Home"
    };

    public Dog (String name, int age, String size, String breed, String[] color) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.breed = breed;
        this.color = color;
    }

    private static String setName() {
        System.out.println("What this dog's name?");
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    private static int setAge() {
        Scanner s = new Scanner(System.in);
        int age;
        do {
            System.out.print(divider + "Enter your dog's age: ");
            while (!s.hasNextInt()) {
                System.out.println("Invalid input. Enter a valid integer.");
                s.next();
            }
            age = s.nextInt();
        } while (age <= 0);
        return age;
    }

    public static String setSize() {
        String[] arraySize= {"Small", "Medium", "Large"};
        System.out.println(divider + "Enter size");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arraySize.length; i++){
            System.out.printf("%d: \"%s\"%n", i + 1, arraySize[i]);
        }
        return arraySize[Integer.parseInt(s.nextLine()) - 1];          //modify to checksum the input
    }

    public static String setBreed(){
        Scanner s = new Scanner((System.in));
        System.out.print(divider + "Enter your dog's breed: ");
        return s.nextLine();
    }

    public static String[] setColor() {
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
            if (i < color.length - 2) {
                colorString.append(", ");
            } else if (i == color.length - 2) {
                colorString.append(", and ");
            }
        }
        return colorString.toString();
    }
    public static String getRandomScript(String scriptPath) {
        String randomScript;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(scriptPath))) {
            String line;
            List<String> lines = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            Random random = new Random();
            int randomIndex = random.nextInt(lines.size());
            randomScript = lines.get(randomIndex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return randomScript;
    }

    public static String blurb(String script, Dog dog) {
        Pattern pattern = Pattern.compile("(NAME|BREED|SIZE|COLOR|AGE)");
        Matcher matcher = pattern.matcher(script);
        StringBuilder output = new StringBuilder();
        while (matcher.find()) {
            String stringMatch = matcher.group();
            switch (stringMatch) {
                case "NAME" -> matcher.appendReplacement(output, dog.name);
                case "BREED" -> matcher.appendReplacement(output, dog.breed.toLowerCase());
                case "SIZE" -> matcher.appendReplacement(output, dog.size.toLowerCase());
                case "COLOR" -> matcher.appendReplacement(output, getColorString(dog.color));
                case "AGE" -> matcher.appendReplacement(output, String.valueOf(dog.age));
                default -> {
                }
            }
        }
        matcher.appendTail(output);
        return output.toString();
    }

    private static void introduction(Dog[] dogs) {
        for (Dog dog : dogs) {
            System.out.println(blurb(getRandomScript(filepath[0]), dog));
        }
        System.out.println("\nI see you have brought a new club member...\n");
        System.out.print(divider);
    }

    private static String introduction(Dog dog) {
        return blurb(getRandomScript(filepath[0]), dog);
    }

    private static String name(Dog dog) {
        return blurb(getRandomScript(filepath[1]), dog);
    }

    private static String run(Dog dog) {
        return blurb(getRandomScript(filepath[2]), dog);
    }

    private static String eat(Dog dog) {
        return blurb(getRandomScript(filepath[3]), dog);
    }

    private static String sleep(Dog dog) {
        return blurb(getRandomScript(filepath[4]), dog);
    }

    private static void openingScript() {
        System.out.print(divider + divider);
        String openingScript1 = String.format("%s%n", "Welcome to \"Bark-icus\"");
        String openingScript2 = String.format("%40s%n", "The Premier Dog Club");
        System.out.printf("%s%n%s", openingScript1, openingScript2);
        System.out.print(divider + divider);
        System.out.print("First off,\n        please meet Top Dogs\n                          of \"Bark-icus\"\n");
        System.out.println(divider);
    }

    public static int printDogNames (Dog[] dogs) {
        Scanner s = new Scanner(System.in);
        System.out.println(divider + "Select a dog to interact with?");

        for (int i = 0; i < dogs.length; i++) {
            System.out.printf("%d: %s%n", i + 1, dogs[i].name);
        }
        return Integer.parseInt(s.nextLine());
    }

    public static int printDogActions (String dogName) {
        Scanner s = new Scanner(System.in);
        System.out.printf(divider + "Select an action for %s%n", dogName);

        for (int i = 0; i < dogActions.length; i++) {
            System.out.printf("%d: %s%n", i + 1, dogActions[i]);
        }
        return Integer.parseInt(s.nextLine());
    }

    public static void selectAction(Dog dog){
        boolean repeatProgram = true;
        boolean invalidInput;
        do {
            invalidInput = false;
            switch (printDogActions(dog.name)) {
                case 1 -> System.out.println(divider + name(dog));
                case 2 -> System.out.println(run(dog));
                case 3 -> System.out.println(eat(dog));
                case 4 -> System.out.println(sleep(dog));
                default -> {
                    System.out.println(errMessage);
                    invalidInput = true;
                }
            }
        } while (invalidInput);
        System.out.println(divider);
    }

    public static Dog selectDog(Dog[] dogs){
        Dog dog = null;
        boolean repeatProgram = true;
            boolean invalidInput;
            do {
                invalidInput = false;
                switch (printDogNames(dogs)) {
                    case 1 -> dog = dogs[0];
                    case 2 -> dog = dogs[1];
                    case 3 -> dog = dogs[2];
                    case 4 -> dog = dogs[3];
                    default -> {
                        System.out.println(errMessage);
                        invalidInput = true;
                    }
                }
            } while (invalidInput);
        return dog;
    }

    public static boolean again(){
        Scanner s = new Scanner(System.in);
        boolean repeatProgram = true;
        boolean invalidInput;
        int userAgain;
        do {
            invalidInput = false;
            System.out.println(again[0]);
            for (int i = 1; i < again.length; i++) {
                System.out.printf("%d: %s%n", i, again[i]);
            }
            userAgain = Integer.parseInt(s.nextLine());
            switch (userAgain) {
                case 1 -> {}
                case 2 -> repeatProgram = false;
                default -> {
                    System.out.println(errMessage);
                    invalidInput = true;
                }
            }
        } while (invalidInput);
        return repeatProgram;
    }

    public static void main(String[] args) {
        openingScript();
        List<Dog> dogs = new ArrayList<>();
        dogs.add(0, new Dog("Bully", 5, "large", "Bulldog", new String[]{"light gray"}));
        dogs.add(1, new Dog("Regal", 6, "large", "Beagle", new String[]{"orange"}));
        dogs.add(2, new Dog("Herman Eberhardt", 6, "large", "German Shepherd", new String[]{"white", "orange"}));
        introduction(dogs.toArray(new Dog[0]));
        dogs.add(3, new Dog(setName(), setAge(), setSize(), setBreed(), setColor()));
        introduction(dogs.get(3));
        do {
            selectAction(selectDog(dogs.toArray(new Dog[0])));
        } while(again());

    }
}