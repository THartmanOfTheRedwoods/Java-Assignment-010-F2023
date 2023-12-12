// Class name: Student
class Student {
    // Instance variable/field for the name of the student, data-type: String
    private String name;
    
    // Instance variable/field for the roll number of the student, data-type: int
    private int rollNo;
   
    // Constructor with parameters
    // Constructor parameters: String s (student name), int r (roll number)
    Student(String s, int r) {
        // Instance variables value set where 'name' gets the value of 's' and 'rollNo' gets the value of 'r'
        name = s;
        rollNo = r;
    }
   
    // Instance method for class Student
    void methodForDisplay() {
        // Printing out the student's name and roll number
        System.out.println(name+"'s Roll No: "+rollNo);
    }

    // The main method where a Student object gets created
    public static void main(String[] args) {
        // Creation of Student object with name "Rambo" and roll number 21
        Student obj1 = new Student("Rambo", 21);
        // Calling the instance method 'methodForDisplay' for the object 'obj1'
        obj1.methodForDisplay();
    }
}




