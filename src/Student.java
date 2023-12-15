class Student {
    private String name;

    private int rollNo;

    Student(String s, int r) {

        name = s;
        rollNo = r;
    }

    void methodForDisplay() {
        // Printing out the student's name and roll number
        System.out.println(name+"'s Roll  "+rollNo);
    }
    public static void main(String[] args) {
        Student obj1 = new Student("Jesus", 21);
        obj1.methodForDisplay();
    }
}