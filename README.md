# Java-Assignment-010 - Classes and Objects

## Part 1 - Analyze
* Add Comments to the Code below and label the following:
  1. Class name  - check 
  2. All **instance variables/fields** and their data-types - check 
  3. The **Constructor** and the **Constructor Parameters** - check 
  4. Where a **Student** object gets created. - check 
  5. Where the **instance variables** value gets set and what its values are. - check 
  6. All the instance methods for the class **Student** - check 

```java
class Student{  // the class is student 
    // Instance variables and their data types
    private String name; // string type variable for students name
    private int rollNo; // int type variable for student roll number
   // Constructor and parameters 
    Student(String s, int r)
    {
   	    name = s; // constructors parameters s gets assigned to instance variable name
   	    rollNo = r; // constructor parameter r gets assigned to instance variable rollNo
    }
   // instance method for displaying student info 
    void methodForDisplay()
    {
        System.out.println(name+"'s Roll No: "+rollNo);
    }
  // where student object gets created
    public static void main(String[] args) {
        Student obj1=new Student("Rambo",21); // where the instance variables value gets set and what the value is 
        obj1.methodForDisplay();
    }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.
- A static method does not need to use objects in relation to the class whereas public is in need of an object or it will compile an error. 
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
