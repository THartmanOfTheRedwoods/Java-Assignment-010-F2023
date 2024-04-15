class Dog {
    private String name;
    private int age;
    private String breed;
    private String size;
    private double weight;
    private String colour;

    public Dog(String name, int age, String breed, String size, double weight, String colour) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.size = size;
        this.weight = weight;
        this.colour = colour;
    }

    public void dogBio() {
        System.out.println(name + " is a " + size + " sized " + colour + " " + breed + ", who is currently " + age + " years old");
    }

    // update the size of the dog based on weight. 1-9 small, 10-19 medium, 20+ large
    public void updateSize() {
        String lastSize = size;
        if (weight < 10.0) {
            size = "small";
        } else if (weight < 20.0) {
            size = "medium";
        } else {
            size = "large";
        }
        // print update if size changes
        if (!(size.equals(lastSize))) {
            System.out.println(name + " is now a " + size + " dog");
        }
    }

    // apply given number as a change in weight, negative numbers are subtractive.
    // we only change weight if dog is over 5 pounds and under 50 to prevent unrealistic circumstances.
    public void changeWeight(double caloricPounds) {
        if (weight >= 50.0) {
            System.out.println(name + " is overweight!");
        }
        else if (weight >= 5.0) {
            weight += caloricPounds;
            updateSize();
        } else {
            System.out.println(name + " is underweight!");
        }
    }

    public void eat(Food food) {
        System.out.println(name + " is eating " + food.name);
        if (food.toxicityToDogs) {
            System.out.println(food.name + " was toxic, " + name + " has died.");
            die();
        } else {
            changeWeight(food.caloricPounds);
        }
    }

    // I don't know how to delete an object in java
    public void die() {
        // this = null;  does not work, I would have to pass the object reference through eat() and to die() and set that to null.
        // this was just an extra bit for fun, I am going to end the assignment here.
    }

    public void run() {
        System.out.println(name + " is running");

        // we run changeWeight to update weight loss from running. Here they lose 1 pound.
        // we could take in distance and use that to decide how much weight they lose.
        changeWeight(-1);
    }


    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void setName(String newName) {
        System.out.print(name);
        this.name = newName;
        System.out.println("'s name has been changed to: " + newName);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 5, "Bulldog", "medium", 19.5, "light gray");
        Dog dog2 = new Dog("Max", 6, "Beagle", "medium", 10.0, "orange");
        Dog dog3 = new Dog("Bella", 6, "German Shepherd", "large", 25.0, "white & orange");

        Food chocolate = new Food("Chocolate", 0.1, true); // Toxic to dogs
        Food beef = new Food("Beef", 0.5, false);
        Food dogFood = new Food("Dog Food", 0.4, false);

        dog1.dogBio();
        dog2.dogBio();
        dog3.dogBio();

        dog1.eat(beef);
        dog2.run();
        dog3.eat(dogFood);
        dog3.sleep();

        dog1.setName("Charlie");
        dog1.eat(chocolate);
    }
}
