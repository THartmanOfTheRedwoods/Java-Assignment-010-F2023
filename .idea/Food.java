import java.util.ArrayList;
public class Food {
    public String food;
    public String eat(Dog[] dogs) {
        for(Dog d : dogs){
            if (d.getSize().equals("Small")){
                food = "1 cup of food";
            }if (d.getSize().equals("Medium")){
                food = "3 cups of food";
            }if (d.getSize().equals("Large")){
                food = "5 cups of food";
            }
        }
        return food;
    }
}
