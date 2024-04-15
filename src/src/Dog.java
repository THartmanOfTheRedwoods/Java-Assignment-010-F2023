public class Dog{
        private String  size;
        private String color;
        private double age;
        private String breed;
        private int ran;

        public Dog (String breed, String size, String color, double age){
            this.size=size;
            this.color=color;
            this.breed=breed;
            this.age=age;
        }

        private String eat(){
            if(size.equalsIgnoreCase("large")){
                return "This large dog should eat about 3 to 4.5 cups of food per day.";
            }
            else if (size.equalsIgnoreCase("medium")){
                return "This medium sized dog should eat about 1.75 to 2.67 cups of food per day.";
            }
            else{
                return "This small sized dog should eat about 0.75 to 1.5 cups of food per day.";
            }

        }

        private String run(){
            this.ran=30;
            return "This dog needs to run/walk for at least "+ran+" minutes per day.";
        }

        //https://www.rover.com/blog/how-much-sleep-do-dogs-need/
    //
        private String sleep(){
            if (age<1){
                return "This dog is a puppy and should sleep for an average of 20 hours per day";
            }
            if(age<5 && age>1){
                return "A dog of age "+age+" should sleep for an average of 12 to 15 hours per day.";
            }
            else {
                return "This dog of age " + age + " should sleep for an average of 18 hours per day.";
            }
        }

        private String name(){
            return  "The breed of this dog is "+breed+" and of color "+color+".";
        }

        public String toString(){
            return name()+"\n"+sleep()+"\n"+eat()+"\n"+run();
        }

        public static void main(String[] args) {
            Dog dog1Object= new Dog("Bulldog", "large","light gray",5);
            Dog dog2Object= new Dog("Beagle","large","orange",6);
            Dog dog3Object= new Dog("German Shepard","large","white & orange",6);
            System.out.println(dog1Object);
            System.out.println("\n"+dog2Object);
            System.out.println("\n"+dog3Object);



        }
    }
