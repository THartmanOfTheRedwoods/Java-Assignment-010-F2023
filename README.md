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
//Below is the class name
class Student{
    //Below are the instance variables name, type String and rollNo, type int.
    private String name;
    private int rollNo;
   
    //This is the constructor of the "Student", with parameters String s and int r.
    Student(String s, int r)
    {
   	    name = s;
   	    rollNo = r;
    }
   
    //This is where the instance method "methodForDisplay" is in the class "Student".
    void methodForDisplay()
    {
        System.out.println(name+"'s Roll No: "+rollNo);
    }

    public static void main(String[] args) {
        //This is where the Student object "obj1" is created. 
        Student obj1=new Student("Rambo",21); //In this line the instance variables name and rollNo are assigned to Rambo and 21
        obj1.methodForDisplay();//This line accesses the Student object "obj1" and calls "methodForDisplay()"
    }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.

* The difference between static and public methods is that one can be accessed from within other methods without having to create an object while the other requires a new object be made in order to access certain methods. In the first part of this readme, it was required to make a new object from the Student constructor in order to call the method methodForDisplay. If methodForDisplay was public or static, then the method could have been called in main by simply typing "methodForDisplay();".
* I think using objects tends to make more sense than making methods public so that way the values saved to certain objects from methods can belong to those objects and not be accessed from a public, static context.

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
