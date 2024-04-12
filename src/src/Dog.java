public class Dog {

    private String name;
    private String breed;
    private String size;
    private double weight;
    private String color;
    private int age;
    private dogOwner owner;

    Dog (String n, String b, String s, double w, String c, int a, dogOwner o){
        name = n;
        breed = b;
        size = s;
        weight = w;
        color = c;
        age = a;
        owner = o;
    }

    void displayDog(){
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Color: " + color);
        System.out.println("Age: " + age + " years");
    }

    public void eat(Food food){
        System.out.println(name + " is eating " + food.getWeight() + " grams of " + food.getName());
        food.consume(50);
    }

    public void run(){
        System.out.println(name + " is running.");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String theName(){
        return name;
    }

    public dogOwner getOwner() {
        return owner;
    }

    public static void main(String[] args){
        dogOwner owner1 = new dogOwner ("Lebron James", "123-456-7890");
        dogOwner owner2 = new dogOwner ("Shaquille O'neil", "111-111-1111");
        dogOwner owner3 = new dogOwner ("Stephen Curry", "098-765-4321");

        Dog dog1 = new Dog ("Max","Bulldog", "Large", 45.5, "Light Gray", 5, owner1);
        Dog dog2 = new Dog ("Charlie", "Beagle", "Large", 35.0, "Orange", 6, owner2);
        Dog dog3 = new Dog ("Ace", "German Shepherd", "Large", 85.0, "White and Orange", 6, owner3);

        Food kibble = new Food ("Dog Kibble", 200);



        dog1.displayDog();
        dog1.eat(kibble);
        System.out.println("Owner: " + dog1.getOwner().getName() + ", Phone Number: " + dog1.getOwner().getContactNumber());
        System.out.println();
        dog2.displayDog();
        dog2.eat(kibble);
        System.out.println("Owner: " + dog2.getOwner().getName() + ", Phone Number: " + dog2.getOwner().getContactNumber());
        System.out.println();
        dog3.displayDog();
        dog3.eat(kibble);
        System.out.println("Owner: " + dog3.getOwner().getName() + ", Phone Number: " + dog3.getOwner().getContactNumber());
    }
}
