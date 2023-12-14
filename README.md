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
class Student{ //the class name is Student
    private String name; //instance variable of type String
    private int rollNo; //instance variable of type int
   
    Student(String s, int r) //Constructor that takes a String s and an int r
    {
   	    name = s; 
   	    rollNo = r;
    }
   
    void methodForDisplay() //instance method for class Student
    {
        System.out.println(name+"'s Roll No: "+rollNo);
    }
//Main method for class Student
    public static void main(String[] args) {
      /*This is where the Student object gets created 
      & where the values are set  to "Rambo" and "21" 
      for the instance variables name and rollNo*/
        Student obj1=new Student("Rambo",21); 
        obj1.methodForDisplay();
    }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.
```
A Static method is related to the class and not to the instance of that class. It can be shared across all instances of the class.
Where as a public Method can be called upon from outside the class by other classes and objects.
```


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
