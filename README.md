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
//1. Class name
class Student{
    //2. All instance variables/fields and their data-types
    private String name; // Instance variable name of type String
    private int rollNo; // Instance variable rollNo of type int
   //3. The Constructor and the Constructor Parameters
    Student(String s, int r) //3. Constructor with parameters s and r
    {
        name = s; // Assigning value of s to name
        rollNo = r; // Assigning value of r to rollNo
    }
    { //5. Where the instance variables value gets set and what its values are.
   	    name = s; // Setting the value of name to s
   	    rollNo = r; // Setting the value of rollNo to r
    }
   //6. All the instance methods for the class Student
    void methodForDisplay() // Instance method methodForDisplay
    {
        System.out.println(name+"'s Roll No: "+rollNo); // Printing name and rollNo
    }
    {
        System.out.println(name+"'s Roll No: "+rollNo);
    }

    public static void main(String[] args) {
        //4. Where a Student object gets created.
        Student obj1=new Student("Rambo",21); // Creating object obj1 of class Student
        obj1.methodForDisplay(); // Calling method methodForDisplay
    }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.
 // Static methods are methods that belong to the class itself, and not to the object of the class. They can be called without creating an instance of the class. Public methods are methods that can be accessed by any other class. They are accessible from any other class, and can be called from any other class.
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
