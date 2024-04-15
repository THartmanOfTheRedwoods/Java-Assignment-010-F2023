import java.util.ArrayList;
import java.util.List;
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
        this.color = new ArrayList<>();
        for (int i=0; i<color.length; i++) {
            this.color.add(color[i]);
        }
        this.age = age;
        this.name = name;
    }

    public void eat() {

    }

    public void run() {
        Random r = new Random();
        System.out.printf("Running at speed %d%n", r.nextInt());
    }

    public void sleep() {

    }

    public void name() {

    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        Dog other = (Dog)o;
        return this.size == other.size;
    }

    public void setName(String name) {
        this.name = name;
    }
}
