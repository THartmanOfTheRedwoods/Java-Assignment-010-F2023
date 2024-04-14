//i. Class name
class Student {
    //ii. Instance variables/fields and their data-types
    private String name;
    private int rollNo;

    //iii. Constructor and the Constructor Parameters
    Student(String s, int r) {
        //v. Where the instance variables value gets set and what its values are
        name = s;
        rollNo = r;
    }

    //vi. All the instance methods for the class Student
    void methodForDisplay() {
        System.out.println(name + "'s Roll No: " + rollNo);
    }

    //iv. Where a Student object gets created
    public static void main(String[] args) {
        Student obj1 = new Student("Rambo", 21); //Student object creation
        obj1.methodForDisplay();
    }
}


