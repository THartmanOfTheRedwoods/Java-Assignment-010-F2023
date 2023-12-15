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
class Student{
    //Instance variables:
    //1. Name of the student (String)
    private String name;
    //2. roll number of the student (int)
    private int rollNo;
    
   // Constructor: Initializes the instance variables with provided values
  // Constructor Parameters:
  //1. s- Name of the student(String)
  //2. r- Roll number of the student(int)
    Student(String s, int r)
    {
        //Setting the value of 'name' instance variable
   	    name = s;
           //Setting the value of the 'rollNo' instance variable
   	    rollNo = r;
    }
   // Instance method: Display the student's name and roll number
    void methodForDisplay()
    {
        System.out.println(name+"'s Roll No: "+rollNo);
    }

    public static void main(String[] args) {
        //Creating a Student object called 'obj1' with name "Rambo" and roll number 21
        Student obj1=new Student("Rambo",21);
        // Calling the 'methodForDisplay' method on the 'obj1' object to display student information
        obj1.methodForDisplay();
    }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.

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
