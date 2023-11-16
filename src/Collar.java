import java.util.ArrayList;
public class Collar {

    private String name;

    public String getName() {
        String name = dogNames();
        System.out.printf("You inspect the collar and the name says: %s", name);
        return name;
    }

    public String dogNames(){
        ArrayList<String> breeds = Dog.dogArray();
        for (String name : breeds){
            if(breeds.equals("German Shepard")){
                name = "Winston";
            }if (breeds.equals("Beagle")){
                name = "Bugby";
            }if (breeds.equals("Bulldog")){
                name = "Crook";
            }
        }return name;
    }
}
