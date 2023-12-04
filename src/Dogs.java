public class Dogs {
    private String breed;
    private String size;
    private String colour;
    private int age;
    private boolean hunger;

    public Dogs(String breed, String size, String colour, int age) {
        this.breed = breed;
        this.size = size;
        this.colour = colour;
        this.age = age;
    }

    public void eat(){
        System.out.println("The " + breed + " eats some food and is not hungry anymore");
        hunger = false;
    }

    public void run(){

    }

    public void sleep(){
        System.out.println("The " + breed + " falls asleep and wakes up hours later");
        hunger = true;
    }

    public void name(){

    }

    public void isHungry(){
        if(hunger) {
            System.out.println("The " + breed + " Is feeling Hungry");
        }
        else {
            System.out.println("The " + breed + " Is Not Hungry and is Feeling Energized");
        }
    }
    public static void main(String[]args) {
        Dogs Dog1Object = new Dogs("Bulldog", "large", "light gray", 5);
        Dogs Dog2Object = new Dogs("Beagle", "large", "orange", 6);
        Dogs Dog3Object = new Dogs("German Shepard", "large", "white and orange", 6);
        Dog1Object.eat();
        Dog1Object.isHungry();
        Dog2Object.sleep();
        Dog2Object.isHungry();
    }
}