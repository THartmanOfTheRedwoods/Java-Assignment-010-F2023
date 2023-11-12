import java.lang.reflect.Array;
import java.util.ArrayList;
public class Food {
    private String food;
    //public static ArrayList<String> getDogs(){
        //Array.get(Dog.dogs, Dog.dogs.size());

    //}

    public String eat(String size) {
        for(Dog.dogs){
            if (size.equals("Small")){
                food = "1 cup of food";
            }if (size.equals("Medium")){
                food = "3 cups of food";
            }if (size.equals("Large")){
                food = "5 cups of food";
            }
        }
        return food;
    }
}
