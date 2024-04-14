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
class Student{ //class name
    private String name; //name of student
    private int rollNo; //roll number of student
   
  //constructor
    Student(String s, int r)
    {
   	    name = s;   //constructor parameters: String s (name)
   	    rollNo = r; //constructor parameters: int r (roll number)
    }
   
    void methodForDisplay() //instance method
    {
        System.out.println(name+"'s Roll No: "+rollNo);
    }

    public static void main(String[] args) { //Student object gets created
        Student obj1=new Student("Rambo",21); // object with name Rambo with roll number 21
        obj1.methodForDisplay(); //displays student's name and roll number
    }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.

The difference between static and public methods is that with a static method it is not necessary to make an object in the class in order to be accessed. With a public method, objects are necessary in order to be accessed. Static refers to the method that is defined for the class itself. Public refers to instances of a class. 

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
