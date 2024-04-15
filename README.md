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
class Student{  // Class name: Student
  private String name;  // Instance variable: name (String)
  private int rollNo;   // Instance variable: rollNo (int)

  Student(String s, int r) {  // Constructor: Student
    name = s;  // Constructor parameter for name
    rollNo = r;  // Constructor parameter for rollNo
  }

  void methodForDisplay() {  // Instance method: methodForDisplay
    System.out.println(name+"'s Roll No: "+rollNo);  // Displaying name and rollNo
  }

  public static void main(String[] args) {
    Student obj1=new Student("Rambo",21);  // Creating a Student object (obj1) with name "Rambo" and rollNo 21
    obj1.methodForDisplay();  // Calling methodForDisplay for obj1
  }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.


Static methods are associated with the class itself and can be called using the class name, while public methods are accessible from outside the class and are typically used to define the behavior of objects and access their state.

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
