# Java-Assignment-010 - Classes and Objects

## Part 1 - Analyze
* Add Comments to the Code below and label the following using comments:
  1. Class name
  2. All **instance variables/fields** and their data-types
  3. The **Constructor** and the **Constructor Parameters**
  4. Where a **Student** object gets created.
  5. Where the **instance variables** value gets set and what its values are.
  6. All the instance methods for the class **Student**

```java
class Student{ //class name: Student
    //Instance Variables/fields and data types
    private String name;// String type variable to store students name
    private int rollNo;// integer type variable to store student roll number
  
  //constructor and constructor parameters
  //constructor with parameters to initialize name and rollNo
    Student(String s, int r)
    {
   	    name = s; //set name to vale of paremeter s
   	    rollNo = r;// set rollNo to value of parameter r
    }
   //instance method for displaying students name and roll number
    void methodForDisplay()
    { //display student name and roll number
        System.out.println(name+"'s Roll No: "+rollNo);
    }
  //main method where student object is created
    public static void main(String[] args) {
        //create new student object named obj1 with name rambo and roll number 21
        Student obj1=new Student("Rambo",21);
        //call the methodForDisplay to display students name and roll number
        obj1.methodForDisplay();
    }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.
 - Simply put, Static methods can be accessed without creating an object of the class where public methods can only be accessed by objects.
 - Public methods define the behavior of the objects created from the class and can access instance variables and other instance methods of the class. 
 - Static methods belong to the class itself rather than a specific instance. 
## Part 3 - Dogs

* View the image below, and from the image, construct a Java file **Dog** that mirrors the diagrammed class and the 3 dog objects.
![Dog Class](images/ClassVSObject.png)

* Your class should be named **Dog**
* You should have **private** instance variables/fields for all the data members.
* You should have a **constructor** that sets the initial state of the data members via passed parameters.
    * Think about what data-types the fields and parameters will need!!!
* You should have 4 instance methods for eat, run, sleep, and name
* You should have a **main** method that creates the 3 Dog objects in the diagram.
* Make at least 2 of your methods functional (i.e. perform some action)!!!
    * For Example: method eat might take a class parameter named **Food** (i.e. another class) that has a field **weight**, and your eat method might reduce the weight in **Food**.

## Part 4 - Turn-In

* Create a feature branch Feature1
* Commit your code and push it back to your account.
* Create a Pull request as you have been doing for all assignments.
* Paste the Pull request URL back into the Canvass assignment page for credit.
