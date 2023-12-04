# Java-Assignment-010 - Classes and Objects

## Part 1 - Analyze
* Add Comments to the Code below and label the following:
  1. Class name
  2. All **instance variables/fields** and their data-types
  3. The **Constructor** and the **Constructor Parameters**
  4. Where a **Student** object gets created.
  5. Where the **instance variables** value gets set and what its values are.
  6. All the instance methods for the class **Student**

```java
class Student{ // class name.
    private String name; //instance variable: name, data type: String.
    private int rollNo; // instance variable: rollNo, data type: int.
   
    Student(String s, int r) // Constructor with parameters.
    {
   	    name = s; // Setting value for the instance variable 'name'.
   	    rollNo = r; // Setting value for the instance variable 'rollNo'.
    }
   
    void methodForDisplay() // Instance method for displaying student information.
    {
        System.out.println(name+"'s Roll No: "+rollNo);
    }

    public static void main(String[] args) {
        Student obj1=new Student("Rambo",21); // Creating a Student object with name "Rambo" and roll number 21.
      // Instance variables values are set here: name = "Rambo", rollNo = 21.
        obj1.methodForDisplay(); // Calling the instance method to display the student information.
    }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.

Answer: A static method means that it can be accessed without creating an object of the class. Public means it can only be accessed by objects. 
A static method is a method that belongs to a class, but it does not belong to an instance of that class and this method can be called without the instance or object of that class.
Every method in Java defaults to a non-static method without a static keyword preceding it. non-static methods can access any static method and static variable also, without using the object of the class.
In the non-static method, the method can access static data members and static methods as well as non-static members and methods of another class or the same class, unlike the static method that can only access static data members and static methods of another class or the same class. 

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
