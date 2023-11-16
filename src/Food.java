import java.util.ArrayList;
public class Food {
    private String food;
    public String eat() {
        ArrayList<String> retDogs = Dog.dogArray();
        for (String size : retDogs) {
            if (size.equals("Small")) {
                food = "1 cup of food";
            }
            if (size.equals("Medium")) {
                food = "3 cups of food";
            }
            if (size.equals("Large")) {
                food = "5 cups of food";
            }
        }
        return food;
    }
}
