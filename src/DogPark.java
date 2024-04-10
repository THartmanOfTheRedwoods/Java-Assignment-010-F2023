import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DogPark {
    private List<Dog> dogsInPark;
    public DogPark(){
       // this.dogsInPark = new HashSet<>();
        this.dogsInPark= new ArrayList<>();

    }
    public void play(){
        /*
        for(Dog d : this.dogsInPark){
            System.out.printf("Dog %s is %n", d.toString());
           d.run();
        }
         */
        Dog d1 = dogsInPark.get(0);
        Dog d2 = dogsInPark.get(1);
        if(d1.equals(d2)){
            System.out.printf("Dog %s is %n", d1);
            d1.run();
            System.out.printf("Dog %s is %n", d2);
            d2.run();
        }

    }
    public void dogEnter(Dog d){
        dogsInPark.add(d);

    }
    public static void main(String[] args) {
        DogPark  fortunaDp= new DogPark();

        Dog dog1Object = new Dog("Bulldog", DogSize.MEDIUM, new String[]{"light gray"}, 5,"Fide");
        Dog dog2Object = new Dog("Beagle", DogSize.MEDIUM, new String[]{"orange"}, 6,"Max");
        Dog dog3Object = new Dog("German Shepherd",DogSize.XTRALARGE, new String[]{"white", " orange"}, 6, "Rax");


        fortunaDp.dogEnter(dog1Object);
        fortunaDp.dogEnter(dog2Object);
        fortunaDp.play();
        fortunaDp.dogEnter(dog3Object);
        fortunaDp.play();

    }
}
