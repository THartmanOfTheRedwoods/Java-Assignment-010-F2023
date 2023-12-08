// Class name: Student
class Student {
    // Instance variables/fields:
    private String name; // Stores student's name
    private int rollNo; // Stores student's roll number

    // Constructor and the Constructor Parameters:
    // Constructor to initialize name and rollNo
    Student(String s, int r) {
        name = s; // Initialize 'name' with parameter 's'
        rollNo = r; // Initialize 'rollNo' with parameter 'r'
    }

    // Method to display student's name and roll number
    void methodForDisplay() {
        System.out.println(name + "'s Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        // Where a Student object gets created:
        Student obj1 = new Student("Rambo", 21); // Creating a Student object named 'obj1'

        // Where the instance variables' values get set and their values:
        // 'obj1' sets 'name' to "Rambo" and 'rollNo' to 21

        obj1.methodForDisplay(); // Calling method to display student's details
    }
}

