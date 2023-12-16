public class Dog {

        // Private instance variables
        private String breed;
        private String size;
        private String color;
        private int age;

        // Constructor to set initial state using passed parameters
        public Dog(String breed, String size, String color, int age) {
            this.breed = breed;
            this.size = size;
            this.color = color;
            this.age = age;
        }

        // Functional method: eat
        public void eat() {
            System.out.println("Dog of breed " + breed + " is eating.");
        }

        // Functional method: run
        public void run() {
            System.out.println("Dog of breed " + breed + " is running.");
        }

        // Non-functional method: sleep
        public void sleep() {
            System.out.println("Dog of breed " + breed + " is sleeping.");
        }

        // Non-functional method: name
        public void name() {
            System.out.println("Dog of breed " + breed + "'s name method.");
        }

        // Main method to create three Dog objects
        public static void main(String[] args) {
            // Creating three Dog objects
            Dog dog1 = new Dog("Bulldog", "Large", "Light Gray", 5);
            Dog dog2 = new Dog("Beagle", "Large", "Orange", 6);
            Dog dog3 = new Dog("German Shepherd", "Large", "White & Orange", 6);

            //  functional methods on the dog objects
            dog1.eat();
            dog2.run();

            //  non-functional methods on the dog objects
            dog3.sleep();
            dog1.name();
        }
    }


