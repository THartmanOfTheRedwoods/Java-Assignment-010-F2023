class Student { // Class name

    private String name; // Instance Variable/field
    private int rollNo; // Instance Variable/field

    Student(String s, int r) { // Constructor (+ constructor parameters)
        name = s; // instance variable gets value
        rollNo = r; // instance variable gets value
    }

    void methodForDisplay() { // instance method
        System.out.println(name+"'s Roll No: "+rollNo);
    }

    public static void main(String[] args) {
        Student obj1=new Student("Rambo",21); // Student object gets created
        obj1.methodForDisplay();
    }
}