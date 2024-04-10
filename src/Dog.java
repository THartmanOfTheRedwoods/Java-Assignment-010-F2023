import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Dog {
    private String breed;
    private DogSize size;
    private List<String> color;
    private int age;



    private String name;

    public Dog(String breed, DogSize size, String[] color, int age, String name) {
        this.breed = breed;
        this.size = size;
        this.color= new ArrayList<>();
        for (int i = 0; i< color.length;i++ ){
            this.color.add(color[i]);
        }
        this.age = age;
        this.name = name;
    }

    public void eat(String food) {

    }

    public void run() {
        Random r = new Random();
        System.out.printf("Running at speed %d%n", r.nextInt());
    }

    public void sleep() {

    }
    @Override
    public String toString(){
      return  this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o){
        Dog other = (Dog)o;
        return  this.size == other.size;
    }


    public static void main(String[] args) {
        Dog dog1Object = new Dog("Bulldog", DogSize.MEDIUM, new String[]{"light gray"}, 5,"Fide");
        Dog dog2Object = new Dog("Beagle", DogSize.MEDIUM, new String[]{"orange"}, 6,"Max");
        Dog dog3Object = new Dog("German Shepherd",DogSize.XTRALARGE, new String[]{"white", " orange"}, 6, "Rax");


    }
}
