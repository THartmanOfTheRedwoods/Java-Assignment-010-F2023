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
// Class name
class Student{
  // Instance variables/fields and their data-types
  private String name;
  private int rollNo;

  // Constructor and the Constructor Parameters
  Student(String s, int r)
  {
    name = s; // Setting the value of the name instance variable
    rollNo = r; // Setting the value of the rollNo instance variable
  }

  // Instance method for displaying student's name and roll number
  void methodForDisplay()
  {
    System.out.println(name+"'s Roll No: "+rollNo); // Displaying the name and roll number
  }

  public static void main(String[] args) {
    // Where a Student object gets created
    Student obj1=new Student("Rambo",21); // Creating a Student object named obj1

    // Where the instance variables value gets set and what its values are
    // The values are set in the constructor when the Student object is created
    // name = "Rambo" and rollNo = 21

    obj1.methodForDisplay(); // Calling the methodForDisplay() method to display the student's details
  }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.

Static methods are associated with the class itself rather than with instances of the class. They can be called directly using the class name, without needing to create an object of the class. Static methods are commonly used for utility functions or operations that do not require access to instance variables.

On the other hand, public methods are instance methods that are associated with individual objects or instances of the class. They can access instance variables and are typically called using an object of the class. Public methods define the behavior of objects and can modify the state of an object's instance variables.

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
