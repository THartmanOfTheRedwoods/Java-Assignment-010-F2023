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
    private static final String[] filepath = {
            "Scripts/introduction Scripts.txt",
            "Scripts/name Scripts.txt",
            "Scripts/eat Scripts.txt",
            "Scripts/sleep Scripts.txt"
    }

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
            System.out.print("Enter your dog's age: ");
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
        System.out.println("Enter size");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arraySize.length; i++){
            System.out.printf("%d: \"%s\"%n", i + 1, arraySize[i]);
        }
        return arraySize[Integer.parseInt(s.nextLine()) - 1];          //modify to checksum the input
    }

    public static String setBreed(){
        Scanner s = new Scanner((System.in));
        System.out.print("Enter your dog's breed: ");
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
            if (i < color.length-2) {
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
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return randomScript;
    }

    public static String blurb(String script, Dog dog) {
        Pattern pattern = Pattern.compile("(NAME|BREED|SIZE|COLOR|AGE)");
        Matcher matcher = pattern.matcher(script);
        StringBuffer output = new StringBuffer();
        while (matcher.find()) {
            String stringMatch = matcher.group();
            switch (stringMatch) {
                case "NAME":
                    matcher.appendReplacement(output, dog.name);
                    break;
                case "BREED":
                    matcher.appendReplacement(output, dog.breed.toLowerCase());
                    break;
                case "SIZE":
                    matcher.appendReplacement(output, dog.size.toLowerCase());
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
        return output.toString();
    }

    private static void name() {
        return;
    }

    private static void run(Dog dog) {
        return;
    }
    private static String eat(Dog dog) {
        return blurb(getRandomScript(filepath[2]), dog);
    }

    public void sleep(Dog dog) {
        return;
    }


    public static void main(String[] args) {

        Dog dog1 = new Dog(setName(), setAge(), setSize(), setBreed(), setColor());
        Dog dog2 = new Dog(setName(), setAge(), setSize(), setBreed(), setColor());
        Dog dog3 = new Dog(setName(), setAge(), setSize(), setBreed(), setColor());

        eat(dog1);


        blurb(getRandomScript("Scripts/name Scripts.txt"), dog1);
        blurb(getRandomScript("Scripts/name Scripts.txt"), dog2);
        blurb(getRandomScript("Scripts/name Scripts.txt"), dog3);

        blurb(getRandomScript("Scripts/eat Scripts.txt"), dog1);
        blurb(getRandomScript("Scripts/eat Scripts.txt"), dog2);
        blurb(getRandomScript("Scripts/eat Scripts.txt"), dog3);

        blurb(getRandomScript("Scripts/sleep Scripts.txt"), dog1);
        blurb(getRandomScript("Scripts/sleep Scripts.txt"), dog2);
        blurb(getRandomScript("Scripts/sleep Scripts.txt"), dog3);

    }
}
