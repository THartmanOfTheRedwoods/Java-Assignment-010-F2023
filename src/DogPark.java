import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DogPark {

    private ArrayList<Dog> dogsInPark;

    public DogPark() {
        //this.dogsInPark = new HashSet<>();
        this.dogsInPark = new ArrayList<>();
    }

    public void play() {
/*
        for (Dog d : dogsInPark) {
            System.out.printf("Dog %s is ", d); //uses override method in Dog.java for `d`
            d.run();
        }
*/
        Dog d1 = dogsInPark.get(0);
        Dog d2 = dogsInPark.get(0);
        if (d1.equals(d2)) {
            System.out.printf("Dog %s is", d1);
            d1.run();
            System.out.printf("Dog %s is", d2);
            d2.run();
        }
    }

    public void dogEnter(Dog d) {
        dogsInPark.add(d);
    }

    public static void main(String[] args) {

        DogPark fortunaDp = new DogPark(); //Fortuna Dog Park

        Dog dog1Object = new Dog("Bulldog", DogSize.LARGE,
                new String[]{"light gray"}, 5, "Max");
        Dog dog2Object = new Dog("Beagle", DogSize.MEDIUM,
                new String[]{"Orange"}, 6, "Butch");
        Dog dog3Object = new Dog("German Shepherd", DogSize.XTRALARGE,
                new String[]{"White", "Orange"}, 6, "Kyle");

        fortunaDp.dogEnter(dog1Object);
        fortunaDp.dogEnter(dog2Object);
        fortunaDp.play();
        fortunaDp.dogEnter(dog3Object);
        fortunaDp.play();


    }

}
