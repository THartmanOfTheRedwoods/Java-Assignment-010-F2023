/**
 * @author Jenny Li
 * @Version 1.0
 * @date 4/14/24
 */
public class Dog {
    private String Breed;
    private String size;
    private String color;
    private int age;

    public Dog(String b, String s, String c, int a) {
        Breed = b;
        size = s;
        color = c;
        age = a;
    }

   static void eat(int Food, int Weight) {
        Food = 0;
        while (Food < 23) {
            System.out.println("eating, eating, eating...");
            Food++;
        }
        Weight = 90;
        if (Food >= 23) {
            Weight++;
            System.out.println("Has gained" + Weight);
        }

    }
    void run() {

    }

   static void sleep(int s) {
        s = 0;
        while (s < 8) {
            System.out.println("zzzzz...");
            s++;
        }
        if (s > 8) {
            System.out.println("Has energy");
        }
        else {
            System.out.println("Is tired");
        }

    }

    void name() {

    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bulldog","large", "light gray", 5 );
        Dog dog2 = new Dog("Beagle", "large", "orange", 6);
        Dog dog3 = new Dog("German Shepherd", "large", "white & orange", 6);

        System.out.println(dog1.Breed + " " + dog1.size + " " + dog1.color + " " + dog1.age);
        System.out.println(dog2.Breed + " " + dog2.size + " " + dog2.color + " " + dog2.age);
        System.out.println(dog3.Breed + " " + dog3.size + " " + dog3.color + " " + dog3.age);

       eat(23, 2);
       sleep(5);

    }
}