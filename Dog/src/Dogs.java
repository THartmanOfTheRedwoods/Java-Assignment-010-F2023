import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Dogs implements Canine {
    String breed;
    String size;
    String colour;
    int age;
    static Scanner s = new Scanner(System.in);
    static String yourDog;
    static Random randomGenerator = new Random();
    static int rando = randomGenerator.nextInt(1, 10);

    public static String bReed = Breed();
   public static String sIze = Size();
    public static String cOlour = Colour();
   public static int aGe = rando;
    public Dogs(String bReed, String sIze, String cOlour, int aGe) {



        System.out.printf("Your dog is a %s, %s, %s, and %d years old.\n", bReed, sIze, cOlour, aGe);


        yourDog = "your dog";
        while (true) {
            int var = printMenu();
            switch (var) {
                case 1:
                    Eat();

                    break;
                case 2:

                    Run();

                    break;

                case 3:
                    Sleep();

                    break;

                case 4:
                    name();

                    break;

                case 5:
                    System.exit(0);

            }

        }
    }
    public static int printMenu() {
        System.out.printf("\n1) Give %s food \n2) Tell %s to run " +
                "\n3) Tell %s to sleep \n4) Name %s \n5) Quit\n", yourDog,yourDog,yourDog,yourDog);

        return parseInt(s.nextLine());
    }


    public void Eat(){
        System.out.println("How much food would you like to give " + yourDog + "?");
        int ate = parseInt(s.nextLine());
        while (ate>8){
            System.out.println("That's too much food! Try again!");
            ate = parseInt(s.nextLine());
        }
        System.out.printf("%s ate %d cup(s) of soft food. Delicious!\n", yourDog, ate);
    }
public void Run(){
    System.out.printf("How many laps would you like %s to run?\n", yourDog);
    int ate = parseInt(s.nextLine());
    while (ate>8){
        System.out.println("That's too much running! Try again!");
        ate = parseInt(s.nextLine());
    }
    System.out.printf("%s ran %d laps around the yard! What a good dog!\n", yourDog, ate);
}
public void Sleep(){
    System.out.printf("%s slept for %d hours. What a good dog!", yourDog, rando);

}
public void name(){
    System.out.printf("What would you like to name %s?\n", yourDog);
yourDog = s.nextLine();
    System.out.printf("Congrats! Your dog is now %s!", yourDog);
}

public static String Breed() {
    while (true) {
        switch (rando) {
            case 1: {

                return "Golden Retriever";

            }
            case 2: {
                return "Bulldog";
            }
            case 3: {
                return "Mastiff";

            }
            case 4: {
                return "Corgi";

            }
            case 5: {
                return "Bloodhound";

            }
            case 6: {
                return "Poodle";

            }
            case 7: {
                return "Saint Bernard";

            }
            case 8: {
                return "Beagle";

            }
            case 9: {
                return "German Shepard";

            }
            case 10: {
                return "Pug";

            }
            default:
                throw new IllegalStateException("Unexpected value: " + rando);
        }
    }
}



    public static String Size() {
        if (rando % 2 == 0) {
            return "Large";
        }
        return "Small";
    }
    public static String Colour() {
        while (true) {
            switch (rando) {
                case 1: {

                    return "Golden";

                }
                case 2, 8: {
                    return "Dirt";
                }
                case 3: {
                    return "White and Orange";

                }
                case 4: {
                    return "Light Gray";

                }
                case 5: {
                    return "Orange";

                }
                case 6, 9: {
                    return "Pure White";

                }
                case 7,10: {
                    return "Brown with White Splotches";

                }
                default:
                    throw new IllegalStateException("Unexpected value: " + rando);
            }
        }
    }
/*
Okay, so here's the thing... This COULD create the three dogs in the example. It doesn't create all three.
And it doesn't create them all at once, but... I think this is better than what you are asking for, so honestly? It's fine and good
I hope you play with this a little bit, because I spent hours on something I thought would be fun. Thanks! :)
 */
public static void main(String[]args){
 Dogs doggo = new Dogs(bReed, sIze, cOlour, aGe);

}}