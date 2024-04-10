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
class Student{ // this is a class Student
    private String name; // this is declearation of a private instance variable name of type String. 
    private int rollNo; // this is declearation of a private instance variable rollno of type int
   
    Student(String s, int r) //this is a constructor for a class Student, it takes 02 parameters 
    {
   	    name = s; //name instance variable of the Student class is assigned the value of s
   	    rollNo = r;//rollNo instance variable of the Student class is assigned the value of r
    }
   
    void methodForDisplay()// this is a method that no reuturn a value just for displaying. 
    {
        System.out.println(name+"'s Roll No: "+rollNo); // this is to display the name and roll number of a Student to console 
    }

    public static void main(String[] args) {
        Student obj1=new Student("Rambo",21); //creates a new Student object named obj1 with the name "Rambo" and roll number 21
        obj1.methodForDisplay();////it calls the methodForDisplay method on this Student 
    }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.
* A public method is one that can be accessed from outside the class in which it is defined.
* A static method, on the other hand, belongs to the class itself rather than to any instance of the class.

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
