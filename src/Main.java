public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bulldog", "large","light gray",12);
        Dog dog2 = new Dog("Beagle","large", "orange", 6);
        Dog dog3 = new Dog("German Shepherd","large","white & orange", 6);
        dog1.Run();
        Food food1 = new Food("pizza");
        dog2.Eat(food1);
        dog3.Sleep();

    }
}
