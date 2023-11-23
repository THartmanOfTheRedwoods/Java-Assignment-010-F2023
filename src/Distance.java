import java.util.ArrayList;

public class Distance {

    private String exercise;
    private int age;

    Distance(){
        age = Integer.parseInt(Dog.dogArray().get(age));
    }

    public String exercise(int age){
            if (age >= 10){
                exercise = "Roughly 1 and a half miles";
            }
            if (age >= 5 && age < 10){
                exercise = "An energetic 5 miles";
            }
            if (age > 1 && age < 5){
                exercise = "The most energetic 8 miles ever";
            }
        return exercise;
    }
}
